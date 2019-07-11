
public class Main {

	public static void main(String[] args) {
		
		CallByValue ob = new CallByValue();
		int a = 15, b = 20;
		System.out.println("a and b before call: " + a + " " + b);
		ob.NoChange(a,  b);
		System.out.println("a and b after call: " + a + " " + b);
		
		System.out.println("\n\n\n");
		
		PassObRef ob1 = new PassObRef(15, 20);
		System.out.println("ob.a and ob.b before call: " + ob1.a + " " + ob1.b);
		ob1.change(ob1);
		System.out.println("ob.a and ob.b after call: " + ob1.a + " " + ob1.b);
		
		
		
	}

}
