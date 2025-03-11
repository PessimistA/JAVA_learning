package İnheritance;

class employee{
	protected String nameString; 
	protected String SurnameString; 
	protected String SGK_numberString; 
	protected String MajorString; 
	
	public employee(String name,String surname,String sgk_number,String major){
		set_surname(surname);
		set_sgknumber(sgk_number);
		set_name(name);
		set_major(major);
	}
	private void set_name(String name) {
		this.nameString=name;
	}
	
	private void set_surname(String surname) {
		this.SurnameString=surname;
	}
	private void set_sgknumber(String SGK_numberString) {
		this.SGK_numberString=SGK_numberString;
	}
	private void set_major(String major) {
		this.MajorString=major;
	}
	
	public String toString() {//public olmazsa hata veriyor
		return String.format("Name:%s\nSurname:%s\nSGK:%s\nMajor:%s\n", nameString,SurnameString,SGK_numberString,MajorString);		
	}
	protected void print() {
		String last_versionString= toString();
		System.out.println(last_versionString);
	}
	
}

class maneger extends employee{
	private int worker_count;
	public maneger(int worker_count,String name,String surname,String sgk_number,String major) {
		super(name, surname, sgk_number, major);
		this.worker_count= worker_count;
	}
	public String toString() {//buraya print fonksiyonu eklemesemde kendiliğinden toString güncelleniyor
		return super.toString()+"worker_count: "+ worker_count+"\n";
	}
	
}
class intern extends employee{
	private int internship_time;
	public intern(int internship_time,String name,String surname,String sgk_number,String major) {
		super(name, surname, sgk_number, major);
		this.internship_time= internship_time;
	}
	public String toString() {//buraya print fonksiyonu eklemesemde kendiliğinden toString güncelleniyor
		return super.toString()+"İntership_time: "+ internship_time+" months"+"\n";
	}
}


public class employe {
	public static void main(String[] args) {
		maneger mngManeger= new maneger(1203,"ali","tenes","1222,333,444","Engineer");
		mngManeger.print();
		intern intern_student= new intern(6, "ag", "ten", "1111,111,111", "engineer");
		intern_student.print();
	}
}
