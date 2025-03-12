import java.util.Iterator;

class geometry{
	protected int width;
	protected int lenght;
	
	public geometry(int width,int lenght) {
		this.width= width;
		this.lenght=lenght;
	}
}

class square extends geometry{
	public square(int width,int lenght){
		super(width, lenght);
	}
	
	public void print() {
		for (int i = 0; i <width; i++) {
			for (int j = 0; j < lenght; j++) {
				System.out.printf("*");
			}
			System.out.printf("\n");
		}
	}
}
class rectangle extends geometry{
	public rectangle(int width,int lenght){
		super(width, lenght);
	}
	
	public void print() {
		for (int i = 0; i <width; i++) {
			for (int j = 0; j < lenght; j++) {
				System.out.printf("*");
			}
			System.out.printf("\n");		
		}
	}
}
class triangular extends geometry{
	public triangular(int lenght){
		super(0, lenght);
	}
	
	public void Left_triangular() {
		for (int i = 0; i <=lenght; i++) {
			for (int j = 0; j < i; j++) {
				System.out.printf("*");
			}
			System.out.printf("\n");		
		}
	}
	public void right_triangular() {
		for (int i = 0; i <=lenght; i++) {
			for (int j = 0; j < i; j++) {
				System.out.printf(" ");
			}
			
			for (int j = i; j < lenght; j++) {
				System.out.printf("*");
			}
			System.out.printf("\n");		
		}
	}
	public void middle_triangular() {
		for (int i = 0; i <=lenght; i++) {
			for (int j = lenght-i; j >0; j--) {
				System.out.printf(" ");
			}
			
			for (int j = 0; j <2*i-1; j++) {
				System.out.printf("*");
			}
			System.out.printf("\n");		
		}
	}
}

public class shapes {
	public static void main(String[] args) {
		triangular squar= new triangular( 4);
		squar.middle_triangular();
		
	}
}
