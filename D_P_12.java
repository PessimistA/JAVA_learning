
class write_name{
	private String birler[] = {"zero",
			"bir","iki","üç","dört","beş","altı","yedi","sekiz","dokuz"
	};
	private String onlar[] = {"",
			"on","yirmi","otuz","kırk","elli","altmış","yetmiş","seksen","doksan"
	};
	private String yüzler[] = {"",
			"yüz",
	};
	private int number;
	public write_name(int number) {
		this.number = number;
		String nameString="";
		if (number>100 &&number<999) {
			nameString= divide3();
		}
		else if(number>10 &&number<99) {
			nameString=divide2();
		}
		else if(number>=0 &&number<9) {
			nameString=divide1();
		}
		System.out.println(nameString);
	}
	private String divide3() {
		int yüzdelik = number/100;
		int ondalık=number-(yüzdelik*100) ;
		ondalık = ondalık /10;
		int birler1 = number -(yüzdelik*100) -(ondalık*10);
		String nameString = yüzler[yüzdelik]+" "+onlar[ondalık]+" "+birler[birler1]; 
		return nameString;
	}
	private String divide2() {
		int ondalık=number/10 ;
		int birler1 = number-(ondalık*10);
		String nameString = onlar[ondalık]+" "+birler[birler1]; 
		return nameString;
	}
	private String divide1() {

		int birler1 = number;
		String nameString = birler[birler1]; 
		return nameString;
	}
}

public class numbers {
	public static void main(String[] args) {
		write_name wrt= new write_name(85);	
	}
}
