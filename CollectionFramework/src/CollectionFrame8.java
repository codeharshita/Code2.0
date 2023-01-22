import java.util.*;

public class CollectionFrame8 {

	public static void main(String[] args) {

		HashSet<Integer> hs = new HashSet<>();

		// You can write a duplicate statement, but while printing the results duplicacy
		// is not allowed.
		// The result can be of any order.
		hs.add(32);
		hs.add(34);
		hs.add(76);
		hs.add(88);
		hs.add(34);

		System.out.println(hs);

	}   

}
