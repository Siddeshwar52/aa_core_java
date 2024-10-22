package aa_lamdaandfunctionalinterfaces;

interface Interf{
	public void methodone();
}

/* without lamda expression */

//	public class Demo implements Interf{
//		@Override
//		public void methodone() {
//			System.out.println("Method one execution");
//		}
//	}
//	public class one {
//		public static void main(String[] args) {
//			Interf i = new Demo();
//			i.methodone();
//		}
//	}

/* with lamda expression */

public class one {
	public static void main(String[] args) {
		Interf i = ()->System.out.println("Method one execution");
		i.methodone();
	}
}
