package ag_interthreadcommunications;

class ThreadB extends Thread {

	int total = 0;

	public void run() {
		synchronized(this) {
			System.out.println("Child Thread calculations");
			for(int i=1; i<=100; i++) {
				total+=i;
			}
			this.notify();
			System.out.println("Child Thread gives notification");
		}
		// 1 lack code lines
	}
}

public class ThreadA {

	public static void main(String[] args) throws InterruptedException {

		ThreadB b = new ThreadB();
		b.start();
		// Thread.sleep(1000);   //not recommended
		// b.join();             // not recommended because the thread will wait till full run() completion (1 lack code lines)
		synchronized(b) {
			System.out.println("Main Thread calling wait method");
			b.wait();
			System.out.println("Main Thread got notification");
		}
		System.out.println(b.total);
	}
}
