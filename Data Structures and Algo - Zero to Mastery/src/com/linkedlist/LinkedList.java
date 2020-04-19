package com.linkedlist;

public class LinkedList {
	static ListNode head;
		static class ListNode{
			int data;
			ListNode next;
			
			ListNode(int d ){
				data = d;
				next = null;
			}
		}
		public static LinkedList  insert(LinkedList list, int data) {
			ListNode new_node = new ListNode(data);
			new_node.next = null;
			
			if(list.head == null ) {
				list.head = new_node;	
			}else {
				ListNode last = list.head;
				while(last.next!=null) {
					last = last.next;
				}
				last.next = new_node;
			}
			return list;
		}
		
		
		public static LinkedList delete(LinkedList list, int key) {
			ListNode currNode = list.head, prev = null;
				if(currNode!=null && currNode.data == key) {	
						list.head = currNode.next;
						return list;
					}
			
				while(currNode!=null && currNode.data != key) {
					prev = currNode;
					currNode = currNode.next;
				}
				if(currNode!=null)
						prev.next = currNode.next;
				else System.out.println("Not found");
			return list;
		}
		
		
		
		public static void printList(LinkedList list) {
			ListNode currNode = list.head;
			System.out.println("Linkedlist: ");
			while(currNode!=null) {
				System.out.print(currNode.data+" -> ");
				currNode = currNode.next;
			}			
			System.out.print("null");
		}
	public static LinkedList reverseList(LinkedList list) {
		ListNode currNode = head, prev = null, temp = null;
		while(currNode!=null) {
			temp = currNode.next;
			currNode.next = prev;
			prev = currNode;
			currNode = temp;
		}
		head = prev;
		return list;
	}
		public static void main(String[] args) {
			LinkedList list = new LinkedList();
			list = insert(list, 1);
			list = insert(list, 12);
			list = insert(list, 13);
			list = insert(list, 14);
			list = insert(list, 15);
			list = insert(list, 16);
			printList(list);
			list = delete(list, 13);
			System.out.println();
			printList(list);
			list = reverseList(list);
			System.out.println();
			printList(list);
		}
		
		
		
		
}
