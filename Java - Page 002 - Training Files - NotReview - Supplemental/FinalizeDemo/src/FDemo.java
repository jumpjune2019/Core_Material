
public class FDemo {
	
	int x;

	public FDemo(int i) {
		x = i;
	}
	
	protected void finalize() {
		System.out.println("Finalizing: " + x);
	}
	
	void generator(int i) {
		FDemo o = new FDemo(i);
	}

}
