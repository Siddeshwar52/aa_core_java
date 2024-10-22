package aa_lamdaandfunctionalinterfaces;

/* without lamda expression */

//class MyRunnable implements Runnable{
//	@Override
//	public void run() {
//		for(int i=0; i<10; i++) {
//			System.out.println("Child Thread");
//		}
//	}
//}
//public class Fourth {
//	public static void main(String[] args) {
//		Runnable r = new MyRunnable();
//		Thread t = new Thread(r);
//		t.start();
//		for(int i=0; i<10; i++) {
//			System.out.println("Parent Thread");
//		}
//	}
//}

/* with lamda expression */

public class Fourth{
	public static void main(String[] args) {
		Runnable r = ()->{
			for(int i=0; i<10; i++) {
				System.out.println("Child Thread");
			}
		};
		Thread t = new Thread(r);
		t.start();
		for(int i=0; i<10; i++) {
			System.out.println("Parent Thread");
		}
	}
}


