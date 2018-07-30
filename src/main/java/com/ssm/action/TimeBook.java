/*
 * Copyright (c) 2018. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.ssm.action;

import com.ssm.impl.TimeBookInterface;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

public class TimeBook implements TimeBookInterface {
	private Logger logger = Logger.getLogger(this.getClass().getName());
	/**
	 * 测试 
	 */
	@Override
	public void doAuditing(String name){
		logger.log(Level.INFO, name + "start");
		System.out.println("self start");

		System.out.println("do something ...");
//		int i = 1/0;

		System.out.println("self end");
//		do something
		logger.log(Level.INFO, name + "end");

	}
}
