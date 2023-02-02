import java.util.*;
public class HashMapDemo4 {

	public static void main(String[] args) {
		HashMap<Integer, String> hmap = new HashMap<>();
		hmap.put(10000, "Google");
		hmap.put(21000, "Amazon");
		hmap.put(33430, "Walmart");
		hmap.put(42000, "Apple");
		hmap.put(5000,"Netflix");
		
		System.out.println("The size of these companies are: "+ hmap.size());
		 
		
//		Iterator it = hmap.keySet().iterator();
//	while(it.hasNext()) {
//		Map.Entry pairs = (Map.Entry)it.next();
//		System.out.println(pairs.getKey()+ " = "+ pairs.getValue());
//	}
	
	List<String> hashMap = new ArrayList<String>(); 
	for(String t: hashMap) {
		System.out.println(t);
	}
	
	}

}
