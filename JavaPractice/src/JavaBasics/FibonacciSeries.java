package JavaBasics;
import java.util.*;

public class FibonacciSeries {
	
	public static void printFibonacciSeries(int number) {
		
		int firstNumber = 0;
		int secondNumber = 1;
		int thirdNumber;
		
		for(int i = 0; i<= number ; i++) {
			thirdNumber = firstNumber + secondNumber;
			
			System.out.print(" "+ thirdNumber + " ");
			
			firstNumber = secondNumber;
			secondNumber = thirdNumber;
			}
		}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter the number to print fibonacci series. ");
		int number = sc.nextInt();
		
		printFibonacciSeries(number);
		sc.close();
		//System.out.println();

	}

}
