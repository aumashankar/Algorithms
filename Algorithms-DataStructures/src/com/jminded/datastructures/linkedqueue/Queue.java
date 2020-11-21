package com.jminded.datastructures.linkedqueue;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * A Simple Queue ADT implementation using linked representation.
 * @author Umashankar 
 * {@link http://jminded.com}
 * @param <T>
 */
public class Queue<T> implements Iterable<T> {
	private int size; // number of elements on queue
	private Node first; // beginning of queue
	private Node last; // end of queue

	public Queue() {
		first = null;
		last = null;
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
	 * Add an new item to the queue.
	 */
	public void enqueue(T item) {
		// hold last node ref, to new variable
		Node oldlast = last;
		// create a new node and made it point to last.
		last = new Node();
		// feed the newly created node.
		last.item = item;
		last.next = null;
		// check for empty condition
		if (isEmpty())
			first = last;
		else
			// previous last--> next item is now last item.
			oldlast.next = last;
		size++;
	}

	/**
	 * Remove and return the item on the queue least recently added.
	 * 
	 * @throws java.util.NoSuchElementException
	 *             if queue is empty.
	 */
	public T dequeue() {
		if (isEmpty())
			throw new NoSuchElementException("Queue underflow");
		T item = first.item;
		first = first.next;
		size--;
		if (isEmpty())
			last = null; // to avoid loitering, let GC do it's job!
		return item;
	}

	/**
	 * Return the item most recently added to the queue.
	 * 
	 * @throws java.util.NoSuchElementException
	 *             if Queue is empty.
	 */
	public T peek() {
		// check for empty condition.
		if (isEmpty())
			throw new NoSuchElementException("Queue underflow");
		return first.item;
	}

	// auxiliary operations.
	public boolean isEmpty() {
		// return true, if size=0;
		return size == 0;
	}

	/**
	 * 
	 * @return
	 */
	public int size() {
		// return size
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
