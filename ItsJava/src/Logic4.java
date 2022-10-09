// brute-force logic to count the frequency of elements in an array.
public class Logic4 {

	public static void main(String[] args) {
		int [] arr = {2,5,4,4,4,1,3,2};
		int temp = 2;
		int count = 0;
		
		for(int i =0; i<arr.length; i++) {
			if(temp == arr[i]) {
				count++;
			}
			
		}
		
		System.out.println(temp+ " has occurred "+ count+ " time/s");
		
	}

}
