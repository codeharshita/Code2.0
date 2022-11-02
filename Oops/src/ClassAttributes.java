
public class ClassAttributes {
	//final int x = 5;
	int x = 5;
	int y = 7;
	
	
	public static void main(String[] args) {
		ClassAttributes at = new ClassAttributes();
		//int x =10;
		/* show an error because of
		 * final keyword assigned to x.
		 * Final(Java keyword) is a non-access modifier which is used for 
		 * classes, attributes/fields or methods if the 
		 * values is not be copied, inherited or overrided.
		 * 
		 * 
		 *  The final keyword is a non-access modifier used for classes, 
		 *  attributes and methods, which makes them non-changeable 
		 *  (impossible to inherit or override).
		 *  
		 *  it can be use to keep any value constant and that
		 *  value should non-changeable.
		 * */
		at.x =10; 
		int res2 = at.y;
		System.out.println(at.x + " is the result");
		System.out.println(res2+ " is the result.");
		System.out.println(at.x);
		System.out.println(at.y);

	}

}
