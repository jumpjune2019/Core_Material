
public class Main {

	public static void main(String[] args) {

		MyClass t1 = new MyClass();
		MyClass t2 = new MyClass(88);
		MyClass t3 = new MyClass(17.23);
		MyClass t4 = new MyClass(2, 4);

		
		System.out.println("\n");
		
		System.out.println("t1.x: " + t1.x);
		System.out.println("t2.x: " + t2.x);
		System.out.println("t3.x: " + t3.x);
		System.out.println("t4.x: " + t4.x);
	
		System.out.println("\n");
		
		Summation s1 = new Summation(5);
		Summation s2 = new Summation(s1);
		
		System.out.println("\n");
		
		System.out.println("s1.num: " + s1.sum);
		System.out.println("s2.num: " + s2.sum);
				
				
				
		
	}

}
