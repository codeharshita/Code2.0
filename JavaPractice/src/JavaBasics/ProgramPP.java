package JavaBasics;

// New program 

public class ProgramPP {

	public static void main(String[] args) {
		int num = 111;
		int cubeSum = 0;
		while(num != 0) {
			int r = num % 10;
			num= num /10;
			//System.out.println(r);
			cubeSum = (int) ((int) cubeSum + Math.pow(r, 3));
			System.out.println(cubeSum);
		}

	}

}
