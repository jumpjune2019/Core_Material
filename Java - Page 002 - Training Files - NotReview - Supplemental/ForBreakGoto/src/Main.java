
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		
		for(i = 1; i < 4; i++) {
			
			one: {
				
				two: {
			
					three: {
			
						System.out.println("\ni is " + i);
						if(i == 1) {
							break one;
						}
						if(i == 2) {
							break two;
						}
						if(i == 3) {
							break three;
						}
			
						System.out.println("This will never print");
					}
					System.out.println("After Block Three");
				}
				System.out.println("After Block Two");
			}
			System.out.println("After Block One");
		}
		System.out.println("After For.");
	}

}
