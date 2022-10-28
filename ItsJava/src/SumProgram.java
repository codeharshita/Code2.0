// Without using static keyword print the sum of two numbers.
public class SumProgram {
	
	//Method
	
	public int sumNum(int num1, int num2) {
		return num1+num2; 
	}
	
	public int productNum(int num1, int num2) {
		return  num1*num2;
	}
	

	public static void main(String[] args) {
		SumProgram sum = new SumProgram();
		int res = sum.sumNum(3, 2);
		System.out.println(res + " is the sum ");
		
		int res2 = sum.productNum(5, 2);
		System.out.println(res2 + " is the product.");
		

	}

}
