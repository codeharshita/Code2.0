// Print the sum of numbers without using the static keyword.
public class SumMethod {

	/**
	 * Non-static method.
	 * */
	public int sumNum(int num1, int num2) { 
		  return num1+num2;
		}
	//Method overloading.
	public float sumNum(float num1, float num2, float num3) {
		return num1+num2+num3;
	}
	

	public static void main(String[] args) {
		// Object creation
		SumMethod obj = new SumMethod();
		// Accessing method using object.
		int res = obj.sumNum(3, 2);
		//Printing thr result.
		System.out.println(res + " is the sum.");
		float res2 = obj.sumNum(2.0f, 4.0f, 3.0f); 
		System.out.println(res2 + " is the method.");
		System.exit(0);
	}

}
