import java.util.*;
public class ArrayListDemo3 {

	public static void main(String[] args) {
		ArrayList<String> ar1 =new ArrayList<String>();
		ar1.add("Java");
		ar1.add("Python");
		ar1.add("Ruby");
		ar1.add("SQL");
		
		ArrayList<String> ar2 = new ArrayList<String>();
		ar2.add("Book");
		ar2.add("Gloves");
		ar2.add("Camera");
		ar2.add("Tripod");
		
		//ar1.addAll(ar2);
		//System.out.println(ar1);
		
		System.out.println("-----------------------------");
		
		ArrayList<String> st1 = (ArrayList<String>)ar1.clone();
		System.out.println(st1);
		
		ar2.clear();
		
		int i = ar2.lastIndexOf("Camera");
		System.out.println(i);
		
		ArrayList<Integer> list1 = new ArrayList<Integer>(Arrays.asList(3,8,9,6,5,3));
		System.out.println(list1+" "+ ar1);
		list1.removeIf((num)-> num%2==0);
		System.out.println(list1);
		
		
	}

}
