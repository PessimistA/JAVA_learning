package exam_work5;

import java.util.Iterator;
import java.util.concurrent.Flow.Processor;

import exam_work5.person1.city;

class computer{
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
class a{
	public static int an=10;
	c cvarC;
	public a(int b) {
		this.an=b;
	}
}
class b extends a {
	public b(int b) {
		super(b);
	}
	public b() {
		super(0);
	}
}
class c{
	private int d=0;
}

class person1{
	 class city{
		private String cityString;
		private String bolge;
	
		public String getCityString() {
			return cityString;
		}
		public void setCityString(String cityString) {
			this.cityString = cityString;
		}
		public String getBolge() {
			return bolge;
		}
		public void setBolge(String bolge) {
			this.bolge = bolge;
		}
		public city(String cityString, String bolge) {
			System.out.println("hello");
			this.cityString = cityString;
			this.bolge = bolge;
		}		
		public void showinfo() {
			System.out.println("bölge: "+bolge+"\n"+"şehir: "+cityString);
		}
	}
	public static int count=0;
	private String nameString;
	public String getNameString() {
		return nameString;
	}
	public void setNameString(String nameString) {
		this.nameString = nameString;
	}
	public person1(String nameString) {
		this.nameString = nameString;
		count++;
	}
	public void showinfo(city mycity) {
		System.out.println("isim: "+nameString+"\n");
		mycity.showinfo();
	}
	
}

class outerfor{
	public boolean is_it_even(int j) {
		for (int i = 2; i < j; i++) {
			if (j%i==0) {
				return false;
			}
		
		}
		return true;
		
	}
}
class innerfor extends outerfor{
	@Override
	public boolean is_it_even(int j) {
		boolean a=false;
		for (int i = 0; i <= j; i++) {
			a=super.is_it_even(i);
            System.out.println(i + " is prime? " + a);
		}
		return a;
		
	}
}

class Time{
	 private int hour; // 0 – 23
	 private int minute; // 0 - 59
	 private int second; //0 - 59
	 public Time() {
		
	}
	 public Time(int h,int m,int s) {
		 hour=(h>=0&&h<24)?h:0;
		 minute=(m>=0&&m<60)?m:0;
		 second=(s>=0&&s<60)?s:0;
	 }
	 public String toString() {
		 return String.format("%02d:%02d:%02d",hour,minute,second);
	 }
	 
	 
}


class mathcheck{
	private int kenar;

	public int getKenar() {
		return kenar;
	}

	public void setKenar(int kenar) {
		this.kenar = kenar;
	}

	public mathcheck(int kenar) {
		this.kenar = kenar;
	}
	public boolean isPerfectSquare(int num) {
		double a = Math.sqrt(num);
		if (a==(int)a) {
			return true;
		}
		else {
			return false;
		}
	}
}
class squarelogic extends mathcheck{
	public squarelogic(int num) {
		super(num);
	}
	public boolean checkSquareWithExtra(int num) {
		if (super.isPerfectSquare(num)) {
			double a = Math.sqrt(num);
			if (a%2==0) {
				return true;
			}
			else {
				return false;
			}
		}
		else {
			return false;
		}
	}
}
class digitTools{
	public int sumOfDigits(int n) {
		int sum=0;
		int digit=0;
		while(n>0) {
			digit= n%10;
			sum +=digit;
			n= n/10;
		}
		return sum;
	}
}

class fibanacciarray{
	public int[] fibonacci1(int n) {
		int[] array = new int[n];
		fibonacci myFibonacci = new fibonacci();
		
		for (int i = 0; i < n; i++) {
			array[i] = myFibonacci.sumOfFibonacci(i);
		}
		return array;
	}
}
class fibonacci extends fibanacciarray{
	public int sumOfFibonacci(int n) {
		if (n==0|| n==1) {
			return 1;
		}
		 return sumOfFibonacci(n-1)+sumOfFibonacci(n-2);
	}
}

class mathutility{
	public static int doit(int a ,int b) {
		return a+b;
	}
	public void tobinary(int n) {
		String aString= "";
		while(n>0) {
			aString =n%2+aString;
			n= n/2;
		}
		System.out.println(aString);
	}
	public void numberpolindrome(int n) {
		int len =((int) Math.log10(n))+1;
		int[] an= new int[len];
		int k= len-1;
		while(n>0) {
			an[k] = n%10;
			n= n/10;
			k--;
		}
		int sağ = len-1;
		int sol = 0;
		boolean kaz=false;
		while(sol<sağ) {
			if (an[sağ]==an[sol]) {
				sağ--;
				sol++;
				kaz=true;
			}
			else {
				kaz= false;
				System.out.println("palindrome değildir");
				break;
			}
		}
		if (kaz) {
			System.out.println("palindromdur");
		}
	}
}

class Person2 {

    public void Person2() { // Bu bir constructor DEĞİL
        System.out.println("Bu bir METOT.");
    }
}

public class example7 {
	public static void main(String[] args) {
		float a=3, b=2;
		Person2 per= new Person2();
		per.Person2();
		
		digitTools myDigitTools =new digitTools();
		System.out.println("sum is"+myDigitTools.sumOfDigits(456));
		
		computer myComputer = new computer();
		myComputer.showproccessor();
		person1 myperson1 = new person1("al");
		person1.city myycity= myperson1.new city("an", "is");
		myperson1.showinfo(myycity);
		System.out.println(person1.count);
		System.out.println(mathutility.doit(4, 5));
		b myB= new b(5);
		innerfor inner = new innerfor();
		System.out.println(inner.is_it_even(7));
		
		squarelogic mySquarelogic = new squarelogic(0);
		System.out.println(mySquarelogic.checkSquareWithExtra(49));
		
		Time myTime = new Time();
		System.out.println(myTime.toString());
		Time myTime2 = new Time(12,32,34);
		System.out.println(myTime2.toString());
		
		int[] af = new int[5];
		fibanacciarray myFibanacciarray = new fibanacciarray();
		af= myFibanacciarray.fibonacci1(5);
		for (int i = 0; i < af.length; i++) {
			System.out.println(af[i]);
		}
		mathutility myMathutility = new mathutility();
		myMathutility.tobinary(10);
		myMathutility.numberpolindrome(6788976);
		
	}
}
