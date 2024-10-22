package aa_iterations;

// Java code to determine Length of longest consecutive zeroes in the binary representation of a number.

public class BinaryGap {

	static int maxZeros(int N) {
		int maxm = -1;

		int cnt = 0;

		while (N != 0) {
			if ((N & 1) == 0) {
				cnt++;
				N >>= 1;
				maxm = Math.max(maxm, cnt);
			} else {

				maxm = Math.max(maxm, cnt);
				cnt = 0;
				N >>= 1;
			}
		}
		return maxm;
	}

	public static void main(String args[]) {
		int N = 14;
		System.out.println(maxZeros(N));

	}
}
