package exam_work2;

public class boat extends water_vehicle {
	private Boolean hasSails;
	public boat(String brandString,int speed, int capacity,Boolean hassails) {
		super(brandString, speed,capacity);
		this.hasSails= hassails;
	}
	@Override
	public String toString() {
		return super.toString()+"hasSails:"+hasSails+"\n";
	}
    public String sail() {
        return super.toString() + (hasSails ? "Boat has sailed." : "Boat has not sailed.");
    }
}
