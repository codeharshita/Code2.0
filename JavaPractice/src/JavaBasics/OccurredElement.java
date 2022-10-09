package JavaBasics;
import java.util.*;

public class OccurredElement {
	public static int printFrequencyOfElement(int[]arr, int element) {
		
		int count = 0;
		
		for(int i = 0; i<arr.length; i++) {
			if(element == arr[i]) {
				count++;
			}
		}
		return count;
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size.");
		int size = sc.nextInt();
		int[] arr = new int[size];
		
		System.out.println("Enter the array elements.");
		
		for(int i = 0; i<arr.length; i++) {
			arr[i]= sc.nextInt();
		}
		
		System.out.println("Enter the element whose frequency you want to know.");
		int element = sc.nextInt();
		
		
		int res = printFrequencyOfElement(arr,element);
		
		System.out.println(res);
		sc.close();

	}

}
