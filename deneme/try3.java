package deneme;

interface works{
	public void Rentable();
	public void FuelConsumable();
}
abstract class vehicle{
	String nameString;
	String modelString;
	String markaString;
	
	public vehicle(String nameString, String modelString, String markaString) {
		this.nameString = nameString;
		this.modelString = modelString;
		this.markaString = markaString;
	}
	public String getNameString() {
		return nameString;
	}
	public void setNameString(String nameString) {
		this.nameString = nameString;
	}
	public String getModelString() {
		return modelString;
	}
	public void setModelString(String modelString) {
		this.modelString = modelString;
	}
	public String getMarkaString() {
		return markaString;
	}
	public void setMarkaString(String markaString) {
		this.markaString = markaString;
	}
	abstract void showinfo();
}
class car extends vehicle implements works{

	public car(String nameString, String modelString, String markaString) {
		super(nameString, modelString, markaString);
		showinfo();
		Rentable();
		FuelConsumable();
	}
	@Override
	void showinfo() {
		// TODO Auto-generated method stub
		System.out.println("name: "+nameString+" model: "+modelString+" marka: "+markaString);
	}
	@Override
	public void Rentable() {
		// TODO Auto-generated method stub
		System.out.println("this car is rentable");
	}
	@Override
	public void FuelConsumable() {
		// TODO Auto-generated method stub
		System.out.println("this car is fuel consymable");
	}
	
}
class bike extends vehicle implements works{

	public bike(String nameString, String modelString, String markaString) {
		super(nameString, modelString, markaString);
		showinfo();
		Rentable();
		FuelConsumable();
	}
	void showinfo() {
		// TODO Auto-generated method stub
		System.out.println("name: "+nameString+" model: "+modelString+" marka: "+markaString);
	}
	@Override
	public void Rentable() {
		// TODO Auto-generated method stub
		System.out.println("this bike is rentable");
	}
	@Override
	public void FuelConsumable() {
		// TODO Auto-generated method stub
		System.out.println("this bike is fuel consymable");
	}
	
}
class truck extends vehicle implements works{

	public truck(String nameString, String modelString, String markaString) {
		super(nameString, modelString, markaString);
		showinfo();
		Rentable();
		FuelConsumable();
	}
	void showinfo() {
		// TODO Auto-generated method stub
		System.out.println("name: "+nameString+" model: "+modelString+" marka: "+markaString);
	}
	@Override
	public void Rentable() {
		// TODO Auto-generated method stub
		System.out.println("this truck is rentable");
	}
	@Override
	public void FuelConsumable() {
		// TODO Auto-generated method stub
		System.out.println("this truck is fuel consymable");
	}
	
	
}

public class try3 {
	public static void main(String[] args) {
		vehicle myCar = new car("s", "a", "f");
		vehicle mybike= new bike("as", "s", "a");
		vehicle mytruck = new truck("asd", "da", "daa");
	}
}
