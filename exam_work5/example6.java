package exam_work5;


import java.util.Iterator;

class student1{
	private String name;
	private int[] grades;
    public student1(String name,int[] grades){
        this.name= name;
        this.grades = grades;
    }
    
    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int[] getGrades() {
		return grades;
	}

	public void setGrades(int[] grades) {
		this.grades = grades;
	}

	public double calculateAverage() {
    	int sum=0;
    	for (int i = 0; i < grades.length; i++) {
			sum= sum+ grades[i];		
		}
    	return (sum/3);
    }
    public void printStudentInfo() {
    	System.out.println("name: "+name);
    	for (int i = 0; i < grades.length; i++) {
        	System.out.println("grade"+i+": "+grades[i]);		
		}
    }
}

class compare{
	public void comparasion(student1 myStudent) {
		if (myStudent.calculateAverage()>70) {
			System.out.println("student "+myStudent.getName()+ "is succesfull");
			myStudent.printStudentInfo();
		}
		else {
			System.out.println("student "+myStudent.getName()+ "is NOT succesfull");
			myStudent.printStudentInfo();
		}
	}
}
class ScholarshipStudent extends student1{
	double Scholarship;
	public ScholarshipStudent(String name, int[] grades,double scholarship) {
		super(name, grades);
		this.Scholarship= scholarship;
	}
	@Override
    public void printStudentInfo() {
		System.out.println("bursu: "+Scholarship);
    }
	
}
class max{
	private double max;
	public void max(student1[] myStudent) {
		max =myStudent[0].calculateAverage();
		for (int i = 0; i < myStudent.length; i++) {
			if (max<myStudent[i].calculateAverage()) {
					max =myStudent[i].calculateAverage();
			}
			
		}
	}
}
class mim{
	private double mim;
	public double mim(student1[] myStudent) {
		mim =myStudent[0].calculateAverage();
		for (int i = 0; i < myStudent.length; i++) {
			if (mim>myStudent[i].calculateAverage()) {
					mim =myStudent[i].calculateAverage();
			}
		}
		return mim;
	}
	
}

public class example6 {
	public static void main(String[] args) {
		int[] a = new int[4];
        ScholarshipStudent myScholarshipStudent = new ScholarshipStudent("al",new int[]{1,2,3} , 400);
        myScholarshipStudent.printStudentInfo();

	}
}
