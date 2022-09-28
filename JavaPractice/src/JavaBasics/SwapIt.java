//Swap two numbers without using the third variable;
package JavaBasics;
import java.util.*;

public class SwapIt {

	public static void swapNum(int num1, int num2) {
		
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		  
		System.out.println("The swapped numbers are "+ num1 + " " + num2);
		
	}
	
	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		   swapNum(num1, num2);
		   sc.close();
			

	}

}
