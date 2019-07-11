// Demonstrate thread priorities.
class Priority implements Runnable {
	int count;
	Thread thrd;
	static boolean stop = false;
	static String currentName;
	/* Construct a new thread. Notice that this
	constructor does not actually start the threads running. */
	Priority(String name) {
		thrd = new Thread(this, name);
		count = 0;
		currentName = name;
	}
	// Begin execution of new thread.
	public void run() {
		System.out.println(thrd.getName() + " starting.");
		do {
			count++;
			if(currentName.compareTo(thrd.getName()) != 0) {
				currentName = thrd.getName();
				System.out.println("In " + currentName);
			}
		} while(stop == false && count < 10000000);
		stop = true;
		System.out.println("\n" + thrd.getName() + " terminating.");
	}
}	