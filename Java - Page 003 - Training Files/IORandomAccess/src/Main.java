import java.io.*;

public class Main {

	public static void main(String[] args) {
		double data[] = { 19.4, 10.1, 123.54, 33.0, 87.9, 74.25 };
		double d;
		
		try (RandomAccessFile raf = new RandomAccessFile("random.dat", "rw")) {
			for(int i = 0; i < data.length; i++) {
				raf.writeDouble(data[i]);
			}
			
			raf.seek(0);
			d = raf.readDouble();
			System.out.println("First value is: " + d);
			
			raf.seek(8);
			d = raf.readDouble();
			System.out.println("Second value is: " + d);
			
			raf.seek(8 * 3);
			d = raf.readDouble();
			System.out.println("Fourth value is: " + d);
			
			
			System.out.println("\nLet's list all the values using a for loop\n");
			
			for(int i = 0; i < data.length; i++) {
				raf.seek(8 * i);
				d = raf.readDouble();
				System.out.println("Index: " + i + " is: " + d);
			}
			
		} catch(IOException exc) {
			System.out.println("IO Error: " + exc);
		}

	}

}
