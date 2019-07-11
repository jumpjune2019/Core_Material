
public class Main {

	public static void main(String[] args) {
		int numer[] = { 4, 8, 16, 32, 128, 256, 512 };
		int denom[] = { 2, 0, 4, 4, 0, 8};
		
		for(int i = 0; i < numer.length; i++) {
			try {
				System.out.println(numer[i] + " / " + denom[i] + " = " + numer[i] / denom[i]);
			} catch(Throwable exc) {
				System.out.println("Some exception has occured: " + exc.getMessage());
			}
		}

	}

}
