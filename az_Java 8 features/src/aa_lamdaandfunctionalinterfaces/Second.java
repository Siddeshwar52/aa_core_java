package aa_lamdaandfunctionalinterfaces;

interface Interf1{
	public void sum(int a , int b);
}

/* without lamda expression */

//class Demo implements Interf1{
//	@Override
//	public void sum(int a, int b) {
//		System.out.println("The sum is "+(a+b));
//	}
//}
//public class Second {
//	public static void main(String[] args) {
//		Interf1 i = new Demo();
//		i.sum(20,5);
//	}
//}

/* with lamda expression */

public class Second {
	public static void main(String[] args) {
		Interf1 i = (a,b)->System.out.println("The sum is "+(a+b));
		i.sum(20,5);
	}
}

