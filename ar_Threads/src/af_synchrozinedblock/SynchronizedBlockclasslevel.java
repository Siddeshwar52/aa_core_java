package af_synchrozinedblock;

class Displayy{
	public  void wish(String name){
		
		//  1 lack line code 
		
		synchronized(Displayy.class) {
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
class MyThread extends Thread{

	Displayy d;
	String name;

	MyThread(Displayy d, String name) {
		this.d = d;
		this.name = name;
	}
	public void run() {
		d.wish(name);
	}
}
public class SynchronizedBlockclasslevel {
	public static void main(String[] args) {
		Displayy d = new Displayy();
		MyThread t1 = new MyThread(d, "Tom");
		MyThread t2 = new MyThread(d, "Jerry");
		t1.start();
		t2.start();
	}
}
