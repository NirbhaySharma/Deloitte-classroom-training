package collectionexamples;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		HashMap<String,Integer> phoneBook= new HashMap<>();
		phoneBook.put("nirbhay", 700690);
		phoneBook.put("Akshay", 700602);
		phoneBook.put("Akshaya", 708602);
		phoneBook.put("vibhank", 024467);
		phoneBook.put("vidyut", 7602);
		System.out.println(phoneBook);
		Set set= phoneBook.entrySet();
		Iterator itr= set.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
	}

}
