
public class Pwr {

	double val;
	int e;
	double b;
	
	Pwr(double b, int e) {
		
		this.b = b;
		this.e = e;
		
		this.val = 1;
		
		if(e == 0) {
			return;
		}
		for( ; e > 0; e--) {
			val = val * b;
		}
		
	}
	
	void print() {
		System.out.println(this.b + " raised to the " + this.e + " power is " + this.val);
	}
	
	

}
