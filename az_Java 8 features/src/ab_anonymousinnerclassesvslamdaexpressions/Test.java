package ab_anonymousinnerclassesvslamdaexpressions;

public class Test {
	public static void main(String[] args) {

		/* with anonymous inner class */
				Thread t = new Thread(new Runnable() {
					public void run() {
						for (int i=0; i<10; i++) {
							System.out.println("Child Thread");
						}
					}
				}
						);
				t.start();
				for (int i=0; i<10; i++) {
					System.out.println("Parent Thread");
				}
		/* End */

		/* with Lamda Expressions */
//		Thread t = new Thread(
//				()->{
//					for (int i=0; i<10; i++) {
//						System.out.println("Child Thread");
//					}
//				}
//				);
//		t.start();
//		for (int i=0; i<10; i++) {
//			System.out.println("Parent Thread");
//		}
		/* End */
	}	
}

