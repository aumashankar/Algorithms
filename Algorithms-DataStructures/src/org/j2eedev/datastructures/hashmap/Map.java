/**
 * 
 */
package org.j2eedev.datastructures.hashmap;

import java.util.Set;

/**
 * @author Umashankar
 * {@link http://j2eedev.org}
 * A Simple ADT for Map
 */
public interface Map<K,V> {
	public V put(K key, V value);
	public V get(K key);
	public int size();
	public V remove(K key);
	public Set<K> keySet();
}
