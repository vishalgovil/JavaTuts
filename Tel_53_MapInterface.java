import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class Tel_53_MapInterface {

	public static void main(String[] args) {
		
		Map<String,String> map = new HashMap();  // As Map is an interface We need to create its object using HashMap
		map.put("myName", "Navin");
		map.put("actor", "John");
		map.put("ceo", "Marisa");
		
		
		System.out.println(map);   // Might not be the actual sequence cause it also uses hashmap
		
		System.out.println(map.get("myName"));
		
		System.out.println(map.get("randomkey")); //If the key is not present it'll give null.
		
		Set<String> keys = map.keySet();  // Storing all key values in a set
		
		for(String key : keys)   // Running one by one
		{
			System.out.println(key + " "+map.get(key));
		}
		
		
		
	}
}
