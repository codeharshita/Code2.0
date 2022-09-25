package JavaBasics;
import java.io.*;

public class CompoundIntrest {

	public static void main(String[] args) {
		double principle =100000, rate=10.24, time=4;
		
		double CI = principle*(Math.pow(1+rate/100, time));
		System.out.println(CI);

	}

}
