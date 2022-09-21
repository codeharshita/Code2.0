package JavaBasics;
import java.util.*;

public class SumFunct {
	
	public static int printSum(int a, int b) {
		int c = a+b;
		return c;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number.");
		int a = sc.nextInt();
		System.out.println("Enter the second number.");
		int b = sc.nextInt();
		
		System.out.println("The sum is: "+ printSum(a,b));
		sc.close();
		

	}

}
