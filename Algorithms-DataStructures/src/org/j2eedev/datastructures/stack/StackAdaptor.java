package org.j2eedev.datastructures.stack;

import org.j2eedev.datastructures.list.ListImpl;

/**
 * 
 * @author Umashankar
 * {@link http://j2eedev.org}
 * Stack Adaptor class using ListImpl
 *
 */
public class StackAdaptor extends ListImpl implements Stack {
    /**
     * Push an item on to the stack, as a last item in the array.
     */
	@Override
	public void push(Object obj) {
		// TODO Auto-generated method stub
		//Add as last item in the array.
		add(obj);
	}
    /**
     * Pop an item from the stack, remove and return last element in the array.
     */
	@Override
	public Object pop() {
		// TODO Auto-generated method stub
		 Object e = get(size() - 1);
		 remove(size() - 1);
		return e;
	}
    /**
     * Return last element in the array.
     */
	@Override
	public Object peek() {
		// TODO Auto-generated method stub
		return get(size() - 1);
	}
	
	//auxiliary methods
	public boolean isEmpty(){
		return super.isEmpty();
	}
	public Object[] toArray(){
		return super.toArray();
	}
	

}
