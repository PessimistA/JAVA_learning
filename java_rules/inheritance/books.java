
import java.awt.Image;
import java.sql.Date;

class books{
	protected String  auther;
	protected String  print_date;
	protected int  print_count;
	
	public books(String auther,String print_date,int print_count){
		this.auther= auther;
		this.print_date=print_date;
		this.print_count= print_count;
	}
	
	public String toString() {
		return String.format("auther: %s\nPrint Date: %s\nPrint Count: %s\n",auther,print_date,print_count);
	}
	
}
class serial_books extends books{
	private int series_book_count;
	
	public  serial_books(String auther,String print_date,int print_count,int series_book_count) {
		super(auther, print_date, print_count);
		this.series_book_count= series_book_count;
	}
	
	
	public String toString() {
		return super.toString()+"This book is part of a series.\n"+"Serie's Book count: %d"+series_book_count+"\n";
	}
}
class oneShoot_books extends books{
	
	public  oneShoot_books(String auther,String print_date,int print_count,int series_book_count) {
		super(auther, print_date, print_count);
	}
	
	
	public String toString() {
		return super.toString()+"This book is not part of a series.\n";
	}
}

class classic_books extends oneShoot_books{
	public  classic_books(String auther,String print_date,int print_count,int a) {
		super(auther, print_date,print_count,a);// sor
	}
	
	
	public String toString() {
		return super.toString()+"This book is a classic book.\n";
	}
}

class science_fiction extends serial_books{
	public  science_fiction(String auther,String print_date,int print_count,int count) {
		super(auther, print_date,print_count,count);// sor
	}
	
	
	public String toString() {
		return super.toString()+"This book is a science fiction .\n";
	}
}

public class book {
	 public static void main(String[] args) {
		science_fiction sc= new science_fiction("E", "12.43.1341", 1414, 151);
		System.out.println(sc.toString());
	}
}
