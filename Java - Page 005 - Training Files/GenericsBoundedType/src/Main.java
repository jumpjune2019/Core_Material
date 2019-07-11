public class Main {
	public static void main(String args[]) {
		NumericFns<Integer> iOb = new NumericFns<Integer>(5);
		System.out.println("Reciprocal of iOb is " + iOb.reciprocal());
		System.out.println("Fractional component of iOb is " + iOb.fraction());
		System.out.println();
		NumericFns<Double> dOb = new NumericFns<Double>(5.25);
		System.out.println("Reciprocal of dOb is " + dOb.reciprocal());
		System.out.println("Fractional component of dOb is " + dOb.fraction());
		// This won't compile because String is not a
		// subclass of Number.
		// NumericFns<String> strOb = new NumericFns<String>("Error");
	}
}
