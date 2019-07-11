
public class TwoDShape {

	private double width;
	// double width;
	private double height;
	
	TwoDShape (double w, double h) {
		setWidth(w);
		setHeight(h);
	}
	
	double getWidth() {
		return width;
	}
	
	double getHeight() {
		return height;
	}
	
	void setWidth(double w) {
		width = w;
	}
	
	void setHeight(double h) {
		height = h;
	}
	
	void showDim() {
		System.out.println("Width is: " + width + " and height is: " + height);
	}


}
