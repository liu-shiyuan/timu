package com.timu.lint.set;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * No.382
 */
public class TriangleCount {
	public int triangleCount(int[] s) {
		if (Objects.isNull(s) || s.length < 3)
			return 0;

		int count = 0;
		char[] chars = null;
		List<Integer> indexes = new ArrayList<>();
		for (long i = 7; i < (1 << s.length); i++) {
			chars = Long.toBinaryString(i).toCharArray();
			indexes = valid(chars);
			if (indexes.size() == 3 && canFormTriangle(s[indexes.get(0)], s[indexes.get(1)], s[indexes.get(2)])) {
				count++;
			}
		}

		return count;
	}

	private boolean canFormTriangle(int a, int b, int c) {
		return ((a + b) > c) && ((a + c) > b) && ((c + b) > a);
	}

	private List<Integer> valid(char[] chars) {
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < chars.length; i++) {
			if (chars[i] == '1') {
				list.add(i);
			}
		}
		return list;
	}
}
