package ad_threadstop;

class MyThread2 extends Thread{
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

	public  class TestJoin2 {

		public static void main(String[] args) throws InterruptedException {

			MyThread2.mt=Thread.currentThread();
			MyThread2 t = new MyThread2();
			t.start();

			for(int i=0; i<10; i++) {
				System.out.println("Main Thread");
			}
		}
	}

