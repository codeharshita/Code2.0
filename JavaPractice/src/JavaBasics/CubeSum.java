// Write a java program to print the sum of cube of digits.

package JavaBasics;
import java.util.*;
// CubeSum is a classname.

public class CubeSum {
	
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number.");
        int num = sc.nextInt();
	        
		 int cubeSum = 0;

	        while( num!= 0){
	            int remainder = num % 10;
	            num = num / 10;
	            cubeSum = (int) (cubeSum + Math.pow(remainder,3));
	           
	         }
	        System.out.println(cubeSum);
	        sc.close();
     }

}

