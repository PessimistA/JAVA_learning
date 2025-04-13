package exam_work5;

import java.security.PublicKey;

class dikdortgen {
	private int kenar1;
	private int kenar2;

	public dikdortgen(int kenar1, int kenar2) {
		setKenar1(kenar1);
		setKenar2(kenar2);
	}

	public int getKenar1() {
		return kenar1;
	}

	public void setKenar1(int kenar1) {
		this.kenar1 = kenar1;
	}

	public int getKenar2() {
		return kenar2;
	}

	public void setKenar2(int kenar2) {
		this.kenar2 = kenar2;
	}

	public int cevre() {
		return 2 * (kenar1 + kenar2);
	}

	public int alan() {
		return kenar1 * kenar2;
	}

	public void bastir(int a) {
		System.out.println("kenar1: " + kenar1);// kenar1 de getkenar1 de aynı şeyi bastırır aşağıdan çağırırsam da
		System.out.println("kenar2: " + kenar2);
		System.out.println("çevre: " + cevre());
		System.out.println("alan: " + alan());
	}

	public String ozellikler() {
		return String.format("kenar1: " + kenar1 + "\n" + "kenar2: " + kenar2 + "\n", "çevre: ", cevre(), "\n",
				"alan: ", alan());// string de , koy ama sysout da koyulmaz
	}// , koyduğun kısımlar basılmaz + koyduğun yerler basılır

}

class ucgen {
	private int kenar1;
	private int kenar2;
	private int kenar3;
	private double cevre;

	public int getKenar1() {
		return kenar1;
	}

	public void setKenar1(int kenar1) {
		this.kenar1 = kenar1;
	}

	public int getKenar2() {
		return kenar2;
	}

	public void setKenar2(int kenar2) {
		this.kenar2 = kenar2;
	}

	public int getKenar3() {
		return kenar3;
	}

	public void setKenar3(int kenar3) {
		this.kenar3 = kenar3;
	}

	public ucgen(int kenar1, int kenar2, int kenar3) {
		this.kenar1 = kenar1;
		this.kenar2 = kenar2;
		this.kenar3 = kenar3;
		atama();
	}

	private void atama() {
		if ((kenar1 == kenar2 && kenar1 != kenar3) || (kenar1 == kenar3 && kenar1 != kenar2)
				|| (kenar2 == kenar3 && kenar2 != kenar1)) {
			if (kenar1 == kenar2) {
				ikizkenar(kenar1, kenar3);
			}
			if (kenar2 == kenar3) {
				ikizkenar(kenar2, kenar1);
			}
			if (kenar1 == kenar3) {
				ikizkenar(kenar1, kenar2);
			}
		} else if (kenar1 == kenar2 && kenar2 == kenar3) {
			eskenar();
		} else {
			cesitkenar();
		}
	}

	private void ikizkenar(int kenar, int kenardif) {
		this.cevre = (kenar * 2) + kenar3;
	}

	private void eskenar() {
		this.cevre = kenar1 * 3;
	}

	private void cesitkenar() {
		this.cevre = kenar1 + kenar2 + kenar3;
	}

	@Override
	public String toString() {
		return "ucgen [kenar1=" + kenar1 + ", kenar2=" + kenar2 + ", kenar3=" + kenar3 + ", cevre=" + cevre + "]";
	}

}

class kare extends dikdortgen {
	private int kosegen;

	public kare(int kenar1) {
		super(kenar1, kenar1);
		kosegenCount();
	}

	@Override
	public void bastir(int b) {
		super.bastir((int) b);
		System.out.println("kosegen sayısı: " + getKosegen());

	}

	@Override
	public String ozellikler() {
		return super.ozellikler() + String.format("kosegen sayısı: " + getKosegen() + "\n");
	}

	public int getKosegen() {
		return kosegen;
	}

	public void setKosegen(int kosegen) {
		this.kosegen = kosegen;
	}

	public void kosegenCount() {
		int a = 2;
		setKosegen(a);
	}
}

class daire {
	private static final float pi = 3.14f;
	private int r;
	static {
		System.out.println("daire oluşturuldu");
	}

	public daire() {
		this.r = 4;
	}

	public daire(int r) {
		this.r = 5;
	}

	public daire(double r) {
		this.r = 6;
	}

	public daire(float r) {
		this.r = 7;
	}

	public float cevre() {
		return 2 * pi * r;
	}

	public double alan() {
		return pi * r * r;
	}

	public String toString() {
		return String.format("r: " + r + "\n" + "alan: " + alan() + "\n" + "çevre: " + cevre() + "\n");
	}
}

public class example4 {
	public static void main(String[] args) {
		kare myKare = new kare(12);
		myKare.bastir(2);
		System.out.println(myKare.ozellikler());
		System.out.println(myKare.toString());// exam_work5.kare@3e3abc88

		daire myDaire = new daire();
		System.out.println(myDaire.toString());
		daire myDaire2 = new daire(3);// 3 girdiğimden dolayı int attı ve r yi 5 aldı
		System.out.println(myDaire2.toString());
		daire myDaire3 = new daire(3.15);// double aldı
		System.out.println(myDaire3.toString());
		daire myDaire4 = new daire(3.15f);// float aldı
		System.out.println(myDaire4.toString());

		ucgen myUcgen = new ucgen(12, 12, 3);
		System.out.println(myUcgen.toString());
	}
}
