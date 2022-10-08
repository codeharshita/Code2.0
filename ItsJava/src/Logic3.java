
public class Logic3 {

	public static void main(String[] args) {
		int B[]= {2,1,4,3,5};
		
		
		for(int i = 0; i<B.length; i++) {
			System.out.println(B[i]++);
		}
		
		for(int x: B) {
			System.out.print(x + " ");
		}

	}

}
