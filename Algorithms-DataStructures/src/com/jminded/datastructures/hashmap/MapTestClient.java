package com.jminded.datastructures.hashmap;

import java.util.Set;

/**
 * 
 * @author Umashankar
 * {@link http://jminded.com}
 * Map Test Client
 */
public class MapTestClient {
	
public static void main(String[] args) {
	 Map<String, Integer> map = new MapImpl<String, Integer>();
	    map.put("Umashankar", 1);
	    System.out.println(map.get("Umashankar"));
	    map.put("Umashankar", 2);
	    System.out.println(map.get("Umashankar"));
	    map.put("Umashankar", 1);
	    System.out.println(map.get("Umashankar"));
	    System.out.println("Map size "+map.size());
	    map.put("LarryPage",9);
	    System.out.println(map.size());
	    map.put("JamesGosling",2);
	    map.remove("Umashankar");
	    System.out.println(map.get("Umashankar"));
	    
	    Set<String> set=map.keySet();
	    Object[] keys=set.toArray();
	    for(Object key:keys)
	    	System.out.print((String)key+" ");
	    
}
}
