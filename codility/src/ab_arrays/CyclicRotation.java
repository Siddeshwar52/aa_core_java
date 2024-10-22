package ab_arrays;

public class CyclicRotation {

	public static void main(String[] args) {

		int[] A = { 1, 2, 3 };
		int K = 1;
		
		int[] rotatedA = new int[A.length];

		for (int i = 0; i < rotatedA.length; i++) {
			int rotatedIndex = (i + K) % A.length;
			rotatedA[rotatedIndex] = A[i];
		}

		for (int i = 0; i < rotatedA.length; i++) {
			System.out.println(rotatedA[i]);
		}

	}

}
