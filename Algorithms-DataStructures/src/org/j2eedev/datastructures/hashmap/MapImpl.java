package org.j2eedev.datastructures.hashmap;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
/**
 * 
 * @author Umashankar
 * {@link http://j2eedev.org}
 * @param <K>
 * @param <V>
 */
public class MapImpl<K, V> implements Map<K, V> {
	
	private int size=0;
	private int DEFAULT_CAPACITY = 20;
	@SuppressWarnings("unchecked")
	private Entry<K, V>[] values = new Entry[DEFAULT_CAPACITY];

	@Override
	public V put(K key, V value) {
		// TODO Auto-generated method stub
		 boolean insert = true;
		    for (int i = 0; i < size; i++) {
		      if (values[i].getKey().equals(key)) {
		        values[i].setValue(value);
		        insert = false;
		        return value;
		      }
		    }
		    if (insert) {
		      ensureCapacity();
		      values[size++] = new Entry<K, V>(key, value);
		    }
		    return null;
	}

	@Override
	public V get(K key) {
		// TODO Auto-generated method stub
		for (int i = 0; i < size; i++) {
		      if (values[i] != null) {
		        if (values[i].getKey().equals(key)) {
		          return values[i].getValue();
		        }
		      }
		}
		return null;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}

	@Override
	public V remove(K key) {
		// TODO Auto-generated method stub
		V oldValue=null;
		for (int i = 0; i < size; i++) {
		      if (values[i].getKey().equals(key)) {
		    	  oldValue=values[i].getValue();
		    	  values[i] = null;
		          size--;
		          //Shift map entries from right to left.
		          condenseArray(i);
		      }
		    }
		return oldValue;
	}

	@Override
	public Set<K> keySet() {
		// TODO Auto-generated method stub
		Set<K> set = new HashSet<K>();
		//loop through keys, to add them to a set.
	    for (int i = 0; i < size; i++) {
	      set.add(values[i].getKey());
	    }
	    return set;
	}
	
	 private void ensureCapacity() {
		if (size == values.length) {
		   int newSize = values.length * 2; //doubling the size strategy.
		     values = Arrays.copyOf(values, newSize);
	    }
	 }
	 
	 private void condenseArray(int pos) {
		    for (int i = pos; i < size; i++) {
		      values[i] = values[i + 1];
		    }
     }

}
