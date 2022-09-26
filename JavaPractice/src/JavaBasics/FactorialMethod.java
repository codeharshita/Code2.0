package JavaBasics;
import java.util.Scanner;


/**
 * FactorialMethod is a java program which implements
 * the factorial of a given number.
 * */

public class FactorialMethod {
	
	/**
	 * calculateFactorial is name of method which 
	 * calculates the factorial of any number of integer data type.
	 *
	 * @param number - An integer number is taken as an input.
	 * @return Returns the integer value.
	 * */
	

	public static int calculateFactorial(int number){
		int fact_num  = 1;
		for(int i = 1; i<= number; i++) {
			fact_num = fact_num *i;
		}
		return fact_num;
		
	}	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = sc.nextInt();
		// Method calling
			System.out.println(calculateFactorial(number));
			sc.close();
		

	}

}
