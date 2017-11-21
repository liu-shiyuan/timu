package com.timu.lint.set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/**
 * No.376
 */
public class BinaryTreePathSum {

	public List<List<Integer>> binaryTreePathSum(TreeNode root, int target) {
		List<List<Integer>> cache = Collections.synchronizedList(new ArrayList<>());
		
		if (Objects.isNull(root))
			return cache;
		find(new ArrayList<Integer>(), root, target, cache);
		return cache;
	}

	private void find(List<Integer> ans, TreeNode root, int target, List<List<Integer>> cache) {
		List<Integer> temp = new ArrayList<Integer>(ans);
		temp.add(root.val);
		int sum = (int) temp.stream().reduce((a, b) -> a + b).get();
		if (Objects.isNull(root.left) && Objects.isNull(root.right)) {
			if (sum == target) {
				cache.add(temp);
			}
		} else {
			if (Objects.nonNull(root.left)) {
				find(temp, root.left, target, cache);
			}
			if (Objects.nonNull(root.right)) {
				find(temp, root.right, target, cache);
			}
		}

	}

	public class TreeNode {
		public int val;
		public TreeNode left, right;

		public TreeNode(int val) {
			this.val = val;
			this.left = this.right = null;
		}
	}

}
