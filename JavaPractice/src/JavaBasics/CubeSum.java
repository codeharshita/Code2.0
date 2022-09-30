// Write a java program to print the sum of cube of digits.

package JavaBasics;
// CubeSum is a classname.

public class CubeSum {
	
	

	public static void main(String[] args) {
		 int num = 51;
	        int sum = 0;
	        int cubeSum = 0;

	        while( num!= 0){
	            int remainder = num % 10;
	            sum = sum + remainder;
	            cubeSum = (int) (cubeSum + Math.pow(sum,3));
	            num = num / 10;
	        }
	        System.out.println(cubeSum);


	}

}

// Doubt-  Answer should be 126
// I am getting 217?? How??
