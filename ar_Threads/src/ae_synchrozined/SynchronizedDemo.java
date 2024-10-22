package ae_synchrozined;

class Display{
	public synchronized void wish(String name) throws InterruptedException {
		for(int i=0;i<10;i++) {
			System.out.println("Good Morning");
			Thread.sleep(2000);
			System.out.println(name);
		}
	}
}
class MyThreads extends Thread{

	Display d;
	String name;

	MyThreads(Display d, String name) {
		this.d = d;
		this.name = name;
	}
	public void run() {
		try {
			d.wish(name);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
public class SynchronizedDemo {
	public static void main(String[] args) {
		Display d1 = new Display();
		MyThreads t1 = new MyThreads(d1, "Tom");
		MyThreads t2 = new MyThreads(d1, "Jerry");
		t1.start();
		t2.start();
	}
}

// if we are not declaring wish() synchronized then both threads will be executed simultaneously and we can't except exact o/p  
// if we  not declaring wish() synchronized then threads will be executed one by one so that we will get regular o/p  
