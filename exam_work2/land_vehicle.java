package exam_work2;

public class land_vehicle extends vehicle{
	private int wheels;
	public land_vehicle(String brandString,int speed, int wheels) {
		super(brandString, speed);
		this.wheels= wheels;
	}
	@Override
	public String toString() {
		return super.toString()+"wheels:"+wheels+"\n";
	}
	public void honk() {
		System.out.println("düt düt");
	}
}
