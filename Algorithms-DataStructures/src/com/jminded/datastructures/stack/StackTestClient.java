package com.jminded.datastructures.stack;

public class StackTestClient {

	/**
	 * @author Umashankar
	 * {@link http://jminded.com}
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StackAdaptor stack=new StackAdaptor();
		stack.push(1);
		stack.push(4);
		stack.push(5);
		Object[] stackElements=stack.toArray();
		for(Object i:stackElements)
			System.out.print((Integer)i+" ");
		System.out.println();
		System.out.println("Top of the stack");
		System.out.println(stack.peek());
		System.out.println("Poping element from the stack "+stack.pop());
		System.out.println("Stack elements after pop() operation");
		Object[] stackElements2=stack.toArray();
		for(Object i:stackElements2)
			System.out.print((Integer)i+" ");
		
		

	}

}
