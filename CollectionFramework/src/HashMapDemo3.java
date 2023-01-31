//For comparing hashMaps we need to use .equals method.
import java.util.*;
public class HashMapDemo3 {

	public static void main(String[] args) {
		HashMap<Integer, String> hm1 = new HashMap<>();
		hm1.put(1, "A");
		hm1.put(2, "B");
		hm1.put(3, "C");
		hm1.put(4, "D");
		hm1.put(5, "W");
		
		
		HashMap<Integer, String> hm2 = new HashMap<>();
		hm2.put(4, "D");
		hm2.put(3, "C");
		hm2.put(2, "B");
		hm2.put(1, "A");
	
		HashMap<Integer, String> hm3 = new HashMap<>();
		hm3.put(3, "C");
		hm3.put(3, "M");
		hm3.put(1, "A");
		hm3.put(2, "B");
		hm3.put(4, "D");
		hm3.put(5, "J");
		
		System.out.println(hm1.equals(hm2));
		System.out.println(hm2.equals(hm3));
		
		//Compare hashMap for the same keyset.
		System.out.println(hm1.keySet().equals(hm2.keySet()));
		System.out.println(hm2.keySet().equals(hm3.keySet()));
		
 
	}

}
