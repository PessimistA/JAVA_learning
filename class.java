class kitap{
	String[] isim= new String[7];
	String[] yıl= new String[7];
	String[] sayfa= new String[7];
	int index=0;
	public void get_info() {
		Scanner alinan = new Scanner(System.in);
		System.out.println("lütfen yazarın adını giriniz");
		this.isim[index] = alinan.nextLine();
		System.out.println("lütfen yazılma yılını giriniz");
		this.yıl[index] = alinan.nextLine();
		System.out.println("lütfen sayfa sayısını giriniz");
		this.sayfa[index] = alinan.nextLine();
		this.index++;
	}
	public void bastir() {
		System.out.printf("ad\t yıl\t sayfa\t\n");
		for (int i = 0; i < 7; i++) {
			System.out.printf("%d)%s\t %s\t %s\t\n",i,isim[i],yıl[i],sayfa[i]);
		}
	}
}

class obs{
	String[] isim= new String[7];
	String[] numara= new String[7];
	notlar[] ogrenciNotlari = new notlar[7];//her öğrenciye kendi notu atanabilir böylelikle
	static class notlar{
		int vize ;
		int Final;
		double ortalama;
		public void get_info() {
			Scanner alinan = new Scanner(System.in);
			System.out.println("lütfen vize notunu giriniz");
			this.vize = alinan.nextInt();
			System.out.println("lütfen final giriniz");
			this.Final = alinan.nextInt();
		}
		public void calculate() {
			ortalama = (vize*0.6)+(Final*0.4);
		}
	}
	
	int index=0;
	public void get_info() {
		Scanner alinan = new Scanner(System.in);
		System.out.println("lütfen adını giriniz");
		this.isim[index] = alinan.nextLine();
		System.out.println("lütfen numarasını giriniz");
		this.numara[index] = alinan.nextLine();
		
		ogrenciNotlari[index] = new notlar();
		
		ogrenciNotlari[index].get_info();
		ogrenciNotlari[index].calculate();
		this.index++;
	}
	public void bastir() {
		System.out.printf("isim\t numara\t vize\t final\t ortalama\t\n");
		for (int i = 0; i < index; i++) {
			System.out.printf("%d)%s\t %s\t %d\t %d\t %.2f\t \n",i,isim[i],numara[i],ogrenciNotlari[i].vize,ogrenciNotlari[i].Final,ogrenciNotlari[i].ortalama);
		}
	}
}
public class without_main {
	
	public static void main(String[] args) {
		//book();
		Obs();
	}
	public static void book() {
		kitap book= new kitap(); 
		Scanner alinan = new Scanner(System.in);
		System.out.println("kaç tane kitap girmek istiyorsunuz");
		int sayı = alinan.nextInt();
		for (int i = 0; i < sayı; i++) {
			book.get_info();
			
		}
		book.bastir();
	}
	public static void Obs() {
		obs sistem= new obs(); 
		Scanner alinan = new Scanner(System.in);
		System.out.println("kaç tane öğrenci girmek istiyorsunuz");
		int sayı = alinan.nextInt();
		for (int i = 0; i < sayı; i++) {
			sistem.get_info();
			
		}
		sistem.bastir();
	}
}
