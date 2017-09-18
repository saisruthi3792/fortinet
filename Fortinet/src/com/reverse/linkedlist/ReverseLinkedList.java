package com.reverse.linkedlist;

public class ReverseLinkedList {
	
	/*
	 * Function reverseList takes head node as the argument,
	 * reverses the list by pointing current node to the previous
	 * node and returns the head node of the new list.
	 * @param head It is the head node of the list that is to be reversed
	 */
	public Node reverseList(Node head){
		Node temp = head;
		if(head == null || head.next == null) {
			return head;
		}
		Node next = null; 
		Node prev = null; 
				
		while(temp != null) {
			next = temp.next;
			temp.next = prev;
			prev = temp;
			temp = next;
		}
		 
		
		return prev;
		
			
		
		}

	public static void main(String args[]) {
		Node l1 = new Node(1);
		l1.next = new Node(2);
		l1.next.next = new Node(3);
		l1.next.next.next = null;
		
		ReverseLinkedList rl = new ReverseLinkedList();
				Node l2=rl.reverseList(l1);
				while(l2 != null) {
					System.out.println(l2.value);
					l2= l2.next;
				}
				
	}

}
