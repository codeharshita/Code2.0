// Logic for swapping the two numbers without using the third variable by using XOR operation.
public class Logic9SwapNum {

	public static void main(String[] args) {
		int x = 10;
		int y =5;
		
		//Logic
		
		//Using XOR operation.
		System.out.println("Before Swapping "+ x + " "+ y);
		x=x^y; 
		y=x^y;
		x=x^y;
		
		System.out.println("After Swapping " + x +  " " + y);
		

	}

}
