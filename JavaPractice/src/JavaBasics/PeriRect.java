package JavaBasics;
import java.util.*;

public class PeriRect {

	public static int calcPeri(int length, int breadth) {
		int result = 2*(length+breadth);
		return result;
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length");
		int length = sc.nextInt();
		System.out.println("Enter the breadth");
		int breadth = sc.nextInt();
		
		
		System.out.println("The perimeter of the rectangle is "+ calcPeri(length,breadth));
		sc.close();

	}

}
	