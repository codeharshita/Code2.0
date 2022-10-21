// Print the greater number from the two numbers.
public class Logic7Methods {
	
	
	static int maxNumber(int x, int y) {
		
			if(x>y) {
				return x;
			}else {
				return y;
			}
		
	}

	public static void main(String[] args) {
		
		
		int x=20, y=15,c;
		
		c = maxNumber(x,y);
		System.out.println(c + " is greatest.");
		

	}

}
