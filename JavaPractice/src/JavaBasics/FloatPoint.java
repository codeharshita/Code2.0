//Java Program to Multiply two Floating-Point Numbers

package JavaBasics;
import java.util.*;

public class FloatPoint {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a float number.");
		float m  = sc.nextFloat();
		System.out.println("Enter other float number.");
		float n = sc.nextFloat();
		
		float p = m*n;
		System.out.println("The number is "+ p);
		sc.close();
	}

}
