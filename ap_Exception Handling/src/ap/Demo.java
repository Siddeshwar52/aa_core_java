//Exceptional Handling

package ap;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {

		System.out.println("Start");

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the value of a: ");
		int a = scan.nextInt();

		System.out.println("Enter the value of b: ");
		int b = scan.nextInt();

		try 
		{
			System.out.println(a/b);
		}
		catch(ArithmeticException e)
		{

			//System.out.println("--");
		}
		scan.close();

		System.out.println("End");

	}

}
