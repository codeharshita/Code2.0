package JavaBasics;
import java.util.*;

public class ArrayPrg1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size");
		int size = sc.nextInt();
		int arr[] = new int[size];
		
		// For entering the values in the array.
		for(int i = 0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Write the element that you want to search for.");
		int element = sc.nextInt();
		 
		for(int i = 0 ; i<arr.length ; i++) {
		if(arr[i] == element) {
		System.out.println(" Element is found at index " + i );
		break;
		 }
		}
		
		sc.close();

	}

}
