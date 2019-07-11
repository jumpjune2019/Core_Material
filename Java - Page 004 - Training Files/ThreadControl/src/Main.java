
public class Main {
	public static void main(String args[]) {
		MyThread ob1 = new MyThread("My Thread");
		try {
			Thread.sleep(1000); // let ob1 thread start executing
			ob1.mysuspend();
			
			System.out.println("First Suspending thread.");
			Thread.sleep(1000);
			ob1.myresume();
			System.out.println("Resuming thread.");
			Thread.sleep(1000);
			ob1.mysuspend();
			System.out.println("Suspending thread.");
			Thread.sleep(1000);
			ob1.myresume();
			System.out.println("Resuming thread.");
			Thread.sleep(1000);
			ob1.mysuspend();
			System.out.println("Stopping thread.");
			ob1.mystop();
		} catch (InterruptedException e) {
			System.out.println("Main thread Interrupted");
		}
		// wait for thread to finish
		try {
			ob1.thrd.join();
		} catch (InterruptedException e) {
			System.out.println("Main thread Interrupted");
		}
		System.out.println("Main thread exiting.");
	}
}
