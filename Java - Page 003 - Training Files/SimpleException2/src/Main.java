
public class Main {

	public static void main(String[] args) {
		try {
			ExcTest.genException();
		}
		catch (ArrayIndexOutOfBoundsException exc) {
			System.out.println("Index out-of-bounds.");
		}
		System.out.println("After catch statement.");

	}

}
