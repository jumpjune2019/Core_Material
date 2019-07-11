
public class PassObRef {

	int a, b;
	
	public PassObRef(int i, int j) {
		a = i;
		b = j;
	}
	
	void change(PassObRef ob) {
		ob.a = ob.a + ob.b;
		ob.b = -ob.b;
	}
	
	

}
