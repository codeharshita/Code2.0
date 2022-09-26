package JavaBasics;
import java.util.Scanner;

/**
 * VowelConsonant is a Java Program to
 *  Check Whether the Character is Vowel or Consonant
 * */

public class VowelConsonant { 
	
	/**
	 * This methodis used to print or differentiate 
	 * between consonants and vowels of a character.
	 * @param character This is an argument which 
	 * 	is provided by the user.
	 * 
	 * @return char This returns the character defined ny the user.
	 * */
	public static char printVowelConsonant(char character) {
		
	  // OR oerator is used.
		if(character == 'a' || character =='e' || character == 'i' || character == 'o' || character == 'u' ) {
		System.out.println("It's a vowel");
		}else
		{
			System.out.print("It's a consonant. ");
		}
		
		
		return character;
	}

	public static void main(String[] args) {
		// Scanner user input.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a character");
		char character = sc.next().charAt(0);
		//Method calling.
		printVowelConsonant( character);
		sc.close();
		
	}

}
