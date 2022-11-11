//Java Strings.

public class Practise1 {
	static String first ="Java";
	static String second = "Programming";
	//String concatenation.
	static String res = first.concat(second);
	
	

	public static void main(String[] args) {
		 String name ="Hello World!";
		    int n= name.length();
		System.out.println("String: "+ name);
		System.out.println("Length: "+ n);
		System.out.println(res);
		
		String first ="Java Programming";
		String second = "JAvA programming";
		String third ="java programming";
		
		// Check whether the strings are equal.
		boolean res = first.equals(second);
		System.out.println("String first and second are equal: "+ res);
		
		boolean res2 = first.equals(third);
		System.out.println("String first and third are equal: "+ res2);
		
		boolean res3= second.equals(third);
		System.out.println("String second and thirs are equal: "+ res3);

	}

}
