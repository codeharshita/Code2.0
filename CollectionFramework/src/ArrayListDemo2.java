import java.util.*;
public class ArrayListDemo2 {

	public static void main(String[] args) {
		ArrayList<String> ar = new ArrayList<String>();
		ar.add("Tom");
		ar.add("Charlie");
		ar.add("Venessa");
		ar.add("Lisa");
		ar.add("Rodger");
		
		//Iterating using loop
		for(int i =0; i<ar.size(); i++) {
			System.out.println(ar.get(i));
		}
		
		
		System.out.println("---------------");
		//Iterating using for each loop
		for(String s: ar) {
			System.out.println(s);
		}
		
		System.out.println("*****************");
		
		//Iterating using lambda expressions.
		ar.forEach((x)-> System.out.println(x));
		
		
		System.out.println("-------------------");
		//Iterator
		Iterator<String> itr  = ar.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			System.out.println(" ");
		}

	}

}
