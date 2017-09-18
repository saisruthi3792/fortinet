package com.test;

import java.util.ArrayList;
import org.junit.Test;

import com.kgroups.SplitList;

import junit.framework.TestCase;

public class SplitListTest extends TestCase {

	@Test
	public void testSplitListInput1() {

		SplitList ob = new SplitList();
		ArrayList<Integer> input = new ArrayList<Integer>();
		boolean expected = false;
		boolean actual = ob.separate(input, 3);
		assertEquals(expected, actual);

	}

	@Test
	public void testSplitListInput2() {

		SplitList ob = new SplitList();
		ArrayList<Integer> input = new ArrayList<Integer>();
		input.add(8);
		input.add(9);
		input.add(4);
		input.add(5);
		boolean expected = false;
		boolean actual = ob.separate(input, 5);
		assertEquals(expected, actual);

	}

	@Test
	public void testSplitListInput3() {

		SplitList ob = new SplitList();
		ArrayList<Integer> input = new ArrayList<Integer>();
		input.add(15);
		input.add(9);
		input.add(4);
		input.add(5);
		boolean expected = false;
		boolean actual = ob.separate(input, 2);
		assertEquals(expected, actual);

	}

	@Test
	public void testSplitListInput4() {

		SplitList ob = new SplitList();
		ArrayList<Integer> input = new ArrayList<Integer>();
		input.add(1);
		input.add(5);
		input.add(11);
		input.add(5);
		boolean expected = true;
		boolean actual = ob.separate(input, 2);
		assertEquals(expected, actual);

	}

	@Test
	public void testSplitListInput5() {

		SplitList ob = new SplitList();
		ArrayList<Integer> input = new ArrayList<Integer>();
		input.add(3);
		input.add(0);
		input.add(4);
		input.add(5);
		input.add(6);
		boolean expected = true;
		boolean actual = ob.separate(input, 3);
		assertEquals(expected, actual);

	}

}
