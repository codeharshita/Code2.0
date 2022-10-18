// Copying arrays using assignment operator.
import java.util.Arrays;
class CopyArray1 {
	
    public static void main(String[] args) {
		int[] numbers = {1,2,3,4,5};
		int[] newArr = numbers;
		for(int i: newArr) {
			System.out.print(i + " ");
		}
	
// Method 2 for copying the array.
		System.out.println("\n");
		int[] source = {2,3,1,4,5};
		int[] dest = new int[5];
		
		for(int i =0; i<source.length;i++) {
			dest[i]= source[i];
		}
		System.out.println(Arrays.toString(dest));
		
		
		

	}

}
