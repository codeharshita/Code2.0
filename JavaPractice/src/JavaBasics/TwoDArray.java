package JavaBasics;

public class TwoDArray {

	public static void main(String[] args) {
		int [][]arr = {
				{2,4},
				{5,9}
			};
		
		for(int i=0; i<arr.length;i++) {
			for(int j = 0; j<arr.length; j++) {
				System.out.print(arr[i][j]+" ");
			}
		}
	}

}
