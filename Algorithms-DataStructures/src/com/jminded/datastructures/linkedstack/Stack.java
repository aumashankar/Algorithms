package com.jminded.datastructures.linkedstack;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Stack<T> implements Iterable<T> {
	// private encapsulated members.
	private Node first;
	private int size;

	// A simple constructor for Bag.
	public Stack() {
		// initialization
		first = null;
		size = 0;
	}

	// helper linked list inner class for creating Nodes in Linked List
	private class Node {
		// data item for node
		private T item;
		// next pointer to a node.
		private Node next;
	}
	/**
     * Push an item on to the stack.
     */
    public void push(T item) {
    	//hold first Node reference to a variable
        Node oldfirst = first;
        //create new Node and made this point to first
        first = new Node();
        //feed the newly created node.
        first.item = item;
        first.next = oldfirst;
        size++;
    }

   /**
     * Delete and return the item most recently added to the stack.
     * @throws java.util.NoSuchElementException if stack is empty.
     */
    public T pop() {
    	//check for empty condition.
        if (isEmpty()) 
        	throw new NoSuchElementException("Stack underflow");
        T item = first.item;        // save item to return
        // delete first node, first node made point to next. let GC do it's job!
        first = first.next;            
        size--;
     // return the saved item
        return item;                   
    }


   /**
     * Return the item most recently added to the stack.
     * @throws java.util.NoSuchElementException if stack is empty.
     */
    public T peek() {
    	//check for empty condition.
        if (isEmpty()) throw new NoSuchElementException("Stack underflow");
        return first.item;
    }
	//auxiliary operations.
	public boolean isEmpty(){
    	//return true, if size=0;
    	return size==0;
    }
    /**
     * 
     * @return
     */
    public int size(){
    	//return size
    	return size;
    }

	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return new ListIterator();
	}

	/**
	 * ListIterator- similar to what we have implemented in the Bag
	 * DataStructure.
	 */
	private class ListIterator implements Iterator<T> {
		private Node current = first;

		public boolean hasNext() {
			// if current is not null, then we can call current.next, implies
			// that there is a next item.
			return current != null;
		}

		public void remove() {
			// currently, not being considered for our simplicity.
			throw new UnsupportedOperationException();
		}

		public T next() {
			// if there is no such next item, get out!
			if (!hasNext())
				throw new NoSuchElementException();
			T item = current.item;
			current = current.next;
			return item;
		}
	}

}
