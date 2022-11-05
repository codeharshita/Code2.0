/* A java file with no public class but still
 * there is no compilation error this program will run.
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
	
	/**
	 * public -> Access modifier which helps the jvm to access the main method.
	 * 			 If the access modifier is private , protected or default, the JVM 
	 * 			should not be able to execute the main method.
	 * 
	 * static -> A keyword in Java which helps to access the fields or methods 
	 * 			 without the creation of the object.
	 * 
	 *  void -> ReturnType in java which don't return any value(numeric).
	 *  
	 *  main() -> Its a main method which takes parameters as Arrays of strings named as ARGS.
	 *  		  The main execution of our java program starts from here.
	 *  		  #Entry point of a program.
	 *  
	 *  String[] args -> like (int[] arr) here we can say that we took an input from the users
	 *  				 of array with integer data type and name of our array is arr.
	 *  				Similarly by noticing the String[] args we can say that this main
	 *  				method also take an input from the user which contains the parameter
	 *  				of an array of Strings named ARGS(name of your array.)	
	 *  				
	 * 				
	 * */
	
	
	public static void main(String[] args) {
	System.out.println(Demo.marks);
	System.out.println(Demo.sub2);
	System.out.println(Demo.subject);
		
		
	}

}
