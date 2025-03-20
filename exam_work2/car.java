package exam_work2;

public class car extends land_vehicle {
	private int doors;
	public car(String brandString,int speed,int wheels,int doors) {
		super(brandString, speed,wheels);
		this.doors= doors;
	}
	@Override
	public String toString() {
		return super.toString()+"doors:"+doors+"\n";
	}
	public void drift() {
		System.out.println("drift atıldı");
	}
}
