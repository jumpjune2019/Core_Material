
public class TwoDShape {

	private double width;
	private double height;
	
	public TwoDShape() {
		width = height = 0.0;
	}
	
	public TwoDShape(double w, double h) {
		width = w;
		height = h;
	}
	
	public TwoDShape(double x) {
		width = height = x;
	}
	
	double getWidth() {
		return width;
	}
	
	void setWidth(double w) {
		width = w;
	}
	
	double getHeight() {
		return height;
	}
	
	void setHeight(double h) {
		height = h;
	}
	
	void showDim() {
		System.out.println("Width = " + getWidth() + ", Height = " + getHeight());
	}

}
