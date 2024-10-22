package af_synchrozinedblock;

class Display{
	public  void wish(String name){
		
		//  1 lack line code 
		
		synchronized(this) {
			for(int i=0;i<10;i++) {
				System.out.println("Good Morning");
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(name);
			}
		}
		
		//  1 lack line code
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
		d.wish(name);
	}
}
public class SynchronizedBlockobjectlevel {
	public static void main(String[] args) {
		Display d = new Display();
		MyThreads t1 = new MyThreads(d, "Tom");
		MyThreads t2 = new MyThreads(d, "Jerry");
		t1.start();
		t2.start();
	}
}
