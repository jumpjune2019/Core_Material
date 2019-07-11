import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
// bin directory
// java Main Test.txt // Test2.txt (command prompt)
public class Main {

	public static void main(String[] args) {
		int i;
		FileInputStream fin = null;

		if(args.length != 1) {
			System.out.println("Usage: ShowFile file");
			return;
		}
		
		try {
			fin = new FileInputStream(args[0]);
			do {
				i = fin.read();
				if(i != -1) {
					System.out.print((char) i);
				}
			} while (i != -1);
		} catch (FileNotFoundException exc) {
			System.out.println("File Not Found.");
			return;
		} catch (IOException exc) {
			System.out.println("Error reading file.");
		} finally {
			try {
				if(fin != null) {
					fin.close();
				}
			} catch(IOException exc) {
				System.out.println("Error closing file.");	
			}
 		}
		

	}

}
