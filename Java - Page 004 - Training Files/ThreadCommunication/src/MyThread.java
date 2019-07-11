class MyThread implements Runnable {
	Thread thrd;
	TickTock ttOb;
	// Construct a new thread.
	MyThread(String name, TickTock tt) {
		thrd = new Thread(this, name);
		ttOb = tt;
		thrd.start(); // start the thread
	}
	// Begin execution of new thread.
	public void run() {
		if(thrd.getName().compareTo("Tick") == 0) {
			for(int i=0; i<5; i++) {
				ttOb.tick(true);
			}
			ttOb.tick(false);
		}
		else {
			for(int i=0; i<5; i++) {
				ttOb.tock(true);
			}
			ttOb.tock(false);
		}
	}
}