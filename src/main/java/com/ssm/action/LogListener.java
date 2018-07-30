/*
 * Copyright (c) 2018. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.ssm.action;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

import java.text.SimpleDateFormat;
import java.util.Date;

public class LogListener implements ApplicationListener {
	@Override
	public void onApplicationEvent(ApplicationEvent event) {
		if (event instanceof LogEvent) {
			SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			format.setLenient(false);
			String currentDate = format.format(new Date());
			System.out.println("LogListener: " + event.getSource());
			System.out.println("输出时间：" + currentDate + "输出内容：" + event.toString());
		}
	}
}
