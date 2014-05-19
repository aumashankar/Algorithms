package org.j2eedev.datastructures.list;

public class ListExample {

	/**
	 * @author Umashankar
	 * {@link http://j2eedev.org}
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListImpl list=new ListImpl();
		System.out.println(list.isEmpty());
		list.add(1);
		list.add(2);
		list.add(5);
		list.add(7);
		list.add(3,8);
		System.out.println(list.get(0));
		list.remove(0);
		System.out.println(list.get(0));
		list.add(0,9);
		System.out.println(list.get(0));
		System.out.println(list.isEmpty());
		System.out.println(list.contains(5));
		System.out.println(list.size());

	}

}
