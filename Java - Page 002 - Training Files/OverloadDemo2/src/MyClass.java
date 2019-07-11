
public class MyClass {

	int x;
	
	MyClass() {
		System.out.println("Inside MyClass();.");
		x = 0;
	}
	
	MyClass(int i) {
		System.out.println("Inside MyClass(int);.");
		x = i;
	}

	MyClass(double d) {
		System.out.println("Inside MyClass(double);.");
		x = (int) d;
	}

	MyClass(int i, int j) {
		System.out.println("Inside MyClass(int, int);.");
		x = i * j;
	}
	
}
