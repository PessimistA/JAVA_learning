package exam_work4;

class person{
	private String nameString;
	private int id;
	private String mailString;
	public person(String nameString, int id, String mailString) {
		super();
		this.nameString = nameString;
		this.id = id;
		this.mailString = mailString;
	}

	public String getNameString() {
		return nameString;
	}
	public void setNameString(String nameString) {
		this.nameString = nameString;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMailString() {
		return mailString;
	}
	public void setMailString(String mailString) {
		this.mailString = mailString;
	}
	public String getDetails() {
		return String.format(nameString+" "+mailString+" "+id+":");
	}
}
class customer extends person{
	private String[] accountlist= {};
	private int index=0;
	public customer(String nameString, int id, String mailString) {
		super(nameString, id, mailString);
	}
	public void openAccount() {
		accountlist[index]= super.getDetails();
		index++;
	}
}
class employee extends person{
	private Double salary;

	public employee(String nameString, int id, String mailString,Double salary) {
		super(nameString, id, mailString);
		this.salary=salary;
	}
	public String calculateSalary() {
		return super.getDetails()+":" + salary;
	}
}
class manager extends employee{
	boolean approve_or_not=false;
	public manager(String nameString, int id, String mailString,Double salary) {
		super(nameString, id, mailString,salary);
	
	}
	public void ApproveLoan() {
		approve_or_not= true;
	}
}

public class bank {
	public static void main(String[] args) {
		manager mngManager= new manager("al", 123123, "mail", 54.3);
		System.out.println(mngManager.calculateSalary());
	}
}
