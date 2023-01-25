import java.util.*;
public class SetDemo2 {

	public static void main(String[] args) {
		
		LinkedHashSet<Integer> lhmNew = new LinkedHashSet<>();
		lhmNew.add(21);
		lhmNew.add(24);
		lhmNew.add(11);
		lhmNew.add(98);
		lhmNew.add(11);
		
		Iterator<Integer> im = lhmNew.iterator();
		while(im.hasNext()) {
			System.out.println(im.next());
			System.out.println(" ");
		}
		
		System.out.println(" ");
		System.out.println(lhmNew);
		
		
		System.out.println();
		HashSet<String> lhm2 = new HashSet<>();
		//Will give results in the sorted order.
		lhm2.add("B");
		lhm2.add("W");
		lhm2.add("I");
		lhm2.add("A");
		lhm2.add("Y");
		
		lhm2.forEach(System.out::println);
	}

}
