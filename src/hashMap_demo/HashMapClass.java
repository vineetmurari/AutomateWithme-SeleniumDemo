package hashMap_demo;

import java.util.HashMap;
import java.util.Map;

public class HashMapClass {
public static void main(String[] args) {
	HashMap<String, String> capitalCities = new HashMap<String, String>();
	
	  // Add keys and values (Country, City)
    capitalCities.put("England", "London");
    capitalCities.put("Germany", "Berlin");
    capitalCities.put("Norway", "Oslo");
    capitalCities.put("USA", "Washington DC");
    
    System.out.println(capitalCities);
    
    
    String cpaital =capitalCities.get("England");
    System.out.println(cpaital);
    
    for(String i : capitalCities.keySet()){
    	System.out.println("Country "+i+"   "+ "City "+capitalCities.get(i));
    }
    
   System.out.println(capitalCities.size());
   
   HashMap<Integer, Integer> Number = new HashMap<Integer, Integer>();
   Number.put(10, 10);
   Number.put(11, 10);
   Number.put(12, 10);
   Number.put(13, 10);
   
   System.out.println(Number);
   System.out.println(Number.get(10));
   
   
   Map<String, String> capitalCities1 = new HashMap<String, String>();
   
}
}
