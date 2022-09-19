package JavaBasics;
import java.util.*;

public class SwapNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number for swapping.");
		int a= sc.nextInt();
		System.out.println("Enter the second number for swapping.");
		int b = sc.nextInt();
		System.out.println("The number is "+ a + " "+ b +" has been chosen for swapping." );
		int temp;
		
		
		temp = a;
		a = b;
		b = temp;
		System.out.println("Swapped numbers are:"+ a +" "+ b);
		sc.close();

	}

}
