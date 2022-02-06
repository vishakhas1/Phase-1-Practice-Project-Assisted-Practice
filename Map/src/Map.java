import java.util.*;
import java.util.Map.Entry;

public class Map {

	public static void main(String[] args) {
		// map

		// Hashmap
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "vish");
		hm.put(2, "jyoti");
		hm.put(3, "pranali");

		System.out.println("\nThe elements of Hashmap are ");
		for (Entry<Integer, String> m : hm.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

		// HashTable

		Hashtable<Integer, String> ht = new Hashtable<Integer, String>();

		ht.put(4, "angel");
		ht.put(5, "pari");
		ht.put(6, "rosy");
		ht.put(7, "John");

		System.out.println("\nThe elements of HashTable are ");
		for (Entry<Integer, String> n : ht.entrySet()) {
			System.out.println(n.getKey() + " " + n.getValue());
		}

		// TreeMap

		TreeMap<Integer, String> map = new TreeMap<Integer, String>();
		map.put(8, "sneha");
		map.put(9, "rajesh");
		map.put(10, "maya");

		System.out.println("\nThe elements of TreeMap are ");
		for (Entry<Integer, String> l : map.entrySet()) {
			System.out.println(l.getKey() + " " + l.getValue());
		}

	}
}
