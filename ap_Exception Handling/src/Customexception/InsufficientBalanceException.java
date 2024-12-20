//Checked CustomException

package Customexception;

public class InsufficientBalanceException extends Exception {

	public InsufficientBalanceException() {

		System.out.println("Not Enough Balance to Withdraw!: ");
	}

}
