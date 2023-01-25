import java.util.*;
public class LinkedHashDemo {

	public static void main(String[] args) {
		
		//(5)-> for insertion
		// (5, .75f, true) -> for accessing.
		LinkedHashMap<Integer, String> lhm = new LinkedHashMap<>(6, .75f,true) {
			
			protected boolean removeEldestEntry(Map.Entry e) {
				return size()>5;
			}
		}; 
		
		lhm.put(1, "A");
		lhm.put(2, "B");
		lhm.put(3, "C");
		lhm.put(4, "D");
		lhm.put(5, "E");
		lhm.put(6, "F");
		
		
		String s= lhm.get(2);
		s = lhm.get(5);
		s= lhm.get(1);
		
		
		lhm.forEach((k,v)->System.out.println(k+" "+" "+v)); 

	}

}
