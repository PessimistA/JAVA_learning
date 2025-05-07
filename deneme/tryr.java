package deneme;

import java.awt.Window.Type;
import java.lang.classfile.Signature.TypeArg;

class hayvan{
	private String isim;
	private int yaş;
	
	public hayvan(String isim,int yaş) {
		this.isim = isim;
		this.yaş= yaş;
		System.out.printf("%s oluşturuldu\n",isim);
	}
	
	void ses_Çıkar() {
		System.out.println("Genel bir hayvan sesi...");
	}
	void print() {
		System.out.printf("isim:%s\nyaş:%d\n\n",isim,yaş);
	}
	void hello() {
		System.out.printf("e naber");
	}
}
class hayvan1{
	private String isim;
	private int yaş;
	
	public hayvan1() {
	}
	
	void ses_Çıkar() {
		System.out.println("Genel bir hayvan sesi...");
	}
	void print() {
		System.out.printf("isim:%s\nyaş:%d\n\n",isim,yaş);
	}
	void hello() {
		System.out.printf("e naber");
	}
}
class kedi1 extends hayvan1{
	String isimString;
	int yaş;
	public kedi1(String isim,int yaş) {
		
		this.isimString=isim;
		this.yaş=yaş;
	}
	@Override
	void ses_Çıkar() {

		System.out.println("miyav miyav");
	}
	@Override
	void print() {
		super.print();
	}
}
class kedi extends hayvan{
	String isimString;
	int yaş;
	public kedi(String isim,int yaş) {
		super(isim, yaş);
		this.isimString=isim;
		this.yaş=yaş;
	}
	@Override
	void ses_Çıkar() {

		System.out.println("miyav miyav");
	}
	@Override
	void print() {
		super.print();
	}
}
class kuş extends hayvan{
	public kuş(String isim,int yaş) {
		super(isim, yaş);
	}
	@Override
	void ses_Çıkar() {
		System.out.println("cik cik");
		super.ses_Çıkar();
	}
	@Override
	void print() {
		super.print();
	}
}
class köpek extends hayvan{
	public köpek(String isim,int yaş) {
		super(isim, yaş);
	}
	@Override
	void ses_Çıkar() {

		System.out.println("hav hav");
	}
	@Override
	void print() {
		super.print();
	}
}
class köpekcik extends köpek{
	public köpekcik(String isim,int yaş) {
		super(isim, yaş);
	}
	@Override
	void ses_Çıkar() {
		System.out.println("havi havi");
	}
	@Override
	void print() {
		super.print();
	}
}

public class tryr {
	public static void main(String[] args) {
		
		köpek maya = new köpek("maya", 1);
		maya.ses_Çıkar();
		maya.print();
		kedi mayas = new kedi("pancar", 2);
		mayas.ses_Çıkar();
		mayas.print();
		kuş mayan = new kuş("bulut", 3);
		mayan.ses_Çıkar();
		mayan.print();
		
		köpekcik köpke= new köpekcik("ar", 10);
		köpke.hello();
		char[] dizi = {'a','b','c'};
		int toplam=0;
		for (char c : dizi) {
			toplam =toplam+c;
		}
		System.out.println(toplam);
		System.out.println(dizi.getClass().getSimpleName());
	}
}
