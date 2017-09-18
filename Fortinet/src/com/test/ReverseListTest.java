package com.test;

import org.junit.Test;

import com.reverse.linkedlist.Node;
import com.reverse.linkedlist.ReverseLinkedList;

import junit.framework.TestCase;

public class ReverseListTest extends TestCase {

	@Test
	public void testReverseListInput1() {

		ReverseLinkedList ob = new ReverseLinkedList();
		Node head = null;
		assertEquals(ob.reverseList(head), null);

	}

	@Test
	public void testReverseListInput2() {

		ReverseLinkedList ob = new ReverseLinkedList();
		Node head = new Node(1);
		head.next = null;
		Node output = ob.reverseList(head);
		StringBuilder sb = new StringBuilder();
		while (head != null) {
			sb.append(head.value);
			head = head.next;
		}
		String inputStr = sb.toString();
		sb = new StringBuilder();

		while (output != null) {
			sb.append(output.value);
			output = output.next;
		}
		String outputStr = sb.toString();
		sb = new StringBuilder();
		assertEquals(inputStr, outputStr);

	}

	@Test
	public void testReverseListInput3() {

		ReverseLinkedList ob = new ReverseLinkedList();
		Node head = new Node(23);
		head.next = new Node(12);
		head.next.next = new Node(5000000);
		head.next.next.next = new Node(6336767);
		head.next.next.next.next = null;
		Node expHead = new Node(6336767);
		expHead.next = new Node(5000000);
		expHead.next.next = new Node(12);
		expHead.next.next.next = new Node(23);
		expHead.next.next.next.next = null;
		StringBuilder sb = new StringBuilder();
		while (expHead != null) {
			sb.append(expHead.value);
			expHead = expHead.next;
		}

		String inputStr = sb.toString();
		sb = new StringBuilder();
		Node output = ob.reverseList(head);
		while (output != null) {
			sb.append(output.value);
			output = output.next;
		}
		String outputStr = sb.toString();
		sb = new StringBuilder();
		assertEquals(inputStr, outputStr);

	}

	@Test
	public void testReverseListInput4() {

		ReverseLinkedList ob = new ReverseLinkedList();
		Node head = new Node(23455);
		head.next = new Node(23455);
		head.next.next = new Node(34);
		head.next.next.next = new Node(85);
		head.next.next.next.next = new Node(10000000);
		head.next.next.next.next.next = new Node(63456655);
		head.next.next.next.next.next.next = null;
		Node exphead = new Node(63456655);
		exphead.next = new Node(10000000);
		exphead.next.next = new Node(85);
		exphead.next.next.next = new Node(34);
		exphead.next.next.next.next = new Node(23455);
		exphead.next.next.next.next.next = new Node(23455);
		exphead.next.next.next.next.next.next = null;
		StringBuilder sb = new StringBuilder();
		while (exphead != null) {
			sb.append(exphead.value);
			exphead = exphead.next;
		}
		String inputStr = sb.toString();
		sb = new StringBuilder();
		Node output = ob.reverseList(head);
		while (output != null) {
			sb.append(output.value);
			output = output.next;
		}
		String outputStr = sb.toString();
		sb = new StringBuilder();
		assertEquals(inputStr, outputStr);

	}

}
