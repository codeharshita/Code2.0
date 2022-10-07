package JavaBasics;

public class CommonArrayElements {

	public static void main(String[] args) {
		int[] arr = new int[] {3,2,4,5,6};
		int[] arr2 =  new int[] {8,6,2,1,5};
		
		for(int i = 0; i<arr.length; i++) {
			
			for(int j  = 0; j<arr2.length; j++) {
				if(arr[i]==arr2[j]) {
			System.out.print(arr[i]+ " "+ "are the commom elements in the array.");		
				}
			
							}
		}

	}

}
