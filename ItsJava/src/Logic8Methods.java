// Using method update the value of Oth Index and print the new array.
public class Logic8Methods {
	
	static void update(int A[]) {
		A[0]= 34;
	}
	
	   public static void main(String[] args) {
		
		   int[] A = {2,4,3,5,6};
		   update(A);
		  for(int i = 0; i<A.length; i++) {
			  System.out.print(A[i] + " ");
		  }
		   
		   
	}

}
