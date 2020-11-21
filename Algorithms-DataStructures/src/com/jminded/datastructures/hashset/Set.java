package com.jminded.datastructures.hashset;
/**
 * A Simple Set ADT
 * @author Umashankar
 * {@link http://jminded.com}
 * @param <K>
 */
public interface Set<K> {
  public boolean add(K e);
  public boolean remove(K o);
  public boolean contains(K o);
  public int size();
  public boolean isEmpty();
  
}
