// Syntax checking for arrays.
import java.util.*;
public class Practise1 {
	

	public static void main(String[] args) {
		int[] arr = new int[] {1,4,2,3};
		
		for(int a: arr ) {
			System.out.print(" "+a);
		}
		System.out.println();
		
		for(int i = 0; i<arr.length; i++) {
			System.out.print( " "+ arr[i]);
	 }
		System.out.println();
		
		//for(int i = 0; i<arr.length; i++) {
			System.out.println(Arrays.toString(arr));
		//}

	}
}
