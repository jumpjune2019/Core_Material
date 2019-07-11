
public class Main {

	public static void main(String[] args) {
		try {
			Rethrow.genException();
		} catch (ArrayIndexOutOfBoundsException exc) {
			System.out.println("Fatal Error - program terminated.");
		}

	}

}
