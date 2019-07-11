class SumArray {
	private int sum;
	synchronized int sumArray(int nums[]) {
		sum = 0; // reset sum
		for(int i=0; i<nums.length; i++) {
			sum += nums[i];
			System.out.println("Running total for " +
			Thread.currentThread().getName() + " is " + sum);
			try {
				Thread.sleep(10); // allow task-switch
			}
			catch(InterruptedException exc) {
				System.out.println("Thread interrupted.");
			}
		}
		return sum;
	}
}