package first_one_dude;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

class get_names{
	private String numberString;
	private String name_surnameString;
	public String getnumber() {
		return numberString;
	}
	public String getname() {
		return name_surnameString;
	}
	public void get_all() {
		System.out.println("Please enter the name");
		Scanner scnScanner=new Scanner(System.in);
		this.name_surnameString=scnScanner.nextLine();
		System.out.println("Please enter the number");
		this.numberString=scnScanner.nextLine();
	}
}
class iletici{
	private String numberString;
	private String name_surnameString;
	private String file_name;
	private int count=0;
	
	private void addperson(get_names get) {
		this.numberString= get.getnumber();
		this.name_surnameString= get.getname();
		add_file();
	}
	
	public void start(get_names get) {
		boolean tek=true;
		while (tek) {
			System.out.println("lütfen yapmak istediğiniz işi seçiniz");
			System.out.println("1)yeni kişi ekle");
			System.out.println("2)Olan kişinin yerini/bilgilerini döndür");
			System.out.println("çıkmak için q ya basınız ");
			Scanner scnScanner=new Scanner(System.in);
			char choose= scnScanner.nextLine().charAt(0);
			switch (choose) {
			case '1':
				get.get_all();
				addperson(get);
				break;
			case '2':
				System.out.println("lütfen aradığınız isimi giriniz:");
				String name= scnScanner.nextLine();
				found(name);
				break;
			case 'q':
				tek=false;
				break;
			default:
				break;
			}
		}
	}

	private void add_file() {
		System.out.println("dosyanın ismini giriniz");
		Scanner scnScanner=new Scanner(System.in);
		file_name= scnScanner.nextLine(); 
		try {
			BufferedWriter bfWriter= new BufferedWriter(new FileWriter(file_name+".txt",true));
			count= get_count();
			if (count==0) {
				bfWriter.write(count+") "+name_surnameString+"\t"+numberString+"\n");
				System.out.println("başarıyla kaydedildi");
				bfWriter.close();	
			} else {
				bfWriter.write(count+") "+name_surnameString+"\t"+numberString+"\n");
				System.out.println("başarıyla kaydedildi");
				bfWriter.close();	
			}

		} catch (Exception e) {
			// TODO: handle exception
			e.getMessage();
		}
	}
	private int get_count() {
		try {
			BufferedReader bfReader= new BufferedReader(new FileReader(file_name+".txt"));
			String lineString=null;
			String line=null;
			while((line=bfReader.readLine())!=null) {
				lineString= line;
			}
			int count1=(int)lineString.charAt(0)-48;
			bfReader.close();
			count1++;
			return count1;	
		} catch (Exception e) {
			e.getMessage();
			// TODO: handle exception
			return 0;
		}
	}
	private void found(String search_one) {
		try{
			System.out.println("dosyanın ismini giriniz");
			Scanner scnScanner=new Scanner(System.in);
			file_name= scnScanner.nextLine(); 
			BufferedReader bfReader = new BufferedReader(new FileReader(file_name + ".txt"));
            String line;
            while ((line = bfReader.readLine()) != null) {
                String[] parts = line.split("\\s+");
                if (parts[1].trim().equals(search_one)) {
                        System.out.printf("Line: %s\nName: %s\nNumber: %s\n", parts[0], parts[1], parts[2]);
                    }                
            }
            bfReader.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.getMessage();

		}
	}
}

public class daily_project2 {
	public static void main(String[] args) {
		get_names get= new get_names();
		iletici ilet = new iletici();
		ilet.start(get);
	}
}
