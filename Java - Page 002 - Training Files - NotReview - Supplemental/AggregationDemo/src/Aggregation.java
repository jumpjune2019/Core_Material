
public class Aggregation {

	int nums[];
	
	Aggregation(int n[]) {
		nums = n;
	}
	
	void analyze() {
		Functions f = new Functions();
		System.out.println("Minimum: " + f.min());
		System.out.println("Maximum: " + f.max());
		System.out.println("Total: "   + f.sum());
		System.out.println("Average: " + f.avg());
		
	}
	
	class Functions {
		
		int min() {
			int m = nums[0];
			for(int i = 1; i < nums.length; i++) {
				if(nums[i] < m) {
					m = nums[i];
				}
			}
			return m;
		}
		
		int max() {
			int m = nums[0];
			for(int i = 1; i < nums.length; i++) {
				if(nums[i] > m) {
					m = nums[i];
				}
			}
			return m;
		}
		
		int avg() {
			int a = sum();
			return a / nums.length;
		}
		
		int sum() {
			int a = 0;
			for(int i = 0; i < nums.length; i++) {
				a += nums[i];
			}
			return a;
		}
		
	}
	


}
