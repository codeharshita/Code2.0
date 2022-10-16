package JavaBasics;
import java.util.Scanner;

public class TwoDArray2 {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the array elements.");
			int rows = sc.nextInt();
			int cols = sc.nextInt();
			int[][] arr = new int [rows][cols];
			
			
			//input
			//rows
			for(int i =0; i<rows;i++) {
				//columns
				for(int j = 0; j<cols; j++) {
					arr[i][j]= sc.nextInt();
				}
			}
			// output
			
			for(int i = 0; i<rows;i++) {
				for(int j =0; j<cols; j++){
					System.out.print(arr[i][j]+" ");
				}
				System.out.println();
				sc.close();
			}

	}

}
