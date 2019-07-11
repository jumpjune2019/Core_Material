import java.io.*;

public class Main {

	public static void main(String[] args) {
		String s;
		
		try (BufferedReader br = new BufferedReader(new FileReader("D:\\JAVA1.8\\JavaTraining\\IOFileReader\\src\\test.txt"))) {
			while ((s = br.readLine()) != null) {
				System.out.println(s);
			}
			
		} catch(IOException exc) {
			System.out.println("IO Error: " + exc);
		}

	}

}
