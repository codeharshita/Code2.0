package JavaBasics;

public class SumArrayElements {
	public static int printSumArray(int[]array) {
		
		int sum = 0;
		
		for(int i = 0; i<array.length; i++) {
			sum= sum + array[i];
		}
		return sum;
	}

	public static void main(String[] args) {
			int[] array = {3,9,7,8,12,6,15,5,4,10};
			int result = printSumArray(array);
			System.out.println("The sum is "+result);

	}

}
