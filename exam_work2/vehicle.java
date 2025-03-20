package exam_work2;

public class vehicle {
	private String brandString;
	private int speed;
	
	public vehicle(String brandString,int speed) {
		this.brandString=brandString;
		this.speed = speed;
	}
	
	public String toString() {
		return String.format("brand is "+ brandString+"\nspeed is "+ speed+"\n");
	}
}
