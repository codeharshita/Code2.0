package JavaBasics;
import java.util.*;

public class ReverseNumber {
	
	public static int printReverse (int number) {
		
		int reverse = 0;
     do {
			
			int rem = number % 10;
			reverse = reverse * 10  + rem;
			number = number /10;
			
		}while(number != 0);
     return reverse;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = sc.nextInt();
		
		System.out.println("The reversed number is " + printReverse(number));
		
		sc.close();
		
		
		
		
		
		}

}
