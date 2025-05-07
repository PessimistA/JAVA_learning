package deneme;

interface animals{
	public String nameString="cute animal";
	public void bark();
	public void eat() ;//body yazılamaz
	abstract void dosomething();//body yazılamaz
	static public void method() {//body yazılmalıdır
		System.out.println("hello");
	}
    private void helper() {//body yazılmalıdır
        System.out.println("Used inside default methods");
    }
}

class dog implements animals{
	@Override
	public void dosomething() {
		// TODO Auto-generated method stub
		
	}
	public void bark() {
		System.out.println(nameString+" hav hav");
	}
	public void eat() {
		System.out.println(nameString+" kemik yedi");

	}
	
	static public void method() {
		System.out.println("hello");
	}
}
class cat implements animals {
    public void bark() {
        System.out.println("Meow!");
    }

    public void eat() {
        System.out.println("kedi süt içti.");
    }
    @Override
    public void dosomething() {
    	// TODO Auto-generated method stub
    	
    }
}

public class start {
	public static void main(String[] args) {
		animals mycatAnimals = new cat();
		animals mydogAnimals = new dog();
		mycatAnimals.bark();
		mydogAnimals.bark();
		mycatAnimals.eat();
		mydogAnimals.eat();
		System.out.println(animals.nameString);
	}
}
