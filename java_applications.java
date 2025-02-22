//banka uygulaması
public class without_main {
	
	public static void main(String[] args) {
		int bakiye=0;
		boolean op=true;
		while (op) {
			menu();
			Scanner alinan = new Scanner(System.in);
			String key= alinan.nextLine();
			switch (key) {
			case "1":
				bakiye_goruntuleme(bakiye);
				System.out.println(" ");
				break;
			case "2":
				bakiye=para_cekmek(bakiye);
				System.out.println(" ");
				break;
			case "3":
				bakiye= para_yatırmak(bakiye);
				System.out.println(" ");
				break;
			case "q":
				System.out.println("Esenlikler dileriz:");
				op=false;
				break;

			default:
				System.out.println("hatalı giriş yaptınız tekrar deneyiniz lütfen");
				break;
			}	
		}
	}
	public static void menu() {
		System.out.println("bakiye görüntülemek için-->1\n");
		System.out.println("para çekmek için-->2\n");
		System.out.println("farklı hesaptan para yatırmak için-->3\n");
		System.out.println("çıkmak için-->'q'\n");
	}
	public static void bakiye_goruntuleme(int bakiye) {
		if (bakiye>0) {
			System.out.printf("%d lira paranız bulunmakta",bakiye);
		}
		else {
			System.out.printf("Görüntülenecek para bulunmamıştır");
		}
	}
	public static int para_cekmek(int bakiye) {
		if (bakiye>0) {
			System.out.printf("lütfen çekilecek paranın miktarını giriniz: ");
			Scanner alinan = new Scanner(System.in);
			int cekilen_para= alinan.nextInt();//dikkat int için farklı
			if (cekilen_para<bakiye) {
				int son = bakiye- cekilen_para;
				return son;
			} else {
				System.out.printf("yeterli para bulunmamıştır");
				return bakiye;
			}

		} else {
			System.out.printf("yeterli para bulunmamıştır");
			return bakiye;
		}

		
	}
	public static int para_yatırmak(int bakiye) {
		System.out.printf("lütfen yatırılacak paranın miktarını giriniz: ");
		Scanner alinan = new Scanner(System.in);
		int yatırılan_para= alinan.nextInt();//dikkat int için farklı
		int son = bakiye+ yatırılan_para;
		return son;
	}	
}





//giriş ekranı
class kisi{
	String[] isim= new String[6];
	String[] şifre= new String[6];
	int index=0;
}

public class without_main {
	static kisi kisi1 = new kisi();
	public static void main(String[] args) {
		calıstır();
	}
	public static void calıstır() {
		boolean op=true;
		while (op) {
			menu();
			Scanner alinan = new Scanner(System.in);
			String key= alinan.nextLine();
			switch (key) {
			case "1":
				uye_ol();
				System.out.println(" ");
				break;
			case "2":
				giris_yap();
				System.out.println(" ");
				op = false;
				break;
			case "q":
				System.out.println("Esenlikler dileriz:");
				op=false;
				break;

			default:
				System.out.println("hatalı giriş yaptınız tekrar deneyiniz lütfen");
				break;
			}	
		}
	}
	public static void menu() {
		System.out.println("üye ol-->1\n");
		System.out.println("\n");
		System.out.println("giriş yap-->2\n");
		System.out.println("çıkmak için-->'q'\n");
		
		
	}
	public static void uye_ol() {
		boolean d_y=true;
		Scanner alinan = new Scanner(System.in);
		while (d_y) {
			System.out.println("isminizi giriniz\n");
			String isim = alinan.nextLine();
			
			int kullaniciIndex = -1;
			for (int i=0; i <6; i++) {
				if (isim.equals(kisi1.isim[i]) ) {
					kullaniciIndex= i;
					break;
				}
			}
			if (kullaniciIndex==-1) {
				System.out.println("şifrenizi giriniz\n");
				String sifre = alinan.nextLine();
				kisi1.isim[kisi1.index]= isim;
				kisi1.şifre[kisi1.index]=sifre;
				kisi1.index++;
				d_y = false;
			}
			else {
				System.out.println("bu kişi zaten bulunmakta yeni kişi eklemeyi deneyin");
			}
			
		}

		
	}
	public static void giris_yap() {
		boolean d_y=true;
		Scanner alinan = new Scanner(System.in);
		while (d_y) {
			System.out.println("giriş yapmak için isminizi giriniz\n");
			String isim = alinan.nextLine();
			int i=0;
			int kullaniciIndex = -1;
			for (; i <6; i++) {
				if (isim.equals(kisi1.isim[i]) ) {
					kullaniciIndex= i;
					break;
				}
			}
			if (kullaniciIndex==-1) {
				System.out.println("böyle bir kullanıcı bulunmadı");
				System.out.println("lütfen üye ol kısmından üye olunuz");
				calıstır();
				return;
			}
			System.out.println("giriş yapmak için şifrenizi giriniz\n");
			Boolean d_y2=true;
			for (int j = 3; j > 0; j--) {
				String sifre = alinan.nextLine();
				if (sifre.equals(kisi1.şifre[kullaniciIndex])) {
					System.out.println("hoş geldiniz");
					d_y = false;
					d_y2=true;
					break;
				}
				else {
					System.out.printf("hatalı giriş yaptınız kalan hakkınız %d:",j-1);
					d_y2 = false;
				}
			}
			if (d_y2==false) {
				System.out.println("\ndeneme hakkınız bitmiştir");
				d_y =false;
				return;
			}
		}

	}

}
//basic hash_crack
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
		hashstString= scnScanner.nextLine().trim();
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
