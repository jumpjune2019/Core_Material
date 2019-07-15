import java.io.*;
import java.util.Scanner;

public class Main {

	public static char getChar() throws java.io.IOException {
		char ch = ' ';
		Scanner br = new Scanner(System.in);
		ch = (char) br.nextInt();
		br.close();
		return ch;
	}
	
	public static boolean dealWithInput(char ch) {
    	if(!(ch == 'Q' || ch == 'q')) {
    		System.out.println("character is: " + ch);
    		return false;
    	} else {
    		return true;
    	}
		
	}
	
	public static void main(String[] args) throws java.io.IOException { 
		try {
		    char ch = 'i';
		    boolean flag = false;
		    
		    while(flag == false) {		    
		    	System.out.print("Please type a letter Q or q to quit: ");
		    	ch = getChar();
		    	flag = dealWithInput(ch);
		    }  
		    System.out.println("we are done!");
		} 
		catch( IOException e ) {
		    System.err.println( "Error: " + e );
		}
	}
}