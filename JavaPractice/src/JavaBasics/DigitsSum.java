package JavaBasics;
import java.util.*;

/**
 * <h1>Sum of Digits of a Number</h1>
 * The DigitsSum program implements an application that adds the digits of a number 
 * where the number is provided by the user.
 */

public class DigitsSum {
	
	/**
	 * This method is used to add the digits of number.
	 * @param number This is the number provided by the user.
	 * @return int This returns the sum of Digits of number.
	 */
	
	
	public static int sumOfDigits(int number) {
		int sum =0;
		while(number != 0) {
			int newNum = number%10;
			sum = sum + newNum;
			number= number/10;
		}
		return sum;
		
	}

	public static void main(String[] args) {
		//Scanner object creation.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		//Taking user input from the Scanner class.
		int number = sc.nextInt();
		//Method calling
		System.out.println("The answer is "+ sumOfDigits(number));
		sc.close();

	}

}
