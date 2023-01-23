import java.util.*;
import java.util.Map.*;
public class MapDemo {

	public static void main(String[] args) {
	TreeMap<Integer, String> tm = new TreeMap<>(Map.of(0,"A",1,"B",2,"C",3,"D",4,"E"));
	tm.put(5, "F");
	tm.put(6, "G");
	
	Entry<Integer, String> e = tm.firstEntry();
	System.out.println(e.getKey()+" "+ e.getValue());
	
	tm.pollFirstEntry();
	
	System.out.println(tm);

	HashMap<Integer, String> obj = new HashMap<>(Map.of(0,"A",1,"B",2,"C",3,"D",4,"E"));
	obj.put(9, "Book");
	obj.put(7, "Pen");
	obj.put(5, "Table");
	
	var y = obj.remove(3);
	System.out.println("Removed element :"+ y);
	System.out.println(obj);
	
	}

}
