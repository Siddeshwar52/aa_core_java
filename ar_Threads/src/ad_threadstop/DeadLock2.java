package ad_threadstop;


public  class DeadLock2 {

	public static void main(String[] args) throws InterruptedException {

		Thread.currentThread().join();
	}
}

