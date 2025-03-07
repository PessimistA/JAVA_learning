import java.util.Random;
import java.util.Scanner;

class password_maker{
	private String[] wordString={
			"a","b","c","ç","d","e","f","g","ğ","h","ı","i","j","k","l","m","n","o","ö","p","r","s","ş","t","u","ü","v","y","z",
			"A","B","C","Ç","D","E","F","G","Ğ","H","I","İ","J","K","L","M","N","O","Ö","P","R","S","Ş","T","U","Ü","V","Y","Z"
	};
	private String[] numbers= {
			"0","1","2","3","4","5","6","7","8","9"
	};
	private String[] characters= {
			",",";",":","-","|","/","%","!","^","+","%","&","\\"
	};
	private String passwordString="";
	private String[] all= new String[wordString.length + numbers.length + characters.length];
	
	public void password() {
		System.out.println("şifrenin kaç basamaklı olmasını istediğini seçiniz");
		Scanner scnScanner= new Scanner(System.in);
		int choose=scnScanner.nextInt();
		System.out.println("içinde harf olmasını istiyorsanız 1 istemiyorsanız 0 yazın");
		int forharf=scnScanner.nextInt();
		System.out.println("içinde sayı olmasını istiyorsanız 1 istemiyorsanız 0 yazın");
		int fornumber=scnScanner.nextInt();
		System.out.println("içinde karakter olmasını istiyorsanız 1 istemiyorsanız 0 yazın");
		int forkarakter=scnScanner.nextInt();
		
		Random rndRandom= new Random();

			int key= index(forharf, fornumber, forkarakter);
			switch (key) {
			case 0:
				System.out.println("hata lütfem doğru değerler giriniz");
				break;
			case 1:
				for (int i = 0; i < choose; i++) {
					passwordString += all[rndRandom.nextInt(all.length)];
				}
				
				break;
			case 2:
				for (int i = 0; i < choose; i++) {
					passwordString += all[rndRandom.nextInt(all.length)];
				}
				
				break;
			case 3:
				for (int i = 0; i < choose; i++) {
					passwordString += all[rndRandom.nextInt(all.length)];
				}
				
				break;
			case 4:
				System.arraycopy(wordString, 0,all, 0,wordString.length);
				System.arraycopy(numbers, 0,all, wordString.length,numbers.length);
				for (int i = 0; i < choose; i++) {
					passwordString += all[rndRandom.nextInt(all.length)];
				}
				break;
			case 5:
				System.arraycopy(wordString, 0,all, 0,wordString.length);
				System.arraycopy(characters, 0,all, wordString.length,characters.length);
				for (int i = 0; i < choose; i++) {
					passwordString += all[rndRandom.nextInt(all.length)];
				}
				break;
			case 6:
				System.arraycopy(characters, 0,all, 0,characters.length);
				System.arraycopy(numbers, 0,all, characters.length,numbers.length);
				for (int i = 0; i < choose; i++) {
					passwordString += all[rndRandom.nextInt(all.length)];
				}
				break;
			case 7:
				System.arraycopy(wordString, 0,all, 0,wordString.length);
				System.arraycopy(numbers, 0,all, wordString.length,numbers.length);
				System.arraycopy(characters, 0,all, wordString.length+numbers.length,characters.length);
				for (int i = 0; i < choose; i++) {
					passwordString += all[rndRandom.nextInt(all.length)];
				}
				break;
			default:
				break;
			}
			
		System.out.println("Şifre: "+passwordString);
	}
	
	private int index(int harf,int number,int karakter) {
	    if (harf==1&&number==0&&karakter==0) {
			return 1;
		}
		else if (harf==0&&number==1&&karakter==0) {
			return 2;
		}
		else if (harf==0&&number==0&&karakter==1) {
			return 3;
		}
		else if (harf==1&&number==1&&karakter==0) {
			return 4;
		}
		else if (harf==1&&number==0&&karakter==1) {
			return 5;
		}
		else if (harf==0&&number==1&&karakter==1) {
			return 6;
		}
		else if (harf==1&&number==1&&karakter==1) {
			return 7;
		}
		else {
			return 0;
		}
	}
	
}
public class Daily_Project4 {
	public static void main(String[] args) {
		password_maker psswMaker=new password_maker();
		psswMaker.password();
	}
}
