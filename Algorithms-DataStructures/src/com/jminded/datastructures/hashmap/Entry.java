package com.jminded.datastructures.hashmap;
/**
 * 
 * @author Umashankar
 * {@link http://jminded.com}
 * @param <K>
 * @param <V>
 */
public class Entry<K,V> {
	/**
	 * Hash map key should be an immutable key,so made final
	 */
	private final K key;
	private V value;
	/**
	 * Constructor initializes with key and value
	 * @param key
	 * @param value
	 */
	public Entry(K key, V value) {
	    this.key = key;
	    this.value = value;
	}
	public V getValue() {
		return value;
	}
	public void setValue(V value) {
		this.value = value;
	}
	public K getKey() {
		return key;
	}
}
