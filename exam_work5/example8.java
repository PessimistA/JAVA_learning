package exam_work5;

class human{
	private String nameString;
	private int age;
	public String getNameString() {
		return nameString;
	}
	public void setNameString(String nameString) {
		this.nameString = nameString;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public human(String nameString, int age) {
		this.nameString = nameString;
		this.age = age;
	}
	public void introduce() {
		System.out.println("hello my name is "+nameString+" and I am "+age);
	}
	public String details() {
		return String.format("name: "+nameString+" age:"+age);
	}
	
}
class Student extends human{
	private int number;
	private String courseString;
	public Student(String nameString, int age, int number, String courseString) {
		super(nameString, age);
		this.number = number;
		this.courseString = courseString;
	}
	@Override
	public void introduce() {
		super.introduce();
	}
	@Override
	public String details() {
		return super.details() +String.format("number: "+number+"course: "+courseString);
	}
	
}
class Teacher extends human{
	private String courseString;

	public Teacher(String nameString, int age, String courseString) {
		super(nameString, age);
		this.courseString = courseString;
	}
	@Override
	public void introduce() {
		super.introduce();
	}
	@Override
	public String details() {
		return super.details() +String.format("course: "+courseString);
	}
	
	
}
class school{
	Student[] Students;
	private int countstudent=0;
	Teacher[] teachers;
	private int countteacher=0;
	public static int count=0;
	public school() {
		// TODO Auto-generated constructor stub
		Students = new Student[3];
		teachers = new Teacher[2];
	}
	public void addteacher(Teacher teacher1) {
		teachers[countteacher] = teacher1;
		countteacher++;
	}
	public void addstudent(Student student1) {
		Students[countstudent]= student1;
		countstudent++;
	}
	public void showinfo() {
		for (int i = 0; i < Students.length; i++) {
			Students[i].introduce();
			System.out.println(Students[i].details());
		}
		for (int i = 0; i < teachers.length; i++) {
			teachers[i].introduce();
			System.out.println(teachers[i].details());
		}
		count=countstudent+countteacher;
	}
}

public class example8 {
    public static void main(String[] args) {
        school schools = new school();
		
		Student student1 = new Student("Ali", 20, 1,"Matematik");
		Student student2 = new Student("Veli", 22, 2,"Fizik");
		Student student3 = new Student("Zeynep", 19, 3,"Kimya");
		
		Teacher teacher1 = new Teacher("Ahmet", 40, "Matematik");
		Teacher teacher2 = new Teacher("Buse", 35, "Fizik");
		
		schools.addstudent(student1);
		schools.addstudent(student2);
		schools.addstudent(student3);
		
		schools.addteacher(teacher1);
		schools.addteacher(teacher2);
		schools.showinfo();
		System.out.println("max count is : "+school.count);
		}
}
