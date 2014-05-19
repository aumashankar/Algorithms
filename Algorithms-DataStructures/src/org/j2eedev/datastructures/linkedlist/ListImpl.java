package org.j2eedev.datastructures.linkedlist;

import org.j2eedev.datastructures.linkedlist.LinkedList;

public class ListImpl<T> implements LinkedList<T> {
	
	Node<T> first=null;

	@Override
	public void add(T data) {
		// TODO Auto-generated method stub
		//create a new node
		Node<T> newNode = new Node<T>();
		newNode.setData(data); //feed data to the new node
		
		if(first == null)  
		first = newNode;  // If first node pointing to null then, make newNode as first
		else{             //there are no.of nodes 
		Node temp = first;  
		while(temp.getNext() != null){ //traverse to the last node
		temp = temp.getNext();        
		}
		//Now we reached last node
		//set current lastNode next to newNode
		temp.setNext(newNode);
		}
		
	}

	@Override
	public void add(int pos, T data) {
		// TODO Auto-generated method stub
		int count = 1;
		//creation of newNode with given data item.
		Node<T> newNode = new Node<T>();
		newNode.setData(data);
		
		Node<T> temp = first;
		//traverse the list
		//Suppose, we need to insert at a position 3, we traverse to the node 2 (pos-1)
		//temp.getNext() != null condition to check end of the list.
		while(count != pos-1 && temp.getNext() != null){
			temp = temp.getNext();
		    count++;
		}
		//Now we are at (pos-1) position.
		//always handle new node right pointer first.
		newNode.setNext(temp.getNext());
		//(pos-1) node next is set to newNode.
		temp.setNext(newNode);
		
	}

	@Override
	public void addFirst(T data) {
		// TODO Auto-generated method stub
		//create a newNode,feed with data.
		Node<T> newNode = new Node<T>();
		newNode.setData(data);
		//as we are inserting at first, newNode next make point to current first.
		newNode.setNext(first);
		//Now make newNode as first
		first = newNode;
	}

	@Override
	public void addLast(T data) {
		// TODO Auto-generated method stub
		//create a newNode,feed with data.
		Node newNode = new Node();
		newNode.setData(data);
		
		Node temp = first;
		//loop through elements to go to last element in the list
		while(temp.getNext() != null){
		temp = temp.getNext();
		}
		//Now we are at last element.
		//current last node next is set to newNode
		temp.setNext(newNode);
		//make newNode as last node in the list, set it's next to null.
		newNode.setNext(null);
		
	}

	@Override
	public void delete(T data) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int pos) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteFirst() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteLast() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int search(T data) {
		// TODO Auto-generated method stub
		//temp is point to first node
		Node<T> temp = first;
		int pos = 1;
		while(temp != null){
		//loop through elements in the list, check with data item	
		if(data == temp.getData())
		      return pos;     //if found return position.
		//increment position
		pos++;
		temp = temp.getNext(); 
		}
		return -1; // there is no such element found, return -1
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		Node<T> temp = first;
		while(temp != null){
			System.out.print((T)temp.getData());
		temp = temp.getNext();
		}
		}
		
	}
	class Node<T>{
		T data;
		Node<T> next;
		
		public T getData() {
			return data;
		}
		public void setData(T data) {
			this.data = data;
		}
		public Node<T> getNext() {
			return next;
		}
		public void setNext(Node<T> next) {
			this.next = next;
		}
		
		
	}
	
