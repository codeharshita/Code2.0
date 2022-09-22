

public class ArrayProgram {

	public static void main(String[] args) {
		int [] arr = new int[] {1,7,3,9,20,12,2};
		int element = 3;
		boolean isPresent = false;
		int index = 0;
		
	
		
		//Search if element 3 is present or not !!
		//Search the position of the element found.
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == element) {
				isPresent = true;
				index = i;
				break;
			}
		}
		
		if(isPresent == true) {
			System.out.println( "The given element "+ element + " " + "is found at index"+" "+ index + ".");
			System.out.println( "The given element "+ element + " is found at index "+ index + ".");
		}else {
			System.out.println("Element is not found.");
		}
		
		}

	int sum =0;
		
		
		
		
		
		

	


}
