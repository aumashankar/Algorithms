package com.jminded.datastructures.hashset;

public class SetTestClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Set<String> set=new SetAdaptor<String>();
       System.out.println("Is set Empty? "+set.isEmpty());
       set.add("shankar");
       set.add("RodJohnson");
       set.add("GavinKing");
       System.out.println("Size of the set "+set.size());
       System.out.println(set.contains("GavinKing"));
       System.out.println(set.contains("Apache"));
       System.out.println(set.contains("shankar"));
       System.out.println(set.remove("shankar"));
       System.out.println(set.contains("shankar"));
       System.out.println("Size of the set "+set.size());
       
	}

}
