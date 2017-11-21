package com.timu.lint.set;

import org.junit.Test;
import static org.junit.Assert.*;
import com.timu.lint.set.KClosestPoints.Point;

public class KClosestPointsTest {

	@Test
	public void test() {
		// Given points = [[4,6],[4,7],[4,4],[2,5],[1,1]], origin = [0, 0], k = 3
		// return [[1,1],[2,5],[4,4]]
		KClosestPoints test = new KClosestPoints();
		Point[] result = test.kClosest(new Point[] {new Point(4, 6)
				, new Point(4, 7)
				, new Point(4, 4)
				, new Point(2, 5)
				, new Point(1, 1)}, new Point(0, 0), 3);
		
		assertEquals(3, result.length);
		assertEquals(1, result[0].getX());
		assertEquals(1, result[0].getY());
		assertEquals(2, result[1].getX());
		assertEquals(5, result[1].getY());
		assertEquals(4, result[2].getX());
		assertEquals(4, result[2].getY());
	}

}
