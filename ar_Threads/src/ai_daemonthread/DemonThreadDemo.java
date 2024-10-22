package ai_daemonthread;

class July extends Thread{
	
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
public class DemonThreadDemo {
	
	public static void main(String[] args) {
		
		July j = new July();
		j.setDaemon(true);
		j.start();
		System.out.println("End of main method");
	}

}

/*
 * If we commenting j.setDaemon(true); both main and child thread are non demon
 * and hence both threads will be executed until there execution if we are not
 * Commenting then main thread is non demon and child thread is demon and hence
 * whenever main thread terminates automatically child thread is terminated in
 * this case o/p will be end of main child & child thread || end of main thread 
 * || child thread end of main thread
 */