// Print the greater number from the two numbers.
import java.util.*;

public class Logic7Methods {
	
	
	static int maxNumber(int x, int y) {
		
			if(x>y) {
				return x;
			}else {
				return y;
			}
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the two numbers.");
		int x = sc.nextInt();
		int y = sc.nextInt();
		int c;
		
		c = maxNumber(x,y);
		System.out.println(c + " is greatest.");
		sc.close();

	}

}
