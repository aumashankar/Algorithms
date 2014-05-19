package org.j2eedev.datastructures.hashmap;

import java.util.Set;

/**
 * 
 * @author Umashankar
 * {@link http://j2eedev.org}
 * Map Test Client
 */
public class MapTestClient {
	
public static void main(String[] args) {
	 Map<String, Integer> map = new MapImpl<String, Integer>();
	    map.put("shankar", 1);
	    System.out.println(map.get("shankar"));
	    map.put("shankar", 2);
	    System.out.println(map.get("shankar"));
	    map.put("shankar", 1);
	    System.out.println(map.get("shankar"));
	    System.out.println("Map size "+map.size());
	    map.put("LarryPage",9);
	    System.out.println(map.size());
	    map.put("JamesGosling",2);
	    map.remove("shankar");
	    System.out.println(map.get("shankar"));
	    
	    Set<String> set=map.keySet();
	    Object[] keys=set.toArray();
	    for(Object key:keys)
	    	System.out.print((String)key+" ");
	    
}
}
