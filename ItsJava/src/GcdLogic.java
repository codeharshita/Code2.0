
public class GcdLogic {

	public static void main(String[] args) {
		int m = 25 , n = 15;
		
		while (m != n) {
			if(m>n) {
				m = m-n;
			}else {
			    n=n-m;
			}
		}
		
		System.out.println(" GCD is " + m);

	}

}
