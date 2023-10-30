package java_collection_assignment;

	import java.util.HashMap;
	import java.util.Map;

	public class HashMapString {
	    public static void main(String[] args) {
	        // Create a new HashMap with key and value of type String
	        Map<String, String> hashMap = new HashMap<>();

	        // Adding key-value pairs to the HashMap
	        hashMap.put("FirstName", "Ajay");
	        hashMap.put("LastName", "Singh");
	       
	        // Print the HashMap
	        System.out.println("HashMap: " + hashMap);
	    }
	}
