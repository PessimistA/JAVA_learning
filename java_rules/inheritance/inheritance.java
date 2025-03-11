package İnheritance;

class vehicle{
	private double speed;
	protected double wheel_count;
	
	private void start() {
		System.out.println("çalıştı");
	}
	protected void stop() {
		System.out.println("durdu");
	}
	
}

class car extends vehicle{
	
}
class truck extends vehicle{
	
}


public class inheritance {
	public static void main(String[] args) {
		car veh= new car();
		veh.stop();
		truck trc= new truck();
		trc.stop();		
		veh.stop();
	}
}
