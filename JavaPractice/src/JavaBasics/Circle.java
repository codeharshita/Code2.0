
package JavaBasics;

import java.util.Scanner;

public class Circle {
	
	public static double printCircumference(int radius) {
		//Local Variable is radius because it is declared inside the method.
		return 2*Math.PI*radius; 
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius.");
		int radius = sc.nextInt();
		System.out.println("The circumference of circle is "+ printCircumference(radius));
		sc.close();

	}

}
