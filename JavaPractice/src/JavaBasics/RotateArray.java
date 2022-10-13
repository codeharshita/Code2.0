package JavaBasics;

public class RotateArray {

	public static void main(String[] args) {
		int [] arr= {5,9,6,10,12,7,3,5,4,2};
		int temp  = arr[0];
		
		for(int i = 1; i<arr.length;i++) {
			System.out.print(arr[i]+ " ");
		}
				arr[arr.length-1]= temp;
				System.out.println(temp);
	}

}
