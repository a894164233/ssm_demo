/*
 * Copyright (c) 2018.
 * author: baitao
 */

package com.ssm.bean;

import org.springframework.context.ApplicationEvent;

/**
 * @author baitao
 * @date 2018/8/14 17:14
 */
public class BlackListEvent extends ApplicationEvent {

	private String address;
	private String test;

	public BlackListEvent(Object source) {
		super(source);
	}

	/**
	 * Create a new ApplicationEvent.
	 *
	 * @param source the object on which the event initially occurred (never {@code null})
	 */
	public BlackListEvent(Object source, String address, String test) {
		super(source);
		this.address = address;
		this.test = test;
	}
}
