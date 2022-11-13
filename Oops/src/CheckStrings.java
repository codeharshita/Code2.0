//Observing the difference between == vs .equals();
public class CheckStrings {

	public static void main(String[] args) {
		String name1 = new String("Java");
		String name2= new String("Java");
		
		//Check whether the two strings are equal or not.
		// using == opeartor
		
		boolean res = (name1 == name2);
			System.out.println("Are the strings equal? "+ res); //false
		// using .equal method.
			
		boolean res2 = name1.equals(name2);
		System.out.println("Are the strings equal? "+ res2); //true

	}

}

/*
 * As there are two different answers 
 * == -> false -> because it checks the reference variable of the string.
 * .equals -> true -> because it checks the content of the strings.
 * 
 * */
