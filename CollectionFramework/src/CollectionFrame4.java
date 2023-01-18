//accessing the elements from set to arrayList.

import java.util.HashSet;
import java.util.ArrayList;

public class CollectionFrame4 {

	public static void main(String[] args) {

		// creating a HashSet.
		HashSet<Character> hashSet = new HashSet<>();
		hashSet.add('e');
		hashSet.add('a');
		hashSet.add('i');
		hashSet.add('o');

		// creating an arrayList.
		ArrayList<Character> arL = new ArrayList<>();

//		System.out.println(arL);
//			System.out.println(arL.addAll(hashSet));
//
		// Generic type should be same.
		arL.addAll(hashSet);
		System.out.println(arL);
	}

}
