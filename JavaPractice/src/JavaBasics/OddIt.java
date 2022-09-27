package JavaBasics;
import java.util.*;

public class OddIt {
	
	
	public static int printSumOdd(int number) {
		int sum = 0;
		for(int i =1; i<= number; i++) {
			if(i % 2 != 0) {
				sum = sum +i;
				System.out.print(" "+ i +" ");
			}
		}
		System.out.println();
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = sc.nextInt();
		
		System.out.println("Sum of all odd number from 1 to "+ number + " is " + printSumOdd(number) );
		sc.close();
	}

}
