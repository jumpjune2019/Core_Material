
public class Main {

	public static void main(String[] args) {
		ColorTriangle t1 = new ColorTriangle("Blue", "outlined", 8.0, 12.0);

		System.out.println("Info for t1: ");
		t1.showStyle();
		t1.showDim();
		t1.showColor();
		System.out.println("Area for t1 is: " + t1.area());
		System.out.println("Width for t1 is: " + t1.getWidth());

	}

}
