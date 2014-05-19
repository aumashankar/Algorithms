package org.j2eedev.datastructures.queue;

/**
 * 
 * @author Umashankar
 * {@link http://j2eedev.org}
 * A Simple ADT for Queue
 *
 */
public interface Queue {
	public void enqueue(Object obj);
	public Object dequeue();
	public Object peek();
	public boolean isEmpty();
	public Object[] toArray();
	
}
