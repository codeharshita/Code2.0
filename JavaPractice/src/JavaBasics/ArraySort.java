package JavaBasics;
import java.util.*;

public class ArraySort {

	public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter the length of array.");
				int size = sc.nextInt();
				int[] arr = new int[size];
				
		System.out.println("Enter the array elements.");
				
				for(int i = 0; i< arr.length; i++) {
					arr[i]= sc.nextInt();
					
				}
				
				System.out.println("The original array is: ");
				
				for(int i = 0; i< arr.length; i++) {
					System.out.print(arr[i]+ " ");
					}
				System.out.println();
				System.out.println(Arrays.toString(arr));
			
				Arrays.sort(arr);
				
				System.out.println("The sorted array is ");
				for(int i = 0; i<arr.length; i++) {
					System.out.print(arr[i]+" ");
					
				}
				System.out.println();
				System.out.println(Arrays.toString(arr));
				
				
				

	}

}
