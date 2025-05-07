package deneme;

interface a1{
	void printa1();
}
interface a2{
	void printa2();
}

interface a3{
	void printa1();//aynı isimli olduğundan bunu görmüyor
	void printa3();
}
interface a4{
	abstract void printa4();
}

class b1 implements a1,a2,a3{
	public b1() {
		// TODO Auto-generated constructor stub
		printa1();
		printa2();
		printa3();
	}
	@Override
	public void printa1() {
		// TODO Auto-generated method stub
		System.out.println("a1");
	}
	@Override
	public void printa2() {
		// TODO Auto-generated method stub
		System.out.println("a2");
	}
	@Override
	public void printa3() {
		// TODO Auto-generated method stub
		System.out.println("a3");
	}
}
class b2 implements a1,a2,a3{//2. olanda da yazmalısın yoksa hata alırsın abstract gibi değil
	public b2() {
		// TODO Auto-generated constructor stub
		printa1();
		printa2();
		printa3();
	}
	@Override
	public void printa1() {
		// TODO Auto-generated method stub
		System.out.println("a1");
	}
	@Override
	public void printa2() {
		// TODO Auto-generated method stub
		System.out.println("a2");
	}
	@Override
	public void printa3() {
		// TODO Auto-generated method stub
		System.out.println("a3");
	}
}

class b3 implements a4{
	public b3() {
		// TODO Auto-generated constructor stub
		printa4();
	}
	@Override
	public void printa4() {
		// TODO Auto-generated method stub
		System.out.println("a4");
	}
}
public class interface_work3 {
	public static void main(String[] args) {
		b1 myB1 = new b1();
		b2 myB2 = new b2();
		b3 myB3 = new b3();
		//polimorphism
		a1 myB4 = new b1();
		a2 myB5 = new b2();
		a4 myB6 = new b3();

	}
}
