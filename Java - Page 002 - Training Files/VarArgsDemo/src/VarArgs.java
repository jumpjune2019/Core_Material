
public class VarArgs {

	static void vaTest(String msg, int ... v) {
		System.out.println("Msg: " + msg);
		System.out.println("Number of args: " + v.length);
		System.out.print("Contents: ");
		for(int i = 0; i < v.length; i++) {
			System.out.print(v[i] + " ");
		}
		System.out.println("\n\n");
	}
	

}
