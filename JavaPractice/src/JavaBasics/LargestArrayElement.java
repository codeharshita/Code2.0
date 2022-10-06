package JavaBasics;

public class LargestArrayElement {
	
	
	

	public static void main(String[] args) {
		
		 int arr[] = {10,324,45, 7886,1234};
	        int max = arr[0];

	        for(int i=0; i<arr.length; i++){
	            if(arr[i]> max){
	                 max = arr[i];
	                System.out.println(max);
	            }
	        }

	}

}
