package exam_work5;

class student {
	private String nameString;
	private Long number;

	public student(String nameString, long number) {
		setname(nameString);
		setnumber(number);
	}

	public void setname(String name) {
		this.nameString = name;
	}

	public String getName() {
		return nameString;
	}

	public void setnumber(Long number) {
		this.number = number;
	}

	public Long getNumber() {
		return number;
	}

	public double calculategpa() {
		System.out.println("hesaplamaları yap");
		return 0;
	}

	public void print() {
		System.out.println("name: " + getName() + "\nnumber: " + getNumber() + "\ngpa: " + calculategpa());// , ile
																											// yazmak
																											// hata
																											// veriyor
	}
}

class unistudent extends student {
	private double midturn;
	private double Final;

	public unistudent(String nameString, long number, double midturn, double Final) {
		super(nameString, number);
		setFinal(Final);
		setMidturn(midturn);
	}

	public double getMidturn() {
		return midturn;
	}

	public void setMidturn(double midturn) {
		this.midturn = midturn;
	}

	public double getFinal() {
		return Final;
	}

	public void setFinal(double final1) {
		this.Final = final1;
	}

	@Override
	public double calculategpa() {
		return (midturn * 0.3) + (Final * 0.7);
	}

	@Override
	public void print() {
		super.print();
	}

}

class HighSchoolstudent extends student {
	private double firstExam;
	private double secondExam;

	public HighSchoolstudent(String nameString, long number, double firstexam, double secondexam) {
		super(nameString, number);
		setSecondExam(secondexam);
		setFirstExam(firstexam);
	}

	public double getFirstExam() {
		return firstExam;
	}

	public void setFirstExam(double firstExam) {
		this.firstExam = firstExam;
	}

	public double getSecondExam() {
		return secondExam;
	}

	public void setSecondExam(double secondExam) {
		this.secondExam = secondExam;
	}

	@Override
	public double calculategpa() {
		return (firstExam * 0.5) + (secondExam * 0.5);
	}

	public void print(String a) {
		System.out.println(a);
	}

}

public class example1 {
	public static void main(String[] args) {
		unistudent benUnistudent = new unistudent("al", 12312312, 90, 86);
		benUnistudent.print();
		HighSchoolstudent oHighSchoolstudent = new HighSchoolstudent("agr", 1231243123, 50, 34);
		oHighSchoolstudent.print();
		oHighSchoolstudent.print("a");// 2 tane print şansı çıktı birisi string alan birisi student içindeki print
	}
}
