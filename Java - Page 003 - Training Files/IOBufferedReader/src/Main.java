import java.io.*;

public class Main {

	public static void main(String[] args) {
		char c;
		int cc;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter characters, period to quit.");
		
		try {
			do {
				c = (char) br.read();
				cc = (int) c;
				if(cc != 13) {
					System.out.print(c);					
				} else {
					System.out.println();
				}
			} while (c != '.');
			br.close();
			System.out.println("\n\nInput Stream is now closed.");
			
		} catch(IOException exc) {
			System.out.println("Error in I/O");
		}
	}

}
