package org.j2eedev.datastructures.queue;

import org.j2eedev.datastructures.stack.StackAdaptor;

public class QueueTestClient {

	/**
	 * @author Umashankar
	 * {@link http://j2eedev.org}
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueAdaptor queue=new QueueAdaptor();
		System.out.println(queue.isEmpty());
		queue.enqueue(1);
		queue.enqueue(4);
		queue.enqueue(5);
		Object[] queueElements=queue.toArray();
		for(Object i:queueElements)
			System.out.print((Integer)i+" ");
		System.out.println();
		System.out.println("First element in the Queue");
		System.out.println(queue.peek());
		System.out.println("Dequeuing element from the Queue "+queue.dequeue());
		System.out.println("Queue elements after dequeue() operation");
		Object[] queueElements2=queue.toArray();
		for(Object i:queueElements2)
			System.out.print((Integer)i+" ");

	}

}
