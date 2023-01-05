/**
 * Wrapper is also known as Wrapping or boxing 
 * It is used to convert Primitive types to objects through classes or vice-versa.
 * 
 * It is divided into two types :- AutoBoxing and Unboxing.
 * */
public class Wrapper {

	public static void main(String[] args) {
		//int i = 4;
		//Integer t = new Integer(10); 
		
		Integer w = Integer.valueOf(3);
		System.out.println(w);
		Integer m = Integer.valueOf("23");
		System.out.println(m);
		
		
		System.out.println("**************************");
		byte bb =41;
		Byte b1 = Byte.valueOf(bb);//boxing -> converting bb type to object.
		System.out.println(b1);
		
		short s1 = 45;
		Short s2 =  Short.valueOf(s1); // boxing -> converting s1 type to s2 object. 
		System.out.println(s2);
		Short m1 = Short.valueOf("432");
		System.out.println(m1);
		
		
		System.out.println("***************************");
		Float f =Float.valueOf(3.4f);
		System.out.println(f);
	}

}
