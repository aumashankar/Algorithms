package org.j2eedev.datastructures.linkedstack;

import java.util.Iterator;

public class LinkedStackTestClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<String> myStack=new Stack<String>();
		System.out.println("Is my stack empty?"+myStack.isEmpty());
		//pushing stings on to my stack.
		myStack.push("Cormen");
		myStack.push("Sahni");
		myStack.push("Sedgewick");
		myStack.push("Lafore");
		myStack.push("Umashankar");
		
		//pop operation
		myStack.pop();
		
		System.out.println("No.of my stack of Strings"+myStack.size());
		
		Iterator<String> itr=myStack.iterator();
		while (itr.hasNext()) {
			String myString = (String) itr.next();
			System.out.print(myString+" ");
		}
		//a little beautification of output!
		System.out.println();
		System.out.println("Most Recently added string "+myStack.peek());

	}

}
