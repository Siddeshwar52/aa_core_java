package ab_arrays;

public class SecondHighestNumberInArray {

	public static void main(String[] args) {

		int arr[] = { 2,1,5,4 };
		int largest = 0;
		int secondLargest = 0;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > largest) {
				secondLargest = largest;
				largest = arr[i];
			} else if (arr[i] > secondLargest) {
				secondLargest = arr[i];
			}

		}

	}

}
