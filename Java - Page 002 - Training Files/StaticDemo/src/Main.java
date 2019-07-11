
public class Main {

	public static void main(String[] args) {
		StaticDemo s1 = new StaticDemo();
		StaticDemo s2 = new StaticDemo();
		
		System.out.println("s1.getCount(): " + s1.getCount());

		System.out.println("testing StaticClass test method: " + StaticClass.test(10));
		
		System.out.println("\n\n");
		
		StaticBlock ob = new StaticBlock("\n\nInside Constructor.");
		
		System.out.println("Square Root of 2 is " + StaticBlock.rootOf2);
		System.out.println("Square Root of 3 is " + StaticBlock.rootOf3);
		
	}

}
