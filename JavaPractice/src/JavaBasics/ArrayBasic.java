package JavaBasics;

public class ArrayBasic {

	public static void main(String[] args) {
		int [] arr = {34,78,55,67,11};
		//Traverse this array using for-each loop.
		System.out.println("Traversed array using for each loop");
		for(int newArr: arr) {
			System.out.print(newArr + " ");
		}
		System.out.println();
		//Traverse the array using for-loop.
		System.out.println("Traversed array using for loop");
		int i = 0;
		for( i= 0; i<arr.length; i++) {
			System.out.print(arr[i] + " "); 
		}
	}

}
