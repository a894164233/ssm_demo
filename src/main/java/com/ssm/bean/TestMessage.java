/*
 * Copyright (c) 2018.
 * author: baitao
 */

package com.ssm.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.context.support.ResourceBundleMessageSource;

/**
 * @author baitao
 * @date 2018/8/14 15:49
 */
public class TestMessage extends ContextRefreshedEvent {
	/**
	 * Create a new ContextRefreshedEvent.
	 *
	 * @param source the {@code ApplicationContext} that has been initialized
	 *               or refreshed (must not be {@code null})
	 */
	public TestMessage(ApplicationContext source) {
		super(source);
	}

//	/**
//	 * Create a new ApplicationEvent.
//	 *
//	 * @param source the object on which the event initially occurred (never {@code null})
//	 */
//	public TestMessage(Object source) {
//		super(source);
//	}
//
//	@Override
//	public void onApplicationEvent(ApplicationEvent event) {
//
//	}
}
