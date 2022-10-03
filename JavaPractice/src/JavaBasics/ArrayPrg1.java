package JavaBasics;
//import java.util.*;

public class ArrayPrg1 {

	public static void main(String[] args) {
		int[] arr = {5,1,6,4,2,7,8}; 
		int element = 4;
		
		for(int i = 0; i< arr.length; i++) {
			
			if(arr[i] == element) {
				System.out.println("The element is found at index "+ i);
			}
			
		}
		

	}

}
