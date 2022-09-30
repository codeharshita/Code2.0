// Write a palindrome program.
package JavaBasics;
import java.util.*;
/**
 * Palindrome is a java program which checks whether the 
 * number provided by the user is a palindrome number or not. 
 * */

public class Palindrome {

	
/**
 * printPalindrome is a method which checks the palindrome number.
 * 
 * @param input is the number integer.
 * @return void return type.
 * */	
	public static void printPalindrome(int number) {
		
		int reverse = 0;
		int temp = 0;
		
		temp = number;
		
		// Used do while loop.
		//Logic-1
		do {
			int remainder = number%10;
			reverse = reverse *10 + remainder;
			number = number /10;
			
		}while(number != 0);
		
		
		----------------------------------------------------------------
		//Used while loop.
		//Logic-2.
		
		while(number != 0){
		int remainder = number % 10;
		reverse = reverse* 10 + remainder;
		number = number/10;
		}
		-----------------------------------------------------------------
		if(reverse == temp) {	
				System.out.println("It's a Palindrome number.");
		}else {
				System.out.println("It's not a Palindrome number. ");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number.");
		int number = sc.nextInt();
		// Method calling.
		printPalindrome(number);
		sc.close();
		}

}
