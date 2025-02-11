import java.util.Scanner;

public class without_main {
	
	public static void main(String[] args) {
		int number1= 12;
		int number2 = 24;
		number1++;//arttırma azaltma işlemleri
		int toplam = number1 +number2;
		System.out.println(toplam);
		System.out.println("toplam"+" "+ toplam);
		
		String word1 = "hello";//string ataması yapılabilir
		char harf1 = 'a';
		int deger = (int)harf1;//tür değişimi
		String word2 = "world";
		System.out.println(word1 +" "+ word2);
		System.out.println(harf1);
		System.out.println(deger);
		
		//input alımı
		Scanner alinan= new Scanner(System.in);
		System.out.println("lütfen isim giriniz");
		String isim = alinan.nextLine();
		System.out.println("lütfen soyisim giriniz");
		String soyisim = alinan.nextLine();
		System.out.println(isim+" "+soyisim);
		
		//koşul blokları
		if (number1>number2) {
			System.out.println("ilki doğrudur");
		}
		else {
			System.out.println("else bloğu doğrudur");
		}
	}
	
}
