package deneme;

interface playSong{
	static int songplace=0;
	void play();
	void pause();
	void stop();
	abstract void choosepart();
	static int startagain() {
		 return songplace;
	}
}
class songs{
	private String songName;
	private String artistName;
    private float time;
    private String filePath;

	public songs(String songName, String artistName, float time, String filePath) {
		this.songName = songName;
		this.artistName = artistName;
		this.time = time;
		this.filePath = filePath;
	}
	public String getSongName() {
		return songName;
	}
	public void setSongName(String songName) {
		this.songName = songName;
	}
	public String getArtistName() {
		return artistName;
	}
	public void setArtistName(String artistName) {
		this.artistName = artistName;
	}
	public float getTime() {
		return time;
	}
	public void setTime(float time) {
		this.time = time;
	}
	public String getFilePath() {
		return filePath;
	}
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
}
abstract class rock extends songs implements playSong{
	public rock(String songName, String artistName, float time, String filePath) {
		super(songName, artistName, time, filePath);
		choosepart();
		play();
		stop();
		pause();
	}
	@Override
	public void choosepart() {
		// TODO Auto-generated method stub
		System.out.println("yer seçildi");
	}
	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("ybaşladı");
	}
	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("durdu");
	}
	@Override
	public void pause() {
		// TODO Auto-generated method stub
		System.out.println("duraklatıldı");
	}
	public abstract void showinfo();
}
class heavyRock extends rock implements playSong{

	public heavyRock(String songName, String artistName, float time, String filePath) {
		super(songName, artistName, time, filePath);
		showinfo();
	}
	public void showinfo() {
		// TODO Auto-generated method stub
		System.out.println("heavyRock [getSongName()=" + getSongName() + ", getArtistName()=" + getArtistName() + ", getTime()="
				+ getTime() + ", getFilePath()=" + getFilePath() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]");
	}
}
abstract class bilmemne{
	int a =0;//abstract metod zorunlu değil
}
class normal extends heavyRock{

	public normal(String songName, String artistName, float time, String filePath) {
		super(songName, artistName, time, filePath);
	}
	
}

public class interface_work1 {
	public static void main(String[] args) {
		songs myHeavyRock = new normal("hello", "world", 132, "jhasdkja");
	}
}
