package exam_work5;

class yayin {
	private String başlikString;
	private String yazarString;
	private String yayınyılı;

	public String getBaşlikString() {
		return başlikString;
	}

	public void setBaşlikString(String başlikString) {
		this.başlikString = başlikString;
	}

	public String getYazarString() {
		return yazarString;
	}

	public void setYazarString(String yazarString) {
		this.yazarString = yazarString;
	}

	public String getYayınyılı() {
		return yayınyılı;
	}

	public void setYayınyılı(String yayınyılı) {
		this.yayınyılı = yayınyılı;
	}

	public yayin(String başlikString, String yazarString, String yayınyılı) {
		this.başlikString = başlikString;
		this.yazarString = yazarString;
		this.yayınyılı = yayınyılı;
	}

	public void bilgigoster() {
		System.out.println(
				"yazar: " + getYazarString() + "\nbaşlık: " + getBaşlikString() + "\nyayınyılı: " + getYayınyılı());
	}

	public String toString() {
		return String.format("yazar: " + getYazarString() + "\n" + "başlık: " + getBaşlikString() + "\n" + "yayınyılı: "
				+ getYayınyılı() + "\n");
	}

}

class kitap extends yayin {
	private String sayfaSayisi;

	public kitap(String başlikString, String yazarString, String yayınyılı, String sayfaSayisi) {
		super(başlikString, yazarString, yayınyılı);
		this.sayfaSayisi = sayfaSayisi;
	}

	public String getSayfaSayisi() {
		return sayfaSayisi;
	}

	public void setSayfaSayisi(String sayfaSayisi) {
		this.sayfaSayisi = sayfaSayisi;
	}

	@Override
	public void bilgigoster() {
		super.bilgigoster();
		System.out.println("\nsayfa sayısı: " + getSayfaSayisi());
	}

	@Override
	public String toString() {
		return super.toString() + String.format("sayfa sayısı: " + getSayfaSayisi());
	}

}

class dergi extends yayin {
	private String sayiNumarasi;

	public String getSayiNumarasi() {
		return sayiNumarasi;
	}

	public void setSayiNumarasi(String sayiNumarasi) {
		this.sayiNumarasi = sayiNumarasi;
	}

	public dergi(String başlikString, String yazarString, String yayınyılı, String sayiNumarasi) {
		super(başlikString, yazarString, yayınyılı);
		this.sayiNumarasi = sayiNumarasi;
	}

	public void bilgigoster() {
		super.bilgigoster();
		System.out.println("\nsayı numarası: " + getSayiNumarasi());
	}

	@Override
	public String toString() {
		return super.toString() + String.format("sayı numarası: " + getSayiNumarasi());
	}

}

class gazete extends yayin {
	private String tarih;

	public String getTarih() {
		return tarih;
	}

	public void setTarih(String tarih) {
		this.tarih = tarih;
	}

	public gazete(String başlikString, String yazarString, String yayınyılı, String tarih) {
		super(başlikString, yazarString, yayınyılı);
		this.tarih = tarih;
	}

	public void bilgigoster() {
		super.bilgigoster();
		System.out.println("\nTarih: " + getTarih());
	}

	@Override
	public String toString() {
		return super.toString() + String.format("Tarih: " + getTarih());
	}
}

public class example2 {
	public static void main(String[] args) {
		kitap benKitap = new kitap("MD", "EV", "1995", "1243");
		System.out.println(benKitap.toString());
	}
}
