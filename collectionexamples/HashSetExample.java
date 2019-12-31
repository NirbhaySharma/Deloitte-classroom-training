package collectionexamples;

import java.util.HashSet;

public class HashSetExample {

	public static void main(String[] args) {
		HashSet<Object> item= new HashSet<>();
		item.add("hello");
		item.add(75);
		item.add(365);
		item.add("deloitte");
		item.add("naresh");
		item.add(null);
		System.out.println(item);
	}

}
