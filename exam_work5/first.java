package exam_work5;

import java.security.AllPermission;
import java.util.Random;
import java.util.Scanner;

import exam_work5.computer.proccessor;

class print {
	public void all() {
		int a = 5;
		String kString = "nab";
		System.out.println("hello world" + 4);
		System.out.printf("helloo" + "naber" + "\n");
		System.out.printf("helloo" + 4 + "\n");
		System.out.printf("%s\n", kString);
		System.out.printf(kString + a);
		System.out.printf("%s%20s\n", "Year", "Amount on deposit");

		//
		int aCount = 1;
		int bCount = 2;
		int cCount = 3;
		int dCount = 4;
		int fCount = 5;
		System.out.printf("Number of students who received each grade:\n" + "A: %d\n" + "B: %d\n" + "C: %d\n"
				+ "D: %d\n" + "F: %d\n", aCount, bCount, cCount, dCount, fCount);

		/*
		 * 2 System.out.printf( "%s\n%s%d\n%s%d\n%s%d\n%s%d\n%s%d\n", 113
		 * "Number of students who received each grade:", 114 "A: ", aCount, // display
		 * number of A grades 115 "B: ", bCount, // display number of B grades 116
		 * "C: ", cCount, // display number of C grades 117 "D: ", dCount, // display
		 * number of D grades 118 "F: ", fCount );
		 */
		System.out.printf("%s\n%s: %b\n%s: %b\n%s: %b\n%s: %b\n\n", "Conditional OR (||)", "false || false",
				(false || false), "false || true", (false || true), "true || false", (true || false), "true || true",
				(true || true));
	}

	public void identifiers() {
		float a = 3.14f;
		double b = 3.14;
		String cString = "hello";
		char k = 'a';
		if (b > 3) {
			System.out.println("hello");
		}
		if (a > 3) {
			System.out.println("hello2");
		}
		// average = (double) total / gradeCounter; -> toplam sonuç double olur
	}

	public void randomv() {
		Random randomNumbers = new Random();
		int face = 0;
		for (int i = 0; i < 10; i++) {
			face = 1 + randomNumbers.nextInt(6);
			System.out.printf("%d ", face);
		}
	}

	public void nparse() {
		String a = "2";
		System.out.println(Integer.parseInt(a) + 3);// 5

	}
	// static her yerden erişilebilir
	// final değişmez
}

class getter_setter {
	private int a;
	private int b;
	private int c;
	private int d;

	public getter_setter(int a, int b, int c, int d) {
		setA(a);
		setB(b);
		setC(c);
		setD(d);
	}

	public int getA() {// public olmalı
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}

	public int getD() {
		return d;
	}

	public void setD(int d) {
		this.d = d;
	}

}

class controlSTatements {
	public void ifstatement() {
		System.out.println((2 > 3) ? 4 : 1);// 1 basar

		if (-2 > 0)// tek satırlık için {} gereksiz
			System.out.println("Pozitif");

		if (4 > 0)
			System.out.println("Pozitif");// if içinde alttaki her zaman çalışır yani hatalı bir kullanım {} kullan
		System.out.println("Bu da pozitif"); // HATALI GİBİ GÖRÜNMESE DE ÇALIŞIR, AMA BEKLENMEYEN DAVRANIŞ OLUR

	}

	public void switchstatement() {
		int day = 3;
		switch (day) {
		case 1:
			System.out.println("Pazartesi");
			break;
		case 2:
			System.out.println("Salı");
			break;
		case 3:
			System.out.println("Çarşamba");
			break;
		case 4:
			System.out.println("Perşembe");
			break;
		case 5:
			System.out.println("Cuma");
			break;
		case 6:
			System.out.println("Cumartesi");
			break;
		case 7:
			System.out.println("Pazar");
			break;
		default:
			System.out.println("Geçersiz gün");
		}
	}

	public void forstatement() {
		for (int i = 0; i < 5; i++)
			System.out.println("İterasyon: " + i);
		System.out.println("Başka bir işlem");

		String[] colors = { "Kırmızı", "Mavi", "Yeşil" };
		for (String color : colors) {
			System.out.println(color);
		}
	}

	public void whilestatement() {
		int x = 0;
		while (x < 10)
			x++;
		System.out.println("Başka bir işlem");

		int i = 0;
		do {
			System.out.println(i);
			i++;
		} while (i < 5);

		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {// ben istedikçe devam eder
			int grade = input.nextInt();
			// işlemler...
		}

	}
}

class methods {
	public void overload() {
		/*
		 * 8 public int square( int x ) { return x * x; }
		 */
		/*
		 * 8 public int square( int y )//overload olmaz { return y * y; }
		 */

	}
}

class arrays {
	public void oneD() {
		int c[] = new int[12];
		int[] d = new int[24];
		int[] k = { 1, 2, 3, 4, 5 };
		int n[] = { 10, 20, 30, 40, 50 };

	}

	public void twoD() {
		int b[][] = { { 1, 2 }, { 3, 4 } };
		int c[][] = new int[3][4];
		int gradesArray[][] = { { 87, 96, 70 }, { 68, 87, 90 }, { 94, 100, 90 }, { 100, 81, 82 }, { 83, 65, 85 },
				{ 78, 87, 65 }, { 85, 75, 83 }, { 91, 94, 100 }, { 76, 72, 84 }, { 87, 93, 73 } };

	}
}

class Class {
	private int a;

	public void TOSTRing() {
		/*
		 * public String toString() { return String.format( "%d:%02d:%02d %s", ( ( hour
		 * == 0 || hour == 12 ) ? 12 : hour % 12 ), minute, second, ( hour < 12 ? "AM" :
		 * "PM" ) ); }
		 */
	}

	public static void constructors() {
		/*
		 * overloading constructors 12 public Time2() { this( 0, 0, 0 ); // invoke Time2
		 * constructor with three arguments } // end Time2 no-argument constructor
		 * 
		 * // Time2 constructor: hour supplied, minute and second defaulted to 0 public
		 * Time2( int h ) { this( h, 0, 0 ); // invoke Time2 constructor with three
		 * arguments } // end Time2 one-argument constructor
		 * 
		 * // Time2 constructor: hour and minute supplied, second defaulted to 0 public
		 * Time2( int h, int m ) { this( h, m, 0 ); // invoke Time2 constructor with
		 * three arguments }
		 */

		// static kullanımı ben burada static kullanırsam mainde direk mesela static
		// void construtors olsun direk çağırabilirim deneyelim

	}

	private static void name2() {
		// this.a -> bu hatadır ÇOK ÖNEMLİ
	}
}
//nested için örnek
class outerclass{
	class proccessor{
		public void displayDetails() {
            // Print details of the processor
            System.out.println("Processor Brand: Intel");
            System.out.println("Processor Speed: 3.5 GHz");
		}
	}
	public void showproccessor() {
		proccessor myProcessor= new proccessor();
		myProcessor.displayDetails();
		
	}
}

public class first {
	public static void main(String[] args) {
		print prtPrint = new print();
		// prtPrint.all();
		// prtPrint.randomv();
		prtPrint.nparse();

		controlSTatements cSTatements = new controlSTatements();
		// cSTatements.ifstatement();
		Class.constructors();// bu kullanım static sayesinde mümkün
		// Class.name2-> private olduğundan olmaz ÇOK ÖNEMLİ
	}
}
