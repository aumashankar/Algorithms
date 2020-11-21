package com.jminded.datastructures.list;
/**
 * A Simple List ADT
 * @author Umashankar
 * {@link http://jminded.com}
 *
 */
public interface List {
      /**
       * Add item  
       * @param obj
       */
	  public void add(Object obj);
	  /**
	   * Add item at position
	   * @param pos
	   * @param obj
	   */
	  public void add(int pos, Object obj);
	  /**
	   * Remove item at position
	   * @param pos
	   * @return
	   */
	  public Object remove(int pos);
	  /**
	   * Get Object at position
	   * @param pos
	   * @return
	   */
	  public Object get (int pos);
	  
	  //Other auxiliary operations
	  /**
	   * Search for an object, if it contains return true, else return false
	   * @param Obj
	   * @return
	   */
	  public boolean contains(Object Obj);
	  /**
	   * Size of the list
	   * @return
	   */
	  public int size();
	  /**
	   * Return true if list is empty.
	   * @return
	   */
	  public boolean isEmpty(); 
	  
	  public Object[] toArray();
}
