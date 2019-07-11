
public class ExcTest {
	static void genException() {
		int nums[] = new int[4];
		System.out.println("Before exception is generated.");
		nums[7] = 10;
		System.out.println("This won't be displayed.");
	}
}
