
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, c;
		a = 2;
		b = 3;

		if(a < b) {
			System.out.println("a is less than b");
		}
		
		if(a == b) {
			System.out.println("a is equal to b");
		}
		
		System.out.println();
		
		c = a - b;
		
		System.out.println("c is equal to: " + c);
		
		if(c >= 0) {
			System.out.println("c is non-negative");
		} else {
			System.out.println("c is negative");
		}

		System.out.println();
		
		c = b - a;
		
		System.out.println("c is equal to: " + c);
		
		if(c >= 0) {
			System.out.println("c is non-negative");
		} else {
			System.out.println("c is negative");
		}
		
		
	}

}
