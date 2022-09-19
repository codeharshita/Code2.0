package JavaBasics;
import java.util.*;

public class PeriRect {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length");
		int n = sc.nextInt();
		System.out.println("Enter the breadth");
		int m = sc.nextInt();
		
		int res = 2*(n+m);
		System.out.println("The perimeter of the rectangle is "+ res);
		sc.close();

	}

}
	