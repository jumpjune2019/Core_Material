
public class Triangle extends TwoDShape {

	private String style;
	
	Triangle(String s, double w, double h) {
		super(w, h);
		style = s;
	}
	
	double area() {
		// return width * height / 2; // this is an error, can't access as these are private in TwoDShape
		return getWidth() * getHeight() / 2;
	}
	
	void showStyle() {
		System.out.println("Triangle is " + style);
	}
	
}
