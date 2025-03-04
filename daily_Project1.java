package first_one_dude;

import java.lang.classfile.instruction.ConvertInstruction;
import java.util.Scanner;

class take_numbers{
	private int number1 ;
	private int number2;
	public void get() {
		Scanner scan= new Scanner(System.in);
		int number1,number2;
		System.out.println("Lütfen ilk sayıyı giriniz");
		number1= scan.nextInt();
		setnumber1(number1);
		System.out.println("Lütfen ikinci sayıyı giriniz");
		number2= scan.nextInt();
		setnumber2(number2);
	}
	private void setnumber1(int number1) {
		// TODO Auto-generated method stub
		this.number1= number1;
	}
	public int getnumber1() {
		// TODO Auto-generated method stub
		return this.number1;
	}
	private void setnumber2(int number2) {
		// TODO Auto-generated method stub
		this.number2= number2;
	}
	public int getnumber2() {
		// TODO Auto-generated method stub
		return this.number2;
	}
}

class calculator{
	private char operator;
	private int number1 ;
	private int number2 ;
	public calculator() {
		// TODO Auto-generated constructor stub
		this(0,0);
	}
	public calculator(int number1,int number2) {
		setnumber1(number1);
		setnumber2(number2);
	}
	public calculator(int number1) {
		this(number1,0);
	}	
	/*public calculator(int number2) {
		this(0,number2);
	}*/// bu hata veriyor mesela
	private void setnumber1(int number1) {
		// TODO Auto-generated method stub
		this.number1= number1;
	}
	private int getnumber1() {
		// TODO Auto-generated method stub
		return this.number1;
	}
	private void setnumber2(int number2) {
		// TODO Auto-generated method stub
		this.number2= number2;
	}
	private int getnumber2() {
		// TODO Auto-generated method stub
		return this.number2;
	}
	public void calculations() {
		Scanner scan= new Scanner(System.in);
		take_numbers tk_nm=new take_numbers();
		char choosen;
		System.out.println("Hesap Makinesine hoş geldiniz");
		Boolean control=true;
		while (control) {
			System.out.println("Lütfen yapacağonız işlemi seçiniz");
			System.out.printf("1)Toplama\n2)Çıkarma\n3)Çarpma\n4)Bölme\n5)Mod\n\'q\' çıkış için basınız\n");
			choosen=  scan.nextLine().charAt(0);
			double answer=0;
			switch (choosen) {
			case '1':
				tk_nm.get();
				setnumber1(tk_nm.getnumber1());
				setnumber2(tk_nm.getnumber2());
				answer= addition();
				System.out.printf("sonuç: %f\n",answer);
				break;
			case '2':
				tk_nm.get();
				setnumber1(tk_nm.getnumber1());
				setnumber2(tk_nm.getnumber2());
				answer=extraction();
				System.out.printf("sonuç: %f\n",answer);
				break;
			case '3':
				tk_nm.get();
				setnumber1(tk_nm.getnumber1());
				setnumber2(tk_nm.getnumber2());
				answer= multiplication();
				System.out.printf("sonuç: %f\n",answer);
				break;
			case '4':
				tk_nm.get();
				setnumber1(tk_nm.getnumber1());
				setnumber2(tk_nm.getnumber2());
				answer= division();
				System.out.printf("sonuç: %f\n",answer);
				break;
			case '5':
				tk_nm.get();
				setnumber1(tk_nm.getnumber1());
				setnumber2(tk_nm.getnumber2());
				answer= mod();
				System.out.printf("sonuç: %f\n",answer);
				break;
			case 'q':
				System.out.println("Görüşmez üzere");
				control=false;
				break;

			default:
				break;
			}	
		}
	}
	private double addition() {
		return number1+number2;
	}
	private double extraction() {
		return number1-number2;		
	}	
	private double multiplication() {
		return number1*number2;
	}
	private double division() {
		try {
			return number1/number2;	
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
			return 0;
		}
	}
	private double mod() {
		return number1%number2;
	}
	
}

public class daily_Project1 {
	public static void main(String[] args) {
		calculator calculate= new calculator();
		calculate.calculations();
	}
}
