// Removing the array elements by seeing its value.

package JavaBasics;
import java.util.*;

public class RemoveElements {

	public static void removeIt(int[] arr, int remove) {
			
	    Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		for(int i = 0; i<arr.length; i++) {
			if(arr[i] == remove) {
				continue;
			}
			System.out.println(arr[i]);
		}
		
	}
	
	
	public static void main(String[] args) {
		
		int[] arr = {2,10,3,4,7,10,10,10};
		int remove = 10;
		
		removeIt(arr, remove );
		

	}

}
