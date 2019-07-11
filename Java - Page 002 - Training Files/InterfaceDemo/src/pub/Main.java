package pub;

public class Main {

	public static void main(String[] args) {
		ByTwos twoOb = new ByTwos();
		ByThrees threeOb = new ByThrees();
		Series ob;
		
		for(int i = 0; i < 5; i++) {
			ob = twoOb;
			System.out.println("Next value is " + ob.getNext());
			ob = threeOb;
			System.out.println("Next value is " + ob.getNext());
		}
		System.out.println("\nResetting");
		twoOb.reset();
		threeOb.reset();
		for(int i = 0; i < 5; i++) {
			ob = twoOb;
			System.out.println("Next value is " + ob.getNext());
			ob = threeOb;
			System.out.println("Next value is " + ob.getNext());
		}
		System.out.println("\nStarting at 100");
		twoOb.setStart(100);
		threeOb.setStart(100);
		for(int i = 0; i < 5; i++) {
			ob = twoOb;
			System.out.println("Next value is " + ob.getNext());
			ob = threeOb;
			System.out.println("Next value is " + ob.getNext());
		}

	}

}
