
public class Triangle extends TwoDShape {
	
	private String style;

	public Triangle() {
		super();
		style = "none";
		// TODO Auto-generated constructor stub
	}
	
	public Triangle(String s, double w, double h) {
		super(w, h);
		style = s;
	}
	
	public Triangle(double x) {
		super(x);
		style = "filled";
	}
	
	double area() {
		return getWidth() * getHeight() / 2;
	}
	
	void showStyle() {
		System.out.println("Triange is " + style);
	}
	
}
