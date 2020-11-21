package com.jminded.datastructures.queue;

/**
 * 
 * @author Umashankar
 * {@link http://jminded.com}
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
