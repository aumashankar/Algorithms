package org.j2eedev.datastructures.bag;

import java.util.Iterator;

public class BagTestClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //Creating a new Bag            
		Bag<String> myBag=new Bag<String>();
        System.out.println("Hey! is my bag empty?"+myBag.isEmpty());   
		//Adding items into new bag.
		   myBag.add("Cormen");
           myBag.add("Sahni");
           myBag.add("Lafore");
           myBag.add("Sedgewick");
           
           System.out.println(myBag.size()+" No.Of items in myBag!");
           
           //looping My Bag through Iterator
           Iterator<String> myBagIterator=myBag.iterator();
           while(myBagIterator.hasNext()){
        	   System.out.print(myBagIterator.next()+" ");
           }
	}

}
