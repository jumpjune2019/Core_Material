
public class Main {

	public static void main(String[] args) {
		VarArgs.vaTest("... should be last", 10);
		VarArgs.vaTest("... should be last", 1, 2, 3);
		VarArgs.vaTest("... should be last");
	}

}
