// Use wait() and notify() to create a ticking clock.
class TickTock {
	String state; // contains the state of the clock
	synchronized void tick(boolean running) {
		if(!running) { // stop the clock
			state = "ticked";
			// try removing this and see what happens in your code.
			notify(); // notify any waiting threads
			return;
		}
		System.out.print("Tick ");
		state = "ticked"; // set the current state to ticked
		// try removing this notify as well to see how it goes.
		notify(); // let tock() run
		try {
			while(!state.equals("tocked")) {
				wait(); // wait for tock() to complete
			}
		}
		catch(InterruptedException exc) {
			System.out.println("Thread interrupted.");
		}
	}
	synchronized void tock(boolean running) {
		if(!running) { // stop the clock
			state = "tocked";
			// try removing this one as well
			notify(); // notify any waiting threads
			return;
		}
		System.out.println("Tock");
		state = "tocked"; // set the current state to tocked
		// try removing this as well
		notify(); // let tick() run
		try {
			while(!state.equals("ticked")) {
				wait(); // wait for tick to complete
			}
		}
		catch(InterruptedException exc) {
			System.out.println("Thread interrupted.");
		}
	}
}