package JavaBasics;

public class SearchElement {

	
	
	public static void main(String[] args) {
		
	int[] arr = {4,6,1,3,5};
	int key = 10;
	boolean flag  = false;
	
	for(int i = 0;i<arr.length; i++) {
		if(key == arr[i]) {
			System.out.println("Element found");
				flag =true;
				break;
		}
	}
	if(flag == false)
	System.out.println("Element not found");

	}

}
