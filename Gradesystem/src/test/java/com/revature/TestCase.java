package com.revature;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCase {

	@Test
	public void test() {
	 String actual=Grade.gradeval(85);
	 assertEquals("A", actual);
	}
	@Test
	public void testgrade() {
	 String actual=Grade.gradeval(65);
	 assertEquals("B", actual);
	}
	@Test
	public void test1() {
	 String actual=Grade.gradeval(-10);
	 assertNull(actual);
}
}

