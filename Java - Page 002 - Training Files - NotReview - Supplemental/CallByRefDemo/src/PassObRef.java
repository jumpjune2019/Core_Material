public class PassObRef {

	public static void main(String args[]) {
		Test ob = new Test(15, 20);
		Test ob2 = ob;
		System.out.println("ob.a and ob.b before call: " + ob.a + " " + ob.b);
		System.out.println("ob2.a and ob2.b before call: " + ob2.a + " " + ob2.b);
		ob.change(ob);
		System.out.println("ob.a and ob.b after call: " + ob.a + " " + ob.b);
		System.out.println("ob2.a and ob2.b after call: " + ob2.a + " " + ob2.b);
	}
}

