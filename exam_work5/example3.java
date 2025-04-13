package exam_work5;

class arac {
	private String marka;
	private String model;
	private int uretimYili;
	private static int toplamAracSayisi = 0;
	private static final String ulkeKodu = "TR";

	public arac(String marka, String model, int uretimYili) {
		toplamAracSayisi++;
		this.marka = marka;
		this.model = model;
		this.uretimYili = uretimYili;
	}

	public void bilgiGoster() {
		System.out.printf("marka: %s\n", marka);
		System.out.printf("model: %s\n", model);
		System.out.printf("üretim yılı: %d\n", uretimYili);
		System.out.printf("ülke kodu: %s\n", ulkeKodu);
	}

	public static int toplamAracYazdir() {
		return toplamAracSayisi;
	}

}

class otomobil extends arac {
	private int kapıSayisi;

	public otomobil(String marka, String model, int uretimYili, int kapıSayisi) {
		super(marka, model, uretimYili);
		this.kapıSayisi = kapıSayisi;
	}

	@Override
	public void bilgiGoster() {
		super.bilgiGoster();
		System.out.printf("kapı sayısı: %d\n", kapıSayisi);
	}

}

class ucak extends arac {
	private int motorSayisi;

	public ucak(String marka, String model, int uretimYili, int motorSayisi) {
		super(marka, model, uretimYili);
		this.motorSayisi = motorSayisi;
	}

	@Override
	public void bilgiGoster() {
		super.bilgiGoster();
		System.out.printf("motor Sayisi: %d\n", motorSayisi);
	}

}

class gemi extends arac {
	private String seferAdi;

	public gemi(String marka, String model, int uretimYili, String seferAdi) {
		super(marka, model, uretimYili);
		this.seferAdi = seferAdi;
	}

	@Override
	public void bilgiGoster() {
		super.bilgiGoster();
		System.out.printf("sefer Adi: %s\n", seferAdi);
	}

}

public class example3 {
	public static void main(String[] args) {
		gemi benGemi = new gemi("tit", "titanik", 1920, "son sefer");
		benGemi.bilgiGoster();
		otomobil benOtomobil = new otomobil("mercedes", "-", 2020, 2);
		benOtomobil.bilgiGoster();
		System.out.printf("toplam araç sayısı: %d", arac.toplamAracYazdir());
	}
}
