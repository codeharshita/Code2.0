package JavaBasics;
import java.util.*;

public class Palindrome {

	public static void printPalindrome(int number) {
		
		int reverse = 0;
		int temp = 0;
		
		temp = number;
		do {
			int remainder = number%10;
			reverse = reverse *10 + remainder;
			number = number /10;
			
		}while(number != 0);
		
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
		
		//System.out.println(printPalindrome(number));
		printPalindrome(number);
		sc.close();
		

	}

}
