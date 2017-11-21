package com.timu.lint.set;

import java.util.Arrays;
import java.util.Objects;

/**
 * No.612
 */
public class KClosestPoints {

	public Point[] kClosest(Point[] points, Point origin, int k) {
		Objects.requireNonNull(points);
		Objects.requireNonNull(origin);
		
		if (k > points.length)
			k = points.length;
		
		if (points.length == 0)
			return points;
		
		Arrays.sort(points, (p1, p2) -> {
			double diff = distanceBetweenTwoPoint(p1, origin) - distanceBetweenTwoPoint(p2, origin);
			if (diff != 0.0) {
				return (int)diff;
			} else {
				return (p1.x - p2.x) != 0 ? (p1.x - p2.x) : (p1.y - p2.y);
			}
		});
		
		Point[] result = new Point[k];
		Arrays.asList(points).subList(0, k).toArray(result);
		return result;
	}
	
	private static double distanceBetweenTwoPoint(Point a, Point b) {
		double distance = Math.pow(a.x - b.x, 2) + Math.pow(a.y - b.y, 2);
		return distance;
	}

	public static class Point {
		private int x;
		private int y;

		Point(int a, int b) {
			x = a;
			y = b;
		}

		public int getX() {
			return x;
		}

		public void setX(int x) {
			this.x = x;
		}

		public int getY() {
			return y;
		}

		public void setY(int y) {
			this.y = y;
		}
	}


}
