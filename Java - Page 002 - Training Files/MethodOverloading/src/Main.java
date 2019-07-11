
public class Main {

	public static void main(String[] args) {
		Overload ob = new Overload();
		int resI;
		double resD;
		
		ob.ovlDemo();
		System.out.println();
		
		ob.ovlDemo(2);
		System.out.println();
		
		resI = ob.ovlDemo(4, 6);
		System.out.println("Result of ob.ovlDemo(4,6): " + resI);

		System.out.println();
		
		
		resD = ob.ovlDemo(1.1, 2.32);
		System.out.println("Result of ob.ovlDemo(1.1, 2.32): " + resD);

		System.out.println();
		System.out.println();

		Overload2 ob2 = new Overload2();
		
		int i = 10;
		double d = 10.1;
		
		byte b = 99;
		short s = 10;
		float f = 11.5F;
		
		ob2.f(i);
		ob2.f(d);
		
		ob2.f(b);
		ob2.f(s);
		ob2.f(f);
		

	}

}
