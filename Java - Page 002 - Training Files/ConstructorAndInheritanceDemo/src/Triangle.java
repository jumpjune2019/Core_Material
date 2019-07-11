public class Triangle extends TwoDShape {
		private String style;
		
		Triangle (String s, double w, double h) {
			setWidth(w); // from TwoDShape 
			setHeight(h); // from TwoDShape
			style = s;
		}
		
		double area() {
			return getWidth() * getHeight() / 2;
		}
		
		void showStyle() {
			System.out.println("Triangle is: " + style);
		}
}
