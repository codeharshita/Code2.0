package JavaBasics;
import java.util.Scanner;


public class SimpleInterest {
	
	public static  int calcSimpleIntrest(double p, float r,float t) {
		double res = p*r*t/100;
		return (int) res;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter principle amount");
		double p =sc.nextDouble();
		System.out.println("Enter rate of intrest .");
		float r = sc.nextFloat();
		System.out.println("Enter time period");
		float t = sc.nextFloat();
		
		
		System.out.println("The simple intrest is " + calcSimpleIntrest(p,r,t));
		sc.close();
	}

}
