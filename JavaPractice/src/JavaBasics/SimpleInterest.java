package JavaBasics;
import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter principle amount");
		double p =sc.nextDouble();
		System.out.println("Enter rate of intrest .");
		float r = sc.nextFloat();
		System.out.println("Enter time period");
		float t = sc.nextFloat();
		
		double res = p*r*t/100;
		System.out.println("The simple intrest is " + res);
	}

}
