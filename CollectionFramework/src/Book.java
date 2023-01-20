import java.util.*;

class MyBook {
	String name;
	String author;
	String publisher;
	int id;
	int quantity;

	public MyBook(String name, String author, String publisher, int id, int quantity) {
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.id = id;
		this.quantity = quantity;

	}

}

public class Book {

	public static void main(String[] args) {
		List<MyBook> list = new LinkedList<MyBook>();
		// to get some data as in objects we need to create the object samples.
		MyBook list1 = new MyBook("der", "rew", "edw", 75, 4);
		MyBook list2 = new MyBook("tfd", "olk", "xcd", 12, 9);
		MyBook list3 = new MyBook("qas", "cvf", "mkj", 43, 5);

		list.add(list1);
		list.add(list2);
		list.add(list3);

		for (MyBook b : list) {
			System.out.println(b.name+" "+ b.author+" "+ b.publisher +" "+b.id+" "+b.quantity);
		}

	}

}
