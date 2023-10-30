package java_collection_assignment;

import java.util.HashMap;
import java.util.Map;

public class InitializeHashMap {
	public static void main(String[] args) {
		// Create a new HashMap with key and value of type String and Integer
		Map<String, Integer> hashMap = new HashMap<String, Integer>();

		// Adding key-value pairs to the HashMap
		hashMap.put("J", 10);
		hashMap.put("L", 12);

		// Print the HashMap
		System.out.println("HashMap: " + hashMap);

	}
}
