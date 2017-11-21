package com.timu.lint.set;

import java.util.Arrays;
import java.util.Objects;

/**
 * No.211
 */
public class StringPermutation {

	public boolean Permutation(String a, String b) {

		if (Objects.isNull(a) || Objects.isNull(b))
			return false;

		char[] aa = a.toCharArray();
		char[] bb = b.toCharArray();

		if (aa.length != bb.length)
			return false;

		Arrays.sort(aa);
		Arrays.sort(bb);

		for (int i = 0; i < aa.length; i++) {
			if (aa[i] != bb[i])
				return false;
		}

		return true;
	}

}
