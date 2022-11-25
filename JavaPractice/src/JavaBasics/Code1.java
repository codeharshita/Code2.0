package JavaBasics;
import java.util.*;



public class Code1 {
	
	public  int printSum(int num1, int num2) { 
		
		//logic
			return num1+num2;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number.");
		int num1= sc.nextInt();
		System.out.println("Enter the second number.");
		int num2 = sc.nextInt();
		
		Code1 c  = new Code1();
		System.out.println("The result is "+c.printSum(num1, num2));
		
		sc.close();
		
		

	}

}
