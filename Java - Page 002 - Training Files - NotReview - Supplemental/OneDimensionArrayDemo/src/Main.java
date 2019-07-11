
public class Main {

	public static void main(String[] args) {
		int nums[] = {99, -10, 100123, 18, -978, 5623, 463, -9, 287, 49};
		int i, min, max;
		int l = nums.length;
		min = max = nums[0];
		
		for(i = 1; i < l; i++) {
			if(nums[i] < min) {
				min = nums[i];
			}
			if(nums[i] > max) {
				max = nums[i];
			}
		}
		
		System.out.println("min is: " + min + " and max is: " + max);
		

	}

}
