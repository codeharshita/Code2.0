/* A java file with no public class but still
 * there is no compilation error.
 * 
 * 
 *  Here the source file name is not same
 *   as class name but still there is no error why?
 *   
 *   Because here the class is not public.
 * */

class Demo {
	
    static int marks = 98;
	static String subject ="Maths";
	static String sub2 = "Physics";
	
	public static void main(String[] args) {
	System.out.println(Demo.marks);
	System.out.println(Demo.sub2);
	System.out.println(Demo.subject);
		
		
	}

}
