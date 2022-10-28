// Without using static keyword print the sum of two numbers.
public class SumProgram {
	
	//It is a non-static method
	// Formal argument
	public int sumNum(int num1, int num2) {
		return num1+num2; 
	}
	
	public int productNum(int num1, int num2) {
		return  num1*num2;
	}
	

	public static void main(String[] args) {
		// Object
		SumProgram sum = new SumProgram();
		//Method calling using object name.
		// Actual argument
		int res = sum.sumNum(3, 2);
		System.out.println(res + " is the sum ");
		
		int res2 = sum.productNum(5, 2);
		System.out.println(res2 + " is the product.");
		

	}

}
