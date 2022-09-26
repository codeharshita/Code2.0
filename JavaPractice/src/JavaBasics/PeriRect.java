package JavaBasics;
import java.util.*;

public class PeriRect {

	public static int calcPeri(int m, int n) {
		int result = 2*(m+n);
		return result;
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length");
		int n = sc.nextInt();
		System.out.println("Enter the breadth");
		int m = sc.nextInt();
		
		
		System.out.println("The perimeter of the rectangle is "+ calcPeri(m,n));
		sc.close();

	}

}
	