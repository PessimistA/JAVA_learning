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
