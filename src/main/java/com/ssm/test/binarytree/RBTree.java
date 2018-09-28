/*
 * Copyright (c) 2018.
 * author: baitao
 */

package com.ssm.test.binarytree;

/**
 * @author baitao
 * @date 2018/8/28 14:52
 */
public class RBTree<T extends Comparable<T>> {
	private RBTree<T> mRoot;
	private static final boolean RED = false;
	private static final boolean BlACK = true;

	public class RBTNode<T extends Comparable<T>> {
		boolean color;
		T key;
		RBTNode<T> left;
		RBTNode<T> right;
		RBTNode<T> parent;

		public RBTNode(boolean color, T key, RBTNode<T> left, RBTNode<T> right, RBTNode<T> parent) {
			this.color = color;
			this.key = key;
			this.left = left;
			this.right = right;
			this.parent = parent;
		}
	}
}
