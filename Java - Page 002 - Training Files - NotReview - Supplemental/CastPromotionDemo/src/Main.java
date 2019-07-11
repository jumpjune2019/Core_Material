
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b;
		int i;
		char ch1, ch2;
		
		b = 10;
		i = b * b;
		
		b = 10;
		b = (byte) (b * b);
		
		System.out.println("i and b: " + i + " " + b);
		
		System.out.println();
		
		ch1 = 'a';
		ch2 = 'b';
		
		ch1 = (char) (ch1 + ch2);
		
		System.out.println("ch1: " + ch1);
		
		
		System.out.println();
		
		for(i = 0; i < 5; i++) {
			System.out.println(i + " / 3: " + i / 3);
			System.out.println(i + " / 3 with fractions: " + (double) i / 3);
			System.out.println();
		}
		
		
	}

}
