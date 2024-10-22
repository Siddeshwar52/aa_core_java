package ab_arrays;

public class SmallestMissingNumberinArray {

	public static void main(String[] args) {

		int[] q = {1, 2, 4, 5, 6 };
		
		int smallest = 1;

		for(int i=0; i<q.length; i++) {
			if (q[i] == smallest) {
				smallest++;
			}
		}
		System.out.println(smallest);
	}
}
