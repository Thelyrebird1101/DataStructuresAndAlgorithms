package com.queues;

public class QueuesImplUsingLinkedLists {
	Node front, rear;
	class Node{
		int data;
		Node next;
		Node(int x){
			this.data = x;
			this.next = null;
		}
	}
	public QueuesImplUsingLinkedLists() {
		this.front = null;
		this.rear = null;
	}
	
	public boolean isEmpty() {
		return (front == null);
	}
	
	public void enQueue(int x) {
		Node newNode = new Node(x);
		if(rear == null) {
			rear = newNode;
			rear.next = null;
			front=rear;
		}
		else {
			rear.next = newNode;
			rear = rear.next;
			rear.next = null;
		}
	}
	
	public void deQueue() {
		if(isEmpty()) {
			System.out.println("Queue is Empty");
			return;
		}
		front = front.next; 
	}
	
	public int front() {
		if(!isEmpty())
			return front.data;
		else return Integer.MIN_VALUE;
	}
	
	public int rear() {
		if(!isEmpty())
				return rear.data;
		else return Integer.MIN_VALUE;
	}
	
	
}
