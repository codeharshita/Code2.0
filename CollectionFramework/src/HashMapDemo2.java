import java.util.*;
import java.util.Map.Entry;
public class HashMapDemo2 {

	public static void main(String[] args) {
		HashMap<Integer, String> codeAnimal = new HashMap<>();
		codeAnimal.put(1, "Tiger");
		codeAnimal.put(2, "Lion");
		codeAnimal.put(3, "Monkey");
		codeAnimal.put(4,"Kangaroo");
		codeAnimal.remove(3);
		
		//Iterate the hashMap over the keys only using keySet();
		Iterator<Integer> itr = codeAnimal.keySet().iterator();
		while(itr.hasNext()) {
			Integer key = itr.next();
			String str = codeAnimal.get(key); //Fetch the key or getting the key.
		//	System.out.println(str);
			
			System.out.println("Key "+ key+ ","+ "Value "+ str);
		}
		
		System.out.println("Data 2");
		
		HashMap<String, String > subName = new HashMap<>();
		subName.put("EN", "English");
		subName.put("EM", "Engineering Mechanics");
		subName.put("ED", "Engineering Drawing");
		subName.put("CM", "Chemistry");
		subName.put("DSA", "Data Structures and algorithms.");
		
		
		//Iterate a HashMap
		Iterator<String> objItr = subName.keySet().iterator();
		while(objItr.hasNext()) {
			String key = objItr.next();
			String val = subName.get(key);
			
			System.out.println("KEY:- "+ key+ ","+ " Val:-"+ val);
		}
		
		System.out.println("**********Entry Set*************");
		
		//Iterate the hashMap using the entrySet over the whole pair(set) .
		Iterator<Entry<Integer,String>> itr1=  codeAnimal.entrySet().iterator();
		while(itr1.hasNext()) {
			Entry<Integer, String> myKey = itr1.next();
			System.out.println("key:-"+ myKey.getKey()+ " " +" value:- "+ myKey.getValue());
		}
		System.out.println();
		//using forEach loop
		codeAnimal.forEach((k, v)-> System.out.println(k+" "+v));
	}

}