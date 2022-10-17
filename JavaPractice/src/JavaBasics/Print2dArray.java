package JavaBasics;
import java.util.*;

public class Print2dArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Enter the rows and columns
		System.out.println("Enter the rows and columns.");
		int rows = sc.nextInt();
		int cols = sc.nextInt();
		
		int[][] arr = new int[rows][cols];
		
		//Take input from the user.
		System.out.println("Enter the array elements.");
		for(int i =0;i<rows; i++) {
			for(int j = 0; j<cols; j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		//System.out.println("\n");
		
		//Give output to the user.
				System.out.println("The new matrix is: ");
		for(int i = 0; i<rows; i++) {
			for(int j = 0; j<cols; j++) {
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println("\n");
			sc.close();
		}
		
		
		
	}

}
