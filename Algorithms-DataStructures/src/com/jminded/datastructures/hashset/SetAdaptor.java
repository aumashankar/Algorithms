package com.jminded.datastructures.hashset;

import com.jminded.datastructures.hashmap.Map;
import com.jminded.datastructures.hashmap.MapImpl;

public class SetAdaptor<K> implements Set<K> {
	
	 private transient Map<K,Object> map;
	 // Dummy value to associate with an Object in the backing Map
	 private static final Object PRESENT = new Object();
	 
	 public SetAdaptor() {
	        map = new MapImpl<K,Object>();
	 }

	@Override
	public boolean add(K e) {
		// TODO Auto-generated method stub
		return  map.put(e, PRESENT)==null;
	}

	@Override
	public boolean remove(K o) {
		// TODO Auto-generated method stub
		return (Object)map.remove(o)==PRESENT;
	}

	@Override
	public boolean contains(K o) {
		// TODO Auto-generated method stub
		return map.get(o)!=null;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return map.size();
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return map.size()==0;
	}

}
