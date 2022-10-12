//Removing array elements using the index.

package JavaBasics;
import java.util.*;


public class RemoveArrayElement2 {
	
	/**
	 * removeElement is a method which is responsible for 
	 * removing the array element according to the index.
	 * 
	 * @param - Contains three parameters 
	 * 			original array- arr
	 * 			Index - UserIndex
	 * 			new_array = arr_new
	 * 
	 * @return  - Type void as it justs prints the new array after deletion of the element.
	 * */
	
	public static void removeElement(int[] arr, int uInd, int [] arr_new) {
		
		// i is the index if the original array before deletion of the element.
		// k is the index of new arrray formed after deletion of the element.
		for(int i =0, k=0;i<arr.length; i++) {
			if(uInd != i) {
				arr_new[k]=arr[i];
				//Incresing the new array index by 1.
				k++;
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = new int[] {1,13, -9, 66,-10,53,33,6};
		int[] arr_new = new int[arr.length-1];
		// providing index acording the user.
		int uInd = 4;
		
			// Method calling.
			removeElement(arr, uInd, arr_new);
			System.out.println("After deletion the array is "+ Arrays.toString(arr_new));
	}

}
