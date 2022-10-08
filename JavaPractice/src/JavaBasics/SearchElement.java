package JavaBasics;
import java.util.Scanner;

public class SearchElement {

	
	public static void searchElement(int [] arr, int key) {
		
		boolean flag = false;
		
		for(int i = 0; i<arr.length; i++) {
			if(key == arr[i]) {
				System.out.println("Element found");
				flag= true;
				break;
			}
		}
		if(flag == false) {
			System.out.println("Element not found.");
		}
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] arr = new int[5];
		
		for(int i= 0 ; i<arr.length; i++) {
			arr[i]= sc.nextInt();
		}
		System.out.println("Array Entered.");
		for(int x: arr) {
			System.out.println(x);
		}
		System.out.println("Write an element to be searched.");
		int key = sc.nextInt();
		
		searchElement(arr, key);
		sc.close();
		
		
	}

}
