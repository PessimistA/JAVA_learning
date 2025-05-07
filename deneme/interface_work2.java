package deneme;

abstract class a{
	int af=0;
	public void print() {
		System.out.println("a");
	}
	abstract void metghod();
}
class b extends a{
	public void print() {
		System.out.println("b");
	}
	@Override
	void metghod() {
		// TODO Auto-generated method stub
		System.out.println("yey");
	}
}
abstract class c extends a{
	public void print() {
		System.out.println("c");
	}
}

public class interface_work2 {
	public static void main(String[] args) {
		a myA = new b();
		myA.print();
	}
}
