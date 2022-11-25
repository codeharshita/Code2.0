package JavaBasics;
import java.util.*;



public class Code1 {
	
	public static int printSum(int num1, int num2) {
			return num1+num2;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number.");
		int num1= sc.nextInt();
		System.out.println("Enter the second number.");
		int num2 = sc.nextInt();
		
		System.out.println("The sum is "+printSum(num1, num2));
		sc.close();
		
		

	}

}
