package Customexception;

import java.util.Scanner;

public class ATM {

	public static void main(String[] args)  {

		Scanner s =new Scanner(System.in);

		int balance = 10000;

		System.out.println("Enter the amount to be withdrawn: ");
		int amount = s.nextInt();

		if(amount<=balance) {
			System.out.println("Withdraw Successful");
		}
		else {
			try {
				throw new InsufficientBalanceException();
			}
			catch(InsufficientBalanceException e) {
				System.out.println(e);
			}
		}

	}

}
