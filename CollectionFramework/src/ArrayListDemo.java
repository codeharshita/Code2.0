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
		
		ArrayList<String> arr =  new ArrayList<>(List.of("Java", "Python", "Ruby", "C#"));
		System.out.println(arr);
		System.out.println(arr.size());
	
		ArrayList<Integer> arr2 = new ArrayList<>(List.of(1,4,2,9,78));
		System.out.println(arr2);
		System.out.println(arr2.size());

	}

}
