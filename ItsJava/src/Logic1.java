
public class Logic1 {

	public static void main(String[] args) {
		int num = 51;
		int cubeSum = 0;
		
	
		while(num != 0) {
			int r = num % 10;
			num = num /10;
			cubeSum = (int) ((int) cubeSum + Math.pow(r, 3));
		
		}
				System.out.println(cubeSum);
		}

}
