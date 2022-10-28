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
