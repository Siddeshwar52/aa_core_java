package ad_threadstop;

class MyThread1 extends Thread{
	
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println("Child Thread");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class TestJoin {
	
	public static void main(String[] args) throws InterruptedException {
		
		MyThread1 t = new MyThread1();
		t.start();
		//t.join();
		t.join(10000);
		
		for(int i=0; i<10; i++) {
			System.out.println("Main Thread");
		}
	}
}

