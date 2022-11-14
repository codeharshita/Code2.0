//Understanding this keyword.
/*
 * This is used to refer the current object of the class.
 * It is similar to the object concept.
 * Object is also called using dot operator ,similarly this is also called with the help
 * of dot operator.
 * 
 * it can used while removing the ambiguity of the class variable.
 * it can also be used while invoking the constructor or method.
 *  
 * */
public class KeywordThis {
	
	int age;
	
	public KeywordThis(int age){
		this.age= age;
		
	}	
	public static void main(String args[]) {
		KeywordThis karan = new KeywordThis(8);
		System.out.println("Karan's age: " + karan.age);
		
		
	}

}
