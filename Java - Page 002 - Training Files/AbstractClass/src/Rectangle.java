
public class Rectangle extends TwoDShape {

	Rectangle() {
		super();
	}

	Rectangle(double x) {
		super(x, "rectangle");
	}
	
	Rectangle(double w, double h) {
		super(w, h, "rectangle");
	}
	
	boolean isSquare() {
		if(getWidth() == getHeight()) {
			return true;
		}
		return false;
	}
	
	double area() {
		return getWidth() * getHeight();
	}
	
}
