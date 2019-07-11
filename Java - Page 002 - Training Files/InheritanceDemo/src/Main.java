
public class Main {

	public static void main(String[] args) {
		Triangle t1 = new Triangle("filled", 4.0, 4.0);
		Triangle t2 = new Triangle("outlined", 8.0, 12.0);
		TwoDShape d1 = new TwoDShape(4.0, 10.0);
		
		System.out.println("Info for t1: ");
		t1.showStyle();
		t1.showDim();
		System.out.println("Area is " + t1.area());

		System.out.println("\nInfo for t2: ");
		t2.showStyle();
		t2.showDim();
		System.out.println("Area is " + t2.area());
		System.out.println("Width is " + t2.getWidth());
		System.out.println("Height is " + t2.getHeight());
		
		System.out.println("Info for d1: ");
		System.out.println("Width is " + d1.getWidth());
		System.out.println("Height is " + d1.getHeight());
		// System.out.println("Width Property is " + d1.width);
		
	}

}
