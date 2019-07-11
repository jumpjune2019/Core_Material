import java.io.*;

public class Main {

	public static void main(String[] args) {
		String str;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter text ('stop' to quit).");
		boolean breakLoop = false;
		try (FileWriter fw = new FileWriter("test.txt")) {
			do {
				System.out.print(" ");
				str = br.readLine();
				if(breakLoop = str.compareTo("stop") == 0) {
					break;
				}
				str = str + "\r\n";
				fw.write(str);
			} while (breakLoop == false);
			
		} catch (IOException exc) {
			System.out.println("I/O Error: " + exc);
		}

	}

}
