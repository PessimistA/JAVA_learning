package exam_work2;

import java.awt.datatransfer.Clipboard;

public class Main {
	public static void main(String[] args) {
		bike bikeeBike= new bike("els", 12, 2, 0);
		System.out.println(bikeeBike.toString());
		bikeeBike.honk();
		bikeeBike.drift();
		
		boat btBoat = new boat("armada", 100, 900000, true);
		System.out.println(btBoat.toString()+btBoat.sail());
		btBoat.sail();
		}
}
