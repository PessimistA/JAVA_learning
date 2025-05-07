package deneme;

import java.security.PublicKey;
import java.time.Duration;

import javax.swing.border.TitledBorder;

interface playable{
	public void play();
	public void pause();
	public void stop();
}
abstract class mediaItem implements playable{
	private String titleString;
	private double duration;
	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("şarkı oynatıldı");
	}
	@Override
	public void pause() {
		// TODO Auto-generated method stub
		System.out.println("şarkı duraklatıldı");
	}
	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("şarkı durduruldu");
	}
	public abstract void displayInfo();
}
class song extends mediaItem{
	public String artiString;
	public String genreString;
	@Override
	public void displayInfo() {
		// TODO Auto-generated method stub
		System.out.println("artist: "+artiString+" genre: "+genreString);
	}
	
}
class podcast extends mediaItem{
	public String hostString;
	public String genreString;
	@Override
	public void displayInfo() {
		// TODO Auto-generated method stub
		System.out.println("artist: "+hostString+" genre: "+genreString);
	}
}
class episode extends podcast{
	public String titleString;
	public int episodenumber;
	public double duration;
}

class playlist{
	public String nameString;
	public void addmediaitem(mediaItem media) {
		
	}
	public void playall() {
		
	}
}

public class musiz {
	public static void main(String[] args) {
		
	}
}
