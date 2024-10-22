package aa_lamdaandfunctionalinterfaces;

interface Interf2{
	public int square(int x);
}

/* without lamda expression */

//class Demo implements Interf2{
//	@Override
//	public int square(int x) {
//		return x*x;
//	}
//}
//public class Third {
//	public static void main(String[] args) {
//		Interf2 i = new Demo();
//		System.out.println("The square of 20 is "+(i.square(20)));
//	}
//}

/* with lamda expression */

public class Third {
	public static void main(String[] args) {
		Interf2 i = (x)->x*x;
		System.out.println("The square of 20 is "+i.square(20));
	}
}

