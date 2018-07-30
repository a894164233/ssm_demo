/*
 * Copyright (c) 2018. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.ssm.action;

import com.ssm.impl.LogicInterface;

public class Logic1 implements LogicInterface {
	@Override
	public void doInsert(String name) {
		System.out.println(this.getClass().getName() + ": " + "doInsert " + name);
	}

	@Override
	public void doUpdate(String name) {
		System.out.println(this.getClass().getName() + ": " + "doUpdate " + name);
	}

	@Override
	public void doDelete(String name) {
		System.out.println(this.getClass().getName() + ": " + "doDelete " + name);
		int i = 1/0;
	}
}
