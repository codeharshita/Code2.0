package JavaBasics;
import java.util.*;

public class Function1 {
	
	public static void  printName(String name) {
	System.out.println("My name is "+name);
	return;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name");
		String name = sc.next();
		
		printName(name);
		sc.close();

	}

}
