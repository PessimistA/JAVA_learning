package cyber;

import java.awt.Event;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.lang.classfile.instruction.SwitchCase;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.MessageDigest;
import java.util.Scanner;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class nmap_part{
	static void start() {
		//scan();
	}
	static void scan() {
		System.out.println("Please enter the IP");
		Scanner scan1= new Scanner(System.in);
		String target= scan1.nextLine() ;
		int startport=1;
		int lastport=1024;
		
		ExecutorService executor = Executors.newFixedThreadPool(50);//daha fazla thread daha hızlı
		System.out.println("Açık portlar: ");
		for (int port =startport; port <=lastport; port++) {
            final int currentPort = port;
			executor.execute(()->port_scan(target, currentPort));;	
		}
        executor.shutdown();
        
		ExecutorService executor2 = Executors.newFixedThreadPool(50);//daha fazla thread daha hızlı
		System.out.println("Banner Bilgileri: ");
		for (int port =startport; port <=lastport; port++) {
            final int currentPort = port;
			executor2.execute(()->banner_grabing(target, currentPort));;	
		}
        executor2.shutdown();
        
        try {
            if (!executor.awaitTermination(60, TimeUnit.SECONDS)) {//timeout süresi
                executor.shutdownNow();
            }
        } catch (Exception e) {
            executor.shutdownNow();
        }
        scan1.close();
	}
	
	static void port_scan(String ip,int port) {
		try {
			Socket socket = new Socket(ip, port);
	        socket.connect(new InetSocketAddress(ip, port), 200);//timeout süresi bunu değiştşirebilirsin 
            System.out.println("-Port " + port + " is open");
            socket.close();
			
		} catch (Exception e) {
			// TODO: handle exception
			//System.out.println("Hata "+ e.getMessage());
			
		}
	}
	static void banner_grabing(String ip,int port) {
		try {
			Socket socket = new Socket(ip, port);
			if (port==80||port==443) {//istek oluşturur
				banner_http(socket, ip);
			}
			if (port==22||port==21||port==23||port==25||port==110||port==143||port==194) {//otomatik olarak banner döner
				System.out.printf("banner %d portundan: ",port);
				banner_ssh_ftp_smtp_pop3_imap_irc(socket, ip);
				System.out.printf("\n");
			}
			
			
			socket.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	static void banner_http(Socket socket,String ip) {
		try {
			BufferedReader buffer= new BufferedReader(new InputStreamReader(socket.getInputStream()));//veri okumak
			
			//veri göndermek için bu kısmı kullanıyoruz
			OutputStream out= socket.getOutputStream();
			//http için özel istek
            out.write(("HEAD / HTTP/1.1\r\nHost: " + ip + "\r\n\r\n").getBytes());//bunu göndeririz
            out.flush();//hemen gönderilmesini sağlar
            
            System.out.println("banner http/s: ");
            String bannerString=buffer.readLine();//dönen banner buffer ile alınır ve boş değilse basılır
            if (bannerString!=null) {
				System.out.println(bannerString);
			}
		} catch (Exception e) {
			// TODO: handle exception
			
		}
	}
	static void banner_ssh_ftp_smtp_pop3_imap_irc(Socket socket,String ip) {
		try {
			BufferedReader buffer= new BufferedReader(new InputStreamReader(socket.getInputStream()));
            
            String bannerString=buffer.readLine();//dönen banner buffer ile alınır ve boş değilse basılır
            if (bannerString!=null) {
				System.out.println(bannerString);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}


class hash_crack{
	static String hashstString;
	static String fileString="";
	static String typeString="";
	static void took() {
		Scanner scnScanner= new Scanner(System.in);
		System.out.println("please enter the hashString:");
		hashstString= scnScanner.nextLine();
		System.out.println("please enter the file location:");
		fileString= scnScanner.nextLine();
		System.out.println("please enter the type of the hash:");
		typeString= scnScanner.nextLine().trim();
		if (hashstString==null) {
			start_without_type();
		}
		else {
			start_with_type();
		}
		
	}
	
	static void start_with_type() {
		try {
			BufferedReader bfReader= new BufferedReader(new FileReader(fileString));
			String line;
			while ((line=bfReader.readLine())!=null) {
				if (cracker(line).equals(hashstString)) {
					System.out.println("Answer: "+line);
					bfReader.close();
					return;
				}	
			}
			System.out.println("Answer is not found ");
			bfReader.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	static String cracker(String line) {
		try {
			MessageDigest mDigest= MessageDigest.getInstance(typeString.toUpperCase());	
			mDigest.update(line.getBytes());
		    byte[] digest = mDigest.digest();//md5 byte sonucudur burası
			StringBuilder str= new StringBuilder();
	        for (byte b : digest) {//digest dizisindeki her elamanı buraya atar
	            str.append(String.format("%02x", b));//hexa formuna çevirir
	        }
	        return str.toString();
			
		} catch (Exception e) {
			// TODO: handle exception
			throw new RuntimeException(e);
		}
	}
	static void start_without_type() {
		try {
			BufferedReader bfReader= new BufferedReader(new FileReader(fileString));
			String line;
			while ((line=bfReader.readLine())!=null) {
				if (cracker2(line).equals(hashstString)) {
					System.out.println("Answer: "+line);
					bfReader.close();
					return;
				}	
			}
			System.out.println("Answer is not found ");
			bfReader.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	static String cracker2(String line) {
		try {
			int length= hashstString.length();
			switch (length) {
			case 32:
				typeString= "MD5";
				break;
			case 40:
				typeString= "SHA-1";
				break;
			case 64:
				typeString= "Sha-256";
				break;
			case 128:
				typeString= "SHA-512";
				break;
			default:
				break;
			}
			MessageDigest mDigest= MessageDigest.getInstance(typeString);	
			mDigest.update(line.getBytes());
		    byte[] digest = mDigest.digest();//md5 byte sonucudur burası
			StringBuilder str= new StringBuilder();
	        for (byte b : digest) {//digest dizisindeki her elamanı buraya atar
	            str.append(String.format("%02x", b));//hexa formuna çevirir
	        }
	        return str.toString();
			
		} catch (Exception e) {
			// TODO: handle exception
			throw new RuntimeException(e);
		}
	}
	
}
 
class hash_maker{
	static String stString;
	static String typeString="";
	static void took() {
		Scanner scnScanner= new Scanner(System.in);
		System.out.println("please enter the String:");
		stString= scnScanner.nextLine();
		System.out.println("please enter the type of the hash:");
		typeString= scnScanner.nextLine().trim();
		scnScanner.close();
		
	}
	static void hash() {
		try {
			
			MessageDigest mDigest= MessageDigest.getInstance(typeString.toUpperCase());	
			mDigest.update(stString.getBytes());
		    byte[] digest = mDigest.digest();//md5 byte sonucudur burası
			StringBuilder str= new StringBuilder();
	        for (byte b : digest) {//digest dizisindeki her elamanı buraya atar
	            str.append(String.format("%02x", b));//hexa formuna çevirir
	        }
	        System.out.printf("%s",stString+":"+str+"\n");
			
		} catch (Exception e) {
			// TODO: handle exception
			throw new RuntimeException(e);
		}
	}
	
}

public class nmap {
	public static void main(String[] args) {

	}
}
