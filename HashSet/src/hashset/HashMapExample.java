package hashset;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapExample {
	private static char[] getValue;

	public static void main(String[] args)
	{
		//		key		value
		HashMap<String,Integer> map = new HashMap<>();
		
		// insert 
		map.put("Nepal", 129);
		map.put("India",120);
		map.put("USA", 100);
		map.put("Nepal", 150); // value gets updated if key exists 
		
		// search 
		if(map.containsKey("Nepal")) // checks the key is available or not 
		{
			System.out.println("key value is:" + " " + map.get("Nepal")); // get the value of key if key is present
		}
		else
		{
			System.out.println("key is not present");
		}
		
		// iteration
		
		for( Entry<String, Integer> e:map.entrySet())
		{
			System.out.println(e.getKey());
			System.out.println(e.getValue());
			
		}
		
		
	}

	

	

}
