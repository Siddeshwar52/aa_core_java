package aa_threadcreation;


class MyRunnable implements Runnable{

	@Override
	public void run() {
		
		System.out.println("Child Thread");
	}
	
}

public class RunnableDemo {
	
	public static void main(String[] args) {
		
		MyRunnable r = new MyRunnable();
		
		Thread t = new Thread(r);
		
		t.start();
		
		System.out.println("Main Thread");
		
		//Callable<V>
		
	}

}
