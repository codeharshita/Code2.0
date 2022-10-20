// Revised.
public class Logic3 {

	public static void main(String[] args) {
		int B[]= {2,1,4,3,5};
		
		System.out.println(B);
		
		
		for(int i = 0; i<B.length; i++) {
			System.out.println(B[i]++);
		}
		
		
		// By using for each we can only read the value.
		for(int x: B) {
			System.out.print(x + " ");
		}

	}

}
