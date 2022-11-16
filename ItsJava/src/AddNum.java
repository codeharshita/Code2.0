// Does Java Supports call by value or call  by reference?
/*
 * Yes, Java supports both call by value and call by reference
 * 
 * Is it possible call by reference in Java?
 * Yes, it is possible with object references.
 */
public class AddNum {
	
	
   //call by value
	public static void printSum(int a, int b) { //formal parmeters
		int c = a+b;
		System.out.println(c+" Call by value");
	}
	
	//call by reference
	public  void subNum(AddNum t) {
		int v=10;
		int l=6;
		
		int c = v-l;
		System.out.println(c+" Call by reference.");
	}
	
	
	
	public static void main(String[] args) {
		//Call by reference.
		AddNum obj = new AddNum();
		obj.subNum(obj);
		
	 
		//Call by value or pass by value.
			printSum(2,3);//actual parameters.
			AddNum.printSum(4, 2);
			
	}

}
