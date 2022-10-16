package JavaBasics;

public class TwoDArray {

	public static void main(String[] args) {
		int [][]arr = {
				{2,4,3},
				{5,9,1}
			};
		
		for(int i=0; i<3;i++) {
			for(int j = 0; j<3; j++) {
				System.out.print(arr[i][j]+" ");
			}
		}
	}

}
