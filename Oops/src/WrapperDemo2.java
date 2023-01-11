/**
 * Float, Character,Boolean Classes. 
 * */
public class WrapperDemo2 {

	public static void main(String[] args) {
		Integer a2 = 56;// autoboxing :- Directly converted primitive data type into Wrapper class(Object equivalent.)
		
		System.out.println(a2);
		
		float f= 12.4f;
		Float f2 = 12.4f;
		Float f3 = (float)Math.sqrt(9);
		
		System.out.println(f2 == Float.NaN);
		System.out.println(f3.isNaN());
		
		System.out.println("******************************");

		Float m1 = Float.valueOf(f);
		Float m2= Float.valueOf(f2);
		
		boolean k = m1.equals(m2);
		System.out.println(k);
		
		System.out.println(m1.equals(m2));
		
		
		
		
				}

}
