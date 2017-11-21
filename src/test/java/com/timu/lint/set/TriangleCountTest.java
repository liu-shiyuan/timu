package com.timu.lint.set;

import static org.junit.Assert.*;

import org.junit.Test;

public class TriangleCountTest {

	@Test
	public void test() {
		// [3,4,6,7] -> 3
		int[] input = new int[] {1,2,3,4,5,6,7,8};
		TriangleCount tc = new TriangleCount();
		int count = tc.triangleCount(input);
		assertEquals(3, count);
	}

}
