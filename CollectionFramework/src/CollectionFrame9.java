import java.util.*;
public class CollectionFrame9 {

	public static void main(String[] args) {
		
		// You can use SortedSet interface as well as Collection interface as well as Set interface.
		Set<String> ts = new TreeSet<>(List.of("Apple", "Mango", "Banana","Guava","Pineapple"));
		ts.add("Grapes");
		ts.add("Orange");
		System.out.println(ts.isEmpty());

		System.out.println(ts);
	}

}
