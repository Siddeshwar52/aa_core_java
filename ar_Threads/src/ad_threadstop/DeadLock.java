package ad_threadstop;

class MyThread3 extends Thread{
	static Thread mt;
	public void run() {
		try {
			mt.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		for(int i=0; i<10; i++) {
			System.out.println("Child Thread");
		}
	}
}

	public  class DeadLock {

		public static void main(String[] args) throws InterruptedException {

			MyThread3.mt=Thread.currentThread();
			MyThread3 t = new MyThread3();
			t.start();
            t.join();
			for(int i=0; i<10; i++) {
				System.out.println("Main Thread");
			}
		}
	}

