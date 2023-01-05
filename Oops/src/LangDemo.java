import java.lang.*;

//implicitly class MyObject extends Object class i.e automatically extendsing from the object class.
class MyObject{

	public String toString() {
		return "My Object.";
	}
	
}

public class LangDemo {

	public static void main(String[] args) {
		Object obj1 = new Object();
		Object obj2 = new Object();
		Object obj3 = obj2;
		
		System.out.println(obj1.equals(obj2)); // false -> Different object reference.
		System.out.println(obj1.equals(obj1)); // true -> Same object reference.
		
		System.out.println(obj1.hashCode()+" "+ obj2.hashCode());
		System.out.println(obj3.equals(obj2));
		
		MyObject o1 = new MyObject();
		System.out.println(o1.toString()); 

	}

}
