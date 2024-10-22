package ac_threadpriority;

class MyThread extends Thread{
	
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println("Child Thread");
		}
	}
}

public class Test {
	
	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread().getPriority()); //5 Default priority for main thread is 5
		
		//Thread.currentThread().setPriority(15); // Exception in thread "main" java.lang.IllegalArgumentException
		
		Thread.currentThread().setPriority(7);
		
		MyThread t = new MyThread();
		System.out.println(t.getPriority()); // 7 it is same as parent child priority
		t.setPriority(10);
		t.start();
		
		for(int i=0; i<10; i++) {
			System.out.println("Main Thread");
		}
	}
}
