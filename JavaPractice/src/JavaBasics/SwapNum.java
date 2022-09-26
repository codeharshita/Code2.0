package JavaBasics;
import java.util.*;

public class SwapNum {
	
	public static void swapIt(int number1, int number2) {
		int temp;
		
		temp = number1;
		number1 = number2;
		number2= temp;
		
		//System.out.println("Value of number1 is "+ number1 );
		//System.out.println("Value of number2 is "+ number2);
		
		System.out.println("The swapped number are "+ number1 +number2);
		 
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number for swapping.");
		int number1= sc.nextInt();
		System.out.println("Enter the second number for swapping.");
		int number2= sc.nextInt();
		
		
		 swapIt(number1, number2);
		sc.close();

	}

}
