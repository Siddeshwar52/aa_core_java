package ae_synchrozined;

class Display1{
	public synchronized void displayc(){
		for(int i=0;i<10;i++) {
			System.out.println(i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public synchronized void displayn(){
		for(int i=65;i<=75;i++) {
			System.out.println((char)i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
class MyThread1 extends Thread{
	Display1 d;
	MyThread1(Display1 d) {
		this.d = d;
	}
	public void run() {
			d.displayn();
	}
}
class MyThread2 extends Thread{
	Display1 d;
	MyThread2(Display1 d) {
		this.d = d;
	}
	public void run() {
			d.displayc();
	}
}

public class SynchronizedDemo1 {
	public static void main(String[] args) {
		Display1 d = new Display1();
		MyThread1 t1 = new MyThread1(d);
		MyThread1 t2 = new MyThread1(d);
		t1.start();
		t2.start();
	}
}

