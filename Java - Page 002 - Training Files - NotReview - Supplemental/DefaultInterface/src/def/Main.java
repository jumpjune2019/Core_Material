package def;

public class Main {

	public static void main(String[] args) {
		MyIFImp obj = new MyIFImp();
		MyIFImp2 obj2 = new MyIFImp2();

		MyIF ob;
		
		ob = obj;
		System.out.println("First Implementation");
		System.out.println("User ID is: " + ob.getUserID());
		System.out.println("Admin ID is: " + ob.getAdminID());
		
		ob = obj2;
		System.out.println("Second Implementation");
		System.out.println("User ID is: " + ob.getUserID());
		System.out.println("Admin ID is: " + ob.getAdminID());		
		
		System.out.println();
		System.out.println("Static call: " + MyIF.getUniversalID());
		
	}

}
