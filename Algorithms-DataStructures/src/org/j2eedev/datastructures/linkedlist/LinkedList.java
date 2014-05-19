package org.j2eedev.datastructures.linkedlist;
/**
 * 
 * @author Umashankar
 * {@link http://j2eedev.org}
 * @param <T>
 */
public interface LinkedList<T> {
  
	public void add(T data);
	public void add(int pos,T data);
	public void addFirst(T data);
	public void addLast(T data);
	
	public void delete(T data);
	public void delete(int pos);
	public void deleteFirst();
	public void deleteLast();
	
	public int search(T data);
	public int size();
	public boolean isEmpty();
	
	public void display();
	
}
