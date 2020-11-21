package com.jminded.datastructures.stack;

/**
 * 
 * @author Umashankar
 * {@link http://jminded.com}
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
