package bankapp;

import java.util.Scanner;

public class Solutions {

	public static void main(String[] args) {

		System.out.println("Welcome to ATM");
		System.out.println("--------------");

		Scanner s = new Scanner(System.in);
		Bank b = new ATM();

		while(true) {
			System.out.println("1:Deposit\n2:Withdraw\n3:Check Balance\n4:Exit");
			System.out.println("Enter Choice: ");
			int choice = s.nextInt();

			switch(choice)
			{
			case 1: 
				System.out.println("Enter Amount to be Deposited");
				int dAmt = s.nextInt();
				b.deposit(dAmt);
				break;

			case 2: 
				System.out.println("Enter Amount to be Withdraw");
				int wAmt = s.nextInt();
				b.withdraw(wAmt);
				break;
				
			case 3:
				b.checkbalance();
				break;
				
			case 4:
				System.out.println("Thank you");
				System.exit(0);
				
				default:
					System.out.println("Invalid Choice");
			}
			
			System.out.println("-----------------");
		}
	}
}
