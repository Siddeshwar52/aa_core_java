package ah_deadlockandstarvation;

class A{
	public synchronized void foo(B b) {
		System.out.println("thread start exection foo");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Thread-1 trying to catch B's last method");
		b.last();
	}
	public synchronized void last() {
		System.out.println("Inside A this is last()");
	}
}
class B{
	public synchronized void bar(A a) {
		System.out.println("thread start exection bar");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Thread-2 trying to catch A's last method");
		a.last();
	}
	public synchronized void last() {
		System.out.println("Inside B this is last()");
	}
}
public class DeadLock extends Thread {
	A a = new A();
	B b = new B();
	public DeadLock() {
		this.start();
		a.foo(b); 
	}
	public void run() {
		b.bar(a);
	}
	public static void main(String[] args) {
		new DeadLock();
	}
}
