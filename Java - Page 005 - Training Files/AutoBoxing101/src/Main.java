
public class Main {

	public static Integer playWithIOB(Integer i) {
		i = 200;
		return i;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer iOb = 100; // autoboxing an int
		int i = iOb; // autounboxing
		System.out.println(i + " " + iOb); // displays 100 100
		iOb = playWithIOB(iOb);
		System.out.println(i + " " + iOb); 
	}

}
