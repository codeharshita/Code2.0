package JavaBasics;

public class LargestArrayElement {
	public static int getLargest(int [] number) {
	
		int max = 0;
		for(int i =0; i< number.length; i++) {
			if(number[i]>max) {
				max=number[i];
			}
		}
		return max;
	}
	
	

	public static void main(String[] args) {
		int[] arr = new int[] {5,9,23,401};
			int res = getLargest(arr);
		System.out.println(res+ " is the largest array element.");
	}

}
