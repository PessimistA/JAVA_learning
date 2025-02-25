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
		//switch_case
		int sayı=2;
		switch (sayı) {
		case 1:
			System.out.println("cevap 1");
			break;
		case 2:
			System.out.println("cevap 2");
			break;

		default:
			break;
		}
		//for döngüsü
		for (int i = 0; i < number1; i++) {
			System.out.printf("sayı %d'dir \n",i);//%d ile kullanabiliriz
		}
		//while döngüsü
		while (number1>0) {
			number1--;
			System.out.printf("sayı %d'dir \n",number1);//%d ile kullanabiliriz
		}

				//diziler 
		int[] dizi = {1,2,3,4,5,6,7};
		for (int i = 0; i < dizi.length; i++) {
			int j = dizi[i];
			System.out.printf("%d\n", j);
		}
		int[] sayilar =new int[5];//burada boyutu vermelisin
		sayilar[1] = 1;
		sayilar[2] = 2;
		sayilar[3] = 3;
		sayilar[4] = 4;
		sayilar[0] = 5;
		without_main ornek = new without_main();//nesne oluşturmak
		ornek.nonstatic();//parametreyi buraya yaz int a gibi olan
		// geriye değer döndürüyorsa
		//int dönen_değer = ornek.nonstatic();
		
		
		//static ile olan
		static_one();// paramatre buraya yazılır
	}
	public void nonstatic() {
		System.out.println("bu senden nesne oluşturmanı ister");
		//mainde 
		//without_main ornek = new without_main();
		//ornek.nonstatic();
	}
	public static void static_one() {
		System.out.println("bu direk yazar");
	}
	
	
}
//
class songs{
	private String sng1,sng2,sng3;
	
	public songs(){
		this.sng2="DH";
		this.sng3= "M";
	}
	public songs(String sng2,String sng3){
		this.sng2= sng2;
		this.sng3= sng3;
	}
	public void start() {
		print();
	}
	private void print() {
		System.out.println(sng1);
		System.out.println(sng2);
		System.out.println(sng3);
	}
	public void setVariable(String sng) {
		this.sng1=sng;
	}
	public String getVariable(){
		return sng1;
	}
}

public class ForLesson {
	public static void main(String[] args) {
		songs obj1= new songs();
		obj1.start();
		songs obj2= new songs("E","RM");
		obj2.setVariable("hello");
		obj2.start();
	}
}
