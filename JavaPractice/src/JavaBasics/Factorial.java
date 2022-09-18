package JavaBasics;

public class Factorial {

	public static void main(String[] args) {
		
		int n = 5;
		
		int fact_num = 1;
		
		for(int i = 1; i<= n;i++) {
			fact_num= fact_num*i;
		}
		System.out.println(fact_num);
	}

}
