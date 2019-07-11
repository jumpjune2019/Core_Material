// Suspending, resuming, and stopping a thread.
class MyThread implements Runnable {
	Thread thrd;
	boolean suspended;
	boolean stopped;
	MyThread(String name) {
		thrd = new Thread(this, name);
		suspended = false;
		stopped = false;
		thrd.start();
	}
	// This is the entry point for thread.
	public void run() {
		System.out.println(thrd.getName() + " starting.");
		try {
			for(int i = 1; i < 1000; i++) {
				System.out.print(i + " ");
				if((i%10)==0) {
					System.out.println();
					Thread.sleep(250);
				}
				// Use synchronized block to check suspended and stopped.
				synchronized(this) {
					while(suspended) {
						System.out.println("suspended from running");
						wait();
					}
					System.out.println("not suspended from running");
					if(stopped) {
						break;
					} 
				}
			}
		} 	
		catch (InterruptedException exc) {
			System.out.println(thrd.getName() + " interrupted.");
		}
		System.out.println(thrd.getName() + " exiting.");
	}
	// Stop the thread.
	synchronized void mystop() {
		stopped = true;
		// The following ensures that a suspended thread can be stopped.
		suspended = false;
		notify();
	}
	// Suspend the thread.
	synchronized void mysuspend() {
		suspended = true;
	}
	// Resume the thread.
	synchronized void myresume() {
		suspended = false;
		notify();
	}
}