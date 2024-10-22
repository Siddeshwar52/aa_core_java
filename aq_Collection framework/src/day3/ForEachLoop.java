package day3;

public class ForEachLoop {

	public static void main(String[] args) {

		int[] a = {10, 20 ,30};

		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}

		System.out.println("-----------");

		for(int i : a) {
			System.out.println(i);
		}
		System.out.println("-----------");
		double [] percentage = { 1.2, 3.4, 5.6, 7.8};

		for(double z : percentage) {

			System.out.println(z);
		}

		System.out.println("-----------");

		String[] fruits = {"Apple", "Mango", "ButterFruit"};

		for(String f : fruits) {
			System.out.println(f);
		}
	}
}
