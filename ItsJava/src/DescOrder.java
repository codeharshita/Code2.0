// Print array elements in descending order.


import java.util.*;
public class DescOrder {

	
	public static void main(String[] args) {
		Integer [] arr  = {23,76,12,7,99,74};
		Arrays.sort(arr, Collections.reverseOrder());
		
		
		System.out.println("Descending order.");
		System.out.println(Arrays.toString(arr));

	}

}
