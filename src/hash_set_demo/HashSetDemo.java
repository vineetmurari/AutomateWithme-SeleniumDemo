package hash_set_demo;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
public static void main(String[] args) {
	HashSet<String> names = new HashSet<String>();
	
	names.add("BOB");
	names.add("Marry");
	names.add("Krishna");
	names.add("Jhon");
	names.add("Jane");
	names.add("Doe");
	names.add("Ram");
	names.add("BOB");
	
	System.out.println(names);
	
	if(names.contains("Marry")){
		System.out.println("FOUND");
	}
	
	names.remove("BOB");
	
	System.out.println(names.size());
	
	for(String t:names){
		System.out.println(t);
	}
	
	Set<String> name = new HashSet<String>() ;
	

	
}
}
