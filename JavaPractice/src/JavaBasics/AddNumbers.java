package JavaBasics;

public class AddNumbers {

	// used static keyword to access the methods
	public static int addNum(int number1, int number2) {
		
		int result = number1 + number2;
		return result;
	}
	
	
	public static void main(String[] args) {
		
		// Method calling.	
		System.out.println(addNum(3,4) + " is the result. ");
	}

}
/**
 * To access the methods from the class we can 
 * use static keyword or else we need to 
 * create an object of that class and then call 
 * the method using .operator in the main method. 
 * 
 */
 