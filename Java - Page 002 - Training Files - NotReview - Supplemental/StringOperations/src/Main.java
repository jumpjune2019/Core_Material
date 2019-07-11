
public class Main {

	public static void main(String[] args) {
		String str1 = "When it comes to Web Programming, Java is #2.";
		String str2 = new String(str1);
		String str3 = "Java strings are powerful.";
		String str4 = str1;
		
		int result, idx;
		char ch;
		
		System.out.println("Length of str1: " + str1.length());
		
		for(int i = 0; i < str1.length(); i++) {
			System.out.print(str1.charAt(i));
		}
		System.out.println();
		
		System.out.println(".equal");
		if(str1.equals(str2)) {
			System.out.println("str1 equals str2");
		} else {
			System.out.println("str1 does not equals str2");
		}
		
		System.out.println("str1 == str2");

		if(str1 == str2) {
			System.out.println("str1 == str2");
		} else {
			System.out.println("str1 does not == str2");
		}

		System.out.println("str1 == str4");

		if(str1 == str4) {
			System.out.println("str1 == str4");
		} else {
			System.out.println("str1 does not == str4");
		}
		
		
		System.out.println(".compareTo str2");

		result = str1.compareTo(str2);
		
		if(result == 0) {
			System.out.println("str1 and str2 are equal");
		} else if (result < 0 ){
			System.out.println("str1 is less than str2");
		} else {
			System.out.println("str1 is greater than str2");
		}

		System.out.println(".compareTo str3");

		result = str1.compareTo(str3);
		
		if(result == 0) {
			System.out.println("str1 and str3 are equal");
		} else if (result < 0 ){
			System.out.println("str1 is less than str3");
		} else {
			System.out.println("str1 is greater than str3");
		}
		

		System.out.println("indexOf");

		str2 = "One Two Three One";
		
		idx = str2.indexOf("One");
		System.out.println("Index of first occurance of One: " + idx);
		
		idx = str2.lastIndexOf("One");
		System.out.println("Index of last occurance of One: " + idx);
		
		
		System.out.println("\nTesting Arrays of Strings\n");
		String strs[] = {"This", "is", "a", "test"};
		String container = String.join(" ", strs);
		
		System.out.print(container);
		
		System.out.println("\nTesting substring\n");
		String substr = container.substring(5, 10);
		
		System.out.print(substr);
		
		
		System.out.println("\nTesting args as main signature\n");
		
		String arguments = String.join(" ", args);
		
		System.out.print(arguments);
		
		
	}

}
