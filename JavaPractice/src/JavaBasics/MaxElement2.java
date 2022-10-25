// Write a program to find the maximum Array Element without sorting.
package JavaBasics;

public class MaxElement2 {
	
	
	public static int maxElement(int [] Arr) {
		int max = Arr[0];
		
		for(int i =0;i<Arr.length;i++) {
			if(Arr[i]>max) {
				max= Arr[i];
//				System.exit(0);
			}
		}
		System.out.println("Just Found");
		return max;
	}

	public static void main(String[] args) {
		
		int[] Arr  = {3,9,7,8,12,6,15,5,4,10};
		System.out.println(maxElement(Arr)+ " is the largest element.");

	}

}
