
public class NonIntResultException extends Exception {

	int n, d;
	
	public NonIntResultException(int i, int j) {
		n = i;
		d = j;
	}
	
	public String toString() {
		return "Result of " + n + " / " + d + " is non-integer.";
	}

}
