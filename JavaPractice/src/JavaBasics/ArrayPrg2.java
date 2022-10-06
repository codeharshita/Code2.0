/**
 * the task is to write a Java program to check whether a specific element is present 
 *  in this Array or not and mention the index as well.
 * 
 * */
package JavaBasics;
//import java.util.*;

public class ArrayPrg2 {

	public static void main(String[] args) {
		int[] arr = {6,5,4,1,2};
		int key = 1;
		boolean isPresent = false;
		int index = 0;
		
		for(int i = 0; i<arr.length; i++) { 
			if(arr[i] == key) {
				isPresent = true;
				index =i;
				break;
			}
		}
		
		if(isPresent = true) {
			System.out.println(arr[index]+ " is present at index "+ index);
		}else {
			System.out.println("This array element is not present.");
		}

	}

}
