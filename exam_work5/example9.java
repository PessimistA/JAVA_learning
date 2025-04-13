package exam_work5;



class TV{
	public int channel;
	public int volume;
	public boolean status;
	public TV(int channel,int volume,boolean status) {
		this.channel = (channel>0&&channel<100)?channel:0;
		this.volume = (volume>0&&volume<100)?volume:0;
		this.status = status;
		if (status) {
			turnOn();
		}
		else {
			turnoff();
		}
	}
	
	public int getChannel() {
		return channel;
	}

	public int getVolume() {
		return volume;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public void turnOn() {
		System.out.println("televizyon açıldı");
	}
	public void turnoff() {
		System.out.println("televizyon kapatıldı görüşmek üzere");
	}
	public void settCHannel(int chno) {
		this.channel= chno;
	}
	public void settvolume(int volno) {
		this.volume=volno;
	}
	public void channelup() {
		System.out.println("channel: "+(channel++));
	}
	public void channeldown() {
		int a= getChannel();
		System.out.println("channel: "+(channel--));
	}
	public void volumeup() {
		int a= getVolume();
		System.out.println("volume: "+(volume++));
	}
	public void volumedown() {
		int a= getVolume();
		System.out.println("volume: "+(volume--));
	}
}


public class example9 {
	public static void main(String[] args) {
		TV myTv = new TV(12, 7, true);
		myTv.channelup();
		myTv.channelup();
		myTv.volumedown();
		myTv.volumedown();
		myTv.turnoff();
	}
}
