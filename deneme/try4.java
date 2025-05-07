package deneme;

abstract class shipment{
	String senderNameString;
	String receiverNameString;
	int weight;
	static int trackingNumber=0;
	
	public shipment(String senderNameString, String receiverNameString, int weight) {
		this.senderNameString = senderNameString;
		this.receiverNameString = receiverNameString;
		this.weight = weight;
		calculatecost();
		printLabel();
		trackingNumber++;
	}
	public String getSenderNameString() {
		return senderNameString;
	}
	public void setSenderNameString(String senderNameString) {
		this.senderNameString = senderNameString;
	}
	public String getReceiverNameString() {
		return receiverNameString;
	}
	public void setReceiverNameString(String receiverNameString) {
		this.receiverNameString = receiverNameString;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	void printLabel() {
		System.out.println("shipment [senderNameString=" + senderNameString + ", receiverNameString=" + receiverNameString
				+ ", weight=" + weight + "]");
	}
	abstract void calculatecost();
}

interface trackable{
	String generateTrackingNumber();
}
class AirShipment extends shipment implements trackable{

	public AirShipment(String senderNameString, String receiverNameString, int weight) {
		super(senderNameString, receiverNameString, weight);
		generateTrackingNumber();
		
	}
	@Override
	void calculatecost() {
		// TODO Auto-generated method stub
		System.out.println("taşıma ücreti: "+weight*10);
	}
	@Override
	public String generateTrackingNumber() {
		// TODO Auto-generated method stub
		return Integer.toString(trackingNumber);
	}
}
class groundShipment extends shipment implements trackable{

	public groundShipment(String senderNameString, String receiverNameString, int weight) {
		super(senderNameString, receiverNameString, weight);
		generateTrackingNumber();
		
	}
	@Override
	void calculatecost() {
		// TODO Auto-generated method stub
		System.out.println("taşıma ücreti: "+weight*20);
	}
	public String generateTrackingNumber() {
		// TODO Auto-generated method stub
		return Integer.toString(trackingNumber);
	}
}

public class try4 {
	public static void main(String[] args) {
		AirShipment myAirShipment = new AirShipment("hello", "world", 10);
		groundShipment mygroundShipment = new groundShipment("world", "hello", 70);
	}
}
