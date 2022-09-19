package JavaBasics;
//import java.util.Scanner;

public class PrimeMethod {
	
	public static boolean prime_num(int n) { // method created with a single parameter of integer data type.
											 //boolean keyword => return the value(T/F)
											 				
		
//logic.
        if(n<=1){
            return false;
        }
        for (int i = 2; i <n; i++){
            if (n%i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("is 17 Prime: "+ prime_num(17)); //method calling.
    }
}

	


