import java.util.*;

public class CollectionFrame2 {

	public static void main(String[] args) {

		ArrayList<Integer> al1 = new ArrayList<>();
		ArrayList<Integer> al2 = new ArrayList<>(List.of(12, 32, 34, 76, 98, 50));
		al1.add(43);
		al1.add(21);
		al1.add(30);
		al1.add(80);
		al1.add(84);
		al1.add(67);
		al1.add(0, 999);
		al1.add(37);

		// Here we can't use al1[i] xxx
		// as it is an arraylist use .get(index i)
		for (int i = 0; i < al1.size(); i++) {

			System.out.println(al1.get(i));
		}

//		System.out.println(al1.contains(80));
//		al1.remove(0);
//		System.out.println(al1.size() + " size of arraylist1");
//
//		al2.add(0, 31);
//		System.out.println("LIST" + al2 + al2.size());
//
//		System.out.println(al1);

	}

}
