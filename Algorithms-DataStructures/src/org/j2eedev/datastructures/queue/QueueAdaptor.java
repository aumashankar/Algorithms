package org.j2eedev.datastructures.queue;

import org.j2eedev.datastructures.list.ListImpl;

public class QueueAdaptor extends ListImpl implements Queue {
    
	/**
	 * add an element on to Queue
	 * Time Complexity :: O(1)
	 */
	@Override
	public void enqueue(Object obj) {
		// TODO Auto-generated method stub
		add(obj);
	}
    /**
     * Removes and returns first element in the array
     * Time Complexity  :: O(n)
     */
	@Override
	public Object dequeue() {
		// TODO Auto-generated method stub
		Object e=get(0);
		remove(0);
		return e;
	}
    /**
     * Returns first element in the array
     * Time Complexity  :: O(1)  
     */
	@Override
	public Object peek() {
		// TODO Auto-generated method stub
		return get(0);
	}
	
	public boolean isEmpty(){
		return super.isEmpty();
	}
	public Object[] toArray(){
		return super.toArray();
	}

}
