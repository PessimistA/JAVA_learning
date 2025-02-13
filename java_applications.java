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
		Scanner alinan = new Scanner(System.in);
		System.out.println("isminizi giriniz\n");
		String isim = alinan.nextLine();
		System.out.println("şifrenizi giriniz\n");
		String sifre = alinan.nextLine();
		kisi1.isim[kisi1.index]= isim;
		kisi1.şifre[kisi1.index]=sifre;
		kisi1.index++;
		
	}
	public static void giris_yap() {
		boolean d_y=true;
		Scanner alinan = new Scanner(System.in);
		while (d_y) {
			System.out.println("isminizi giriniz\n");
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
			System.out.println("şifrenizi giriniz\n");
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
