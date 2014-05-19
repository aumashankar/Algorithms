package org.j2eedev.datastructures.stack;

/**
 * 
 * @author Umashankar
 * {@link http://j2eedev.org}
 * A Simple ADT for Stack
 *
 */
public interface Stack {

	public void push(Object obj);
	public Object pop();
	public Object peek();
	public boolean isEmpty();
	public Object[] toArray();
}
