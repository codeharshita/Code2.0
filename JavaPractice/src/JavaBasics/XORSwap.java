// 	Swapping a number without using third variable.
package JavaBasics;

import java.util.*;

public class XORSwap {
	
	public static void swapNum(int num1, int num2) {
		num1=num1^num2;
		num2=num1^num2;
		num1=num1^num2;
		
		System.out.println("After swaing the numbers are : " + num1 + " and " + num2);
		
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Program for swapping the two numbers.");
		System.out.println();
	    System.out.println("Enter the first number.");
		int num1 = sc.nextInt();
		System.out.println("Enter the second number.");
		int num2 = sc.nextInt();
			swapNum(num1, num2);

			sc.close();
	  
	}

}
