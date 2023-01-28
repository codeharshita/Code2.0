import java.util.*;
public class ArrayListDemo {

	public static void main(String[] args) {
		//Virtual Capacity of arrayList is 10.
		
		ArrayList<Object> ar = new ArrayList<Object>();
		System.out.println(ar.size()); // PC-Physical Capacity
		ar.add(100);
		System.out.println(ar.size());
		
		ar.add(32);
		ar.add(21);
		ar.add(30);
		
		System.out.println(ar.size());
		
		

	}

}
