package JavaBasics;

public class SumArray {

	public static void main(String[] args) {
		int rows = 3,cols = 3;
		int [][] arr = {{1,2,3},{4,3,4},{5,6,3}};
		int [][] arr_new = {{2,3,4},{1,3,5},{6,7,2}};
		
		
		// Adding matrix.
		int [][]sum = new int[rows][cols];
		// Rows can also be written as arr.length
		for(int i =0; i<rows; i++) {
		// Cols can also be written as arr[0].length
			for(int k =0; k<cols; k++) {
				sum[i][k]= arr[i][k]+ arr_new[i][k];
				
			}
		}
		
		// Printing the output
		System.out.println("Sum of the arrays is: ");
		for(int m =0; m<sum.length; m++) {
			for(int n=0; n<sum[0].length; n++) {
				System.out.print(sum[m][n] + " ");
			}
			System.out.println();
		}
	}

}
