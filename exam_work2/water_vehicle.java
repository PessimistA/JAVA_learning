package exam_work2;

public class water_vehicle extends vehicle {
	private int capacity;
	public water_vehicle(String brandString,int speed, int capacity) {
		super(brandString, speed);
		this.capacity= capacity;
	}
	@Override
	public String toString() {
		return super.toString()+"capacity:"+capacity+"\n";
	}
	public void anchor_drop() {
		System.out.println("the ship has stopped");
	}
}
