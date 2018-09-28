/*
 * Copyright (c) 2018. 
 * author: baitao
 */

package com.ssm.test;

import com.ssm.bean.BlackListEvent;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author baitao
 * @date 2018/8/14 17:56
 */
public class TestEventListener {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:/Spring-event-listener.xml");
		BlackListEvent blackListEvent = new BlackListEvent(applicationContext, "test", "test");
		applicationContext.publishEvent(blackListEvent);
	}
}
