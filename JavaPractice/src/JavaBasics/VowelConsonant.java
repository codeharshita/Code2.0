package JavaBasics;
import java.util.Scanner;

public class VowelConsonant { 
	public static char printVowelConsonant(char c) {
		
	
		if(c == 'a' || c =='e' || c == 'i' || c == 'o' || c == 'u' ) {
		System.out.println("It's a vowel");
		}else
		{
			System.out.print("It's a consonant. ");
		}
		
		
		return c;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a character");
		char c = sc.next().charAt(0);
		printVowelConsonant( c);
		sc.close();
		
	}

}
