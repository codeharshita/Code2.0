// Logic is to remove the array elements by considering a value.
import java.util.*;
public class Logic5 {

	public static void main(String[] args) {
		int[] arr = {2,1,2,2,2,4,5};
		int remove = 2;
		//Sorting	
		Arrays.sort(arr);
			System.out.println(Arrays.toString(arr));

			for(int i =0 ; i<arr.length; i++) {
				if(remove == arr[i]) {
					continue;
				}
				System.out.println(arr[i]);
			}

	}

}
