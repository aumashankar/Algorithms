package com.jminded.datastructures.linkedqueue;

import java.util.Iterator;

public class LinkedQueueTestClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create a new Queue for Strings
		Queue<String> myQueue=new Queue<String>();
		System.out.println("Is my Queue empty?"+myQueue.isEmpty());
		//enqueuing stings on to my queue.
		myQueue.enqueue("Cormen");
		myQueue.enqueue("Sahni");
		myQueue.enqueue("Sedgewick");
		myQueue.enqueue("Lafore");
		myQueue.enqueue("Umashankar");
		
		//dequeue operation
		myQueue.dequeue();
		
		System.out.println("No.of Strings in my queue "+myQueue.size());
		
		Iterator<String> itr=myQueue.iterator();
		while (itr.hasNext()) {
			String myString = (String) itr.next();
			System.out.print(myString+" ");
		}
		//a little beautification of output!
		System.out.println();
		System.out.println("Least Recently added string "+myQueue.peek());

	}

}
