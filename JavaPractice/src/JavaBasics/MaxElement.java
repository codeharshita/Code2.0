package JavaBasics;
import java.util.*;

public class MaxElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int maxElement=0;
		int [] arr = new int[10];
		System.out.println("Enter any 10 array elements. ");
		
		for(int i = 0; i<arr.length; i++) {
			arr[i]= sc.nextInt();
		}

		Arrays.sort(arr);
		
		System.out.println(Arrays.toString(arr));
		maxElement = arr[10-2];
		System.out.println("The maximum second largest element is "+ maxElement);
		sc.close();
		
		
	}

}
