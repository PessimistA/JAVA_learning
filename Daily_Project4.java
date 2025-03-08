import java.util.Scanner;

class market{
	int[] appleString;
	int[] orangeString;
	int[] milkString;
	int[] teaString;
	int[] coffeString;
	int[] pearString;
	int[] chipsString;
	
	int[] tablet;
	int[] computer;
	int[] phone;
	int[] watch;
	int[] glasses;
	private int money=58123;
	private void attemp() {
		this.appleString = new int[2];  // 2 elemanlı bir dizi
		this.orangeString = new int[2];
		this.pearString = new int[2];
		this.coffeString = new int[2];
		this.teaString = new int[2];
		this.chipsString = new int[2];

		this.computer = new int[2];
		this.tablet = new int[2];
		this.phone = new int[2];
		this.watch = new int[2];
		this.glasses = new int[2];

		
		this.appleString[0] = 4;
		this.orangeString[0]= 2;
		this.pearString[0] =1;
		this.coffeString[0] = 6;
		this.teaString[0] = 8;
		this.chipsString[0] =7;
		
		this.appleString[1] = 14;
		this.orangeString[1]= 22;
		this.pearString[1] =12;
		this.coffeString[1] = 64;
		this.teaString[1] = 81;
		this.chipsString[1] =76;
		
		this.computer[0]= 5;
		this.tablet[0]= 2;
		this.watch[0]= 5;
		this.glasses[0]=9;
		this.phone[0]=6;
		
		this.computer[1]= 5123;
		this.tablet[1]= 2422;
		this.watch[1]= 512;
		this.glasses[1]=49;
		this.phone[1]=612;
	}
	public void start() {
		boolean condition= true;
		attemp();
		Scanner scnScanner= new Scanner(System.in);
		while (condition) {
			System.out.println("lütfen yapmak istediğiniz işlemi seçiniz");
			System.out.println("1)yiyecekleri görüntüle");
			System.out.println("2)eşyaları görüntüle");
			System.out.println("3)cüzdanımı görüntüle görüntüle");
			System.out.println("4)bir şeyler al");
			System.out.println("q ile çıkış yap");
			String key= scnScanner.nextLine();
			
			switch (key) {
			case "1":
				Foods_show();
				break;
			case "2":
				products_show();
				break;

			case "3":
				wallet(0);
				break;
			case "4":
				buy();
				break;
				
			case "q":
				System.out.println("Görüşmek üzere");
				condition=false;
				break;

			default:
				break;
			}
		}


	}
	private void Foods(int food,int count) {
		switch (food) {
		case 1:
			if(wallet(count*appleString[1])) {
				appleString[0]=appleString[0]-count;
			}
			break;
		case 2:
			if(wallet(count*orangeString[1])) {
				orangeString[0]=orangeString[0]-count;
			}
			break;
		case 3:
			if(wallet(count*pearString[1])) {
				pearString[0]=pearString[0]-count;
			}
			break;
		case 4:
			if(wallet((count*coffeString[1]))) {
				coffeString[0]=coffeString[0]-count;
			}
			break;
		case 5:
			if(wallet((count*teaString[1]))) {
				teaString[0]=teaString[0]-count;
			}
			break;
		case 6:
			if(wallet((count*chipsString[1]))) {
				chipsString[0]=chipsString[0]-count;
			}
			break;
		default:
			break;
		}
		
	}
	private void Foods_show() {
		System.out.printf("yiyecek\tmiktar\tfiyat\n");
		System.out.printf("1)Elma\t%d\t%d\n",appleString[0],appleString[1]);
		System.out.printf("2)Portakal\t%d\t%d\n",orangeString[0],orangeString[1]);
		System.out.printf("3)Armut\t%d\t%d\n",pearString[0],pearString[1]);
		System.out.printf("4)Kahve\t%d\t%d\n",coffeString[0],coffeString[1]);
		System.out.printf("5)Çay\t%d\t%d\n",teaString[0],teaString[1]);
		System.out.printf("6)Cips\t%d\t%d\n",chipsString[0],chipsString[1]);
		System.out.println(" ");
		
	}
	private void products(int product,int count) {
		switch (product) {
		case 1:
			if(wallet(count*computer[1])) {
				computer[0]=computer[0]-count;
			}

			break;
		case 2:
			if(wallet(count*phone[1])) {
				phone[0]=phone[0]-count;
			}

			break;
		case 3:
			if(wallet(count*tablet[1])) {
				tablet[0]=tablet[0]-count;
			}

			break;
		case 4:
			if(wallet(count*watch[1])) {
				watch[0]=watch[0]-count;
			}
	
			break;
		case 5:
			if(wallet(count*glasses[1])) {
				glasses[0]=glasses[0]-count;
			}

			break;
		default:
			break;
		}
	}
	private void products_show() {
		System.out.printf("ürün\tmiktar\tfiyat\n");
		System.out.printf("1)Bilgisayar\t%d\t%d\n",computer[0],computer[1]);
		System.out.printf("2)Telefon\t%d\t%d\n",phone[0],phone[1]);
		System.out.printf("3)Tablet\t%d\t%d\n",tablet[0],tablet[1]);
		System.out.printf("4)Saat\t%d\t%d\n",watch[0],watch[1]);
		System.out.printf("5)Gözlük\t%d\t%d\n",glasses[0],glasses[1]);
		System.out.println(" ");
	}
	private boolean wallet(int harcama) {
		if (harcama>money) {
			System.out.println("buna paranız yetmemektedir");
			return false;
		}
		else {
			money= money -harcama;
			System.out.println("Cüzdandaki paramız: "+money);
			System.out.println(" ");	
			return true;
		}
	}
	private void buy() {
		boolean condition= true;
		Scanner scnScanner= new Scanner(System.in);
		while (condition) {
			System.out.println("lütfen yiyecek alacaksınız 1 i eşya alacaksınız 2 yi seçiniz");
			int seçim=scnScanner.nextInt();
			if (seçim==1) {
				System.out.println("lütfen alacağınızın yiyeceğin miktarını giriniz");
				int miktar=scnScanner.nextInt();
				System.out.println("lütfen alacağınızın yiyeceğin kodunu giriniz");
				int ürün=scnScanner.nextInt();
				Foods(ürün, miktar);
			}
			else if(seçim==0) {
				System.out.println("lütfen alacağınızın eşyanın miktarını giriniz");
				int miktar=scnScanner.nextInt();
				System.out.println("lütfen alacağınızın eşyanın kodunu giriniz");
				int ürün=scnScanner.nextInt();
				products(ürün, miktar);
			}
			else {
				System.out.println("bir hata yaptınız tekrar giriniz");
			}
		
		}
		
	}
}

public class daily_project3 {
	public static void main(String[] args) {
		market mrkMarket= new market();
		mrkMarket.start();
	}
}
