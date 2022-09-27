package JavaBasics;
import java.util.*;
public class EvenIt {
	
	public static int printEvenSum(int number) {
		int sum = 0;
		for(int i = 2; i<= number; i+=2) {
			sum = sum +i;
		}
		return sum;
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number ");
		int number = sc.nextInt();
		System.out.println("Sum of all even numbers between 1 to "+ number + " is "+" "+printEvenSum( number) );
		sc.close();

	}

}
