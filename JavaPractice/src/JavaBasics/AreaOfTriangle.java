package JavaBasics;
import java.util.*;

public class AreaOfTriangle {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the base of triangle.");
		int base = sc.nextInt();
		System.out.println("Enetr the height of triangle.");
		float height = sc.nextFloat();
		
		float res = 1/2*base*height;
		
		System.out.println("THE AREA OF TRAINGLE IS: "+ res);

	}

}
