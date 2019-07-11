
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean p, q;
		
		System.out.println("P\tQ\tAND\tOR\tXOR\tNOT");
		
		p = true; q = true;
		
		System.out.print(p + "\t" + q + "\t");
		System.out.print((p&q) + "\t" + (p|q) + "\t");
		System.out.println((p^q) + "\t" + (!p) + "\t");

		p = true; q = false;
		
		System.out.print(p + "\t" + q + "\t");
		System.out.print((p&q) + "\t" + (p|q) + "\t");
		System.out.println((p^q) + "\t" + (!p) + "\t");
				
		p = false; q = true;
		
		System.out.print(p + "\t" + q + "\t");
		System.out.print((p&q) + "\t" + (p|q) + "\t");
		System.out.println((p^q) + "\t" + (!p) + "\t");
			
		
		p = false; q = false;
		
		System.out.print(p + "\t" + q + "\t");
		System.out.print((p&q) + "\t" + (p|q) + "\t");
		System.out.println((p^q) + "\t" + (!p) + "\t");

		System.out.println();
		
		System.out.println("P\tQ\tAND\tOR\tXOR\tNOT");
		
		p = true; q = true;
		
		System.out.print((p ? "1" : "0") + "\t" + (q ? "1" : "0") + "\t");
		System.out.print(((p&q) ? "1" : "0") + "\t" + ((p|q) ? "1" : "0") + "\t");
		System.out.println(((p^q) ? "1" : "0") + "\t" + ((!p) ? "1" : "0") + "\t");

		p = true; q = false;
		
		System.out.print((p ? "1" : "0") + "\t" + (q ? "1" : "0") + "\t");
		System.out.print(((p&q) ? "1" : "0") + "\t" + ((p|q) ? "1" : "0") + "\t");
		System.out.println(((p^q) ? "1" : "0") + "\t" + ((!p) ? "1" : "0") + "\t");
				
		p = false; q = true;
		
		System.out.print((p ? "1" : "0") + "\t" + (q ? "1" : "0") + "\t");
		System.out.print(((p&q) ? "1" : "0") + "\t" + ((p|q) ? "1" : "0") + "\t");
		System.out.println(((p^q) ? "1" : "0") + "\t" + ((!p) ? "1" : "0") + "\t");
			
		
		p = false; q = false;
		
		System.out.print((p ? "1" : "0") + "\t" + (q ? "1" : "0") + "\t");
		System.out.print(((p&q) ? "1" : "0") + "\t" + ((p|q) ? "1" : "0") + "\t");
		System.out.println(((p^q) ? "1" : "0") + "\t" + ((!p) ? "1" : "0") + "\t");
		
		
		
	}

}
