package JavaBasics;
import java.util.*;

public class ArmStrong {
	
 public static int printArmstrong(int number) {
	 	
		int cubeSum = 0;
		int temp = number;
		
		while(number != 0 ) {
			int remainder = number % 10;
			number =  number / 10;
			cubeSum = (int) (cubeSum + Math.pow(remainder, 3));
			System.out.println(number);
		}
		if(temp == cubeSum) {
			System.out.println(cubeSum + "It's an armstrong number.");
		}else {
			System.out.println("Not an armstrong number.");
		}
		return cubeSum;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println( "Enter a number to check whether it's a armstrong or not.");
		int number = sc.nextInt();
		
		System.out.println(printArmstrong(number));
		
		sc.close();

	}

}
