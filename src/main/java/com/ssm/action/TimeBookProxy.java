/*
 * Copyright (c) 2018. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.ssm.action;

import com.ssm.impl.TimeBookInterface;
import org.apache.log4j.Logger;

public class TimeBookProxy {
	private Logger logger = Logger.getLogger(this.getClass().getName());
	private TimeBookInterface timeBookInterface;

	public TimeBookProxy(TimeBookInterface timeBookInterface) {
		this.timeBookInterface = timeBookInterface;
	}
	public void doAuditing(String name) {
		System.out.println("proxy start");
		timeBookInterface.doAuditing("proxy do");
		System.out.println("proxy end");
	}
}
