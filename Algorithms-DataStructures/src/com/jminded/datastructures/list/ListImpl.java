package com.jminded.datastructures.list;

import java.util.Arrays;
/**
 * List ADT Implimentation in java.
 * @author Umashankar
 * {@link http://jminded.com}
 *
 */
public class ListImpl implements List{
	
	private Object[] elements; // the items in the list
	private static final int DEFAULT_CAPACITY = 10;
    private int size;   // the number of items in the list
    
    //**********************************************************************
    // ListImpl constructor
    //
    // initialize the list to be empty
    //**********************************************************************
	public ListImpl() {
		this.elements = new Object[DEFAULT_CAPACITY];
		size=0;
	}
    /*--methods--*/
	//**********************************************************************
	// add
	//
	// Given: Object obj
	//
	// Do:    Add obj to the end of the list
	//
	// Implementation:
	//   If the array is full, replace it with a new, larger array;
	//   store the new item after the last item
	//   and increment the count of the number of elements in the list.
	//**********************************************************************
	@Override
	public void add(Object obj) {
		// TODO Auto-generated method stub
		// if array is full, get new array of double size,
	    // and copy items from old array to new array
	    if (elements.length ==size) 
	    	 ensureCapacity();

	    // add new item; update size
	    elements[size] = obj;
	    size++;
	    /*elements[size++]=obj;*/
	}
	//**********************************************************************
	// add
	//
	// Given: int pos, Object obj
	//
	// Do:  Add obj to the list in position pos (moving items over to the right
	//	        to make room).
	//
	// Exceptions:
	//	        Throw IndexOutOfBoundsException if pos<0 or pos>size
	//
	// Implementation:
	//   1. check for bad pos
	//   2. if the array is full, replace it with a new, larger array
	//   3. move items over to the right
	//   4. store the new item in position pos
	//   5. increment the count of the number of items in the list
	// **********************************************************************
	@Override
	public void add(int pos, Object obj) {
		// TODO Auto-generated method stub
		 // check for bad pos and for full array
	    if (pos < 0 || pos > size) 
	    	throw new IndexOutOfBoundsException();
	    //if the array is full, replace it with a new, larger array
	    if (elements.length ==size) 
	    	ensureCapacity();

	    // move items over and insert new item
	    for (int k=size; k>pos; k--) {
	        elements[k] = elements[k-1];
	    }
	    //store the new item in position pos
	    elements[pos] = obj;
	    //increment the count of the number of items in the list
	    size++;
		
	}
	//**********************************************************************
		// remove
		//
		// Given: int pos
		//
		// Do:  Move items over to the left and decrement the size of the list.
		//
		// Exceptions:
		//	        Throw IndexOutOfBoundsException if pos<0 or pos>size
		//
		// Implementation:
		//   1. check for bad pos
		//   2. Hold the oldValue to return
		//   3. move items over to the left
		//   4. decrement the count of the number of items in the list
		// **********************************************************************  
	@Override
	public Object remove(int pos) {
		// TODO Auto-generated method stub
		 // check for bad pos 
	    if (pos < 0 || pos > size) 
	    	throw new IndexOutOfBoundsException();
	    //hold oldValue
	    Object oldValue = elements[pos];
	    
	    int numMoved = size - pos - 1;
	    if (numMoved > 0)
	      System.arraycopy(elements, pos+1, elements, pos,numMoved);
	    elements[--size] = null; // Let gc do its work
		return oldValue;
	}
	//**********************************************************************
	// get
	//
	// Given: int pos
	//
	// Do:  Return element at given position, pos.
	//
	// Exceptions:
	//	        Throw IndexOutOfBoundsException if pos<0 or pos>size
	//
	// Implementation:
	//   1. check for bad pos
	//   2. return element at given position, pos
	// **********************************************************************      
	@Override
	public Object get(int pos) {
		// TODO Auto-generated method stub
		// check for bad pos 
	    if (pos < 0 || pos > size) 
	    	throw new IndexOutOfBoundsException();
	    
		 return elements[pos];
	}

	@Override
	public boolean contains(Object obj) {
		// TODO Auto-generated method stub
		for(int pos=0;pos<size;pos++){
			if(!isEmpty()&&obj.equals(elements[pos]))
				return true;
		}
		return false;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return size==0;
	}
	
	/**
	 * Ensures enough size to hold array elements
	 * private method, do not expose this to the outside world.
	 */
	 private void ensureCapacity() {
		 //doubling the size strategy.
		 int newSize = elements.length * 2;
		  elements = Arrays.copyOf(elements, newSize);
		//**********************************************************************
		// ensureCapacity
		//
		// Do:
		//   1.Get a new array of twice the current size.
		//   2.Copy the items from the old array to the new array.
		//   3.Make the new array be this list's "elements" array.
		//**********************************************************************
		 /* Object[] newArray = new Object[elements.length * 2];
		 
		  for (int k=0; k<size; k++) {
		        newArray[k] = elements[k];
		  }
		  elements =newArray;*/
	 }
	 /**
	  * Return array of elements
	  */
	 public Object[] toArray() {
	     return Arrays.copyOf(elements, size);
     }

	
	

}
