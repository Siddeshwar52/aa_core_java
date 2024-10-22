package ai_daemonthread;

class MyThread extends Thread{
	
}

public class Test {
	
	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread().isDaemon());
		
		//Thread.currentThread().setDaemon(true); //java.lang.IllegalThreadStateException we cannot set main thread as demon thread
		
		MyThread t = new MyThread();
		
		System.out.println(t.isDaemon()); //fasle
		
		t.setDaemon(true);
		
		System.out.println(t.isDaemon()); //true
		
	}
}
