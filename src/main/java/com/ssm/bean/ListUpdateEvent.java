/*
 * Copyright (c) 2018.
 * author: baitao
 */

package com.ssm.bean;

import org.springframework.context.ApplicationEvent;

/**
 * @author baitao
 * @date 2018/8/14 18:33
 */
public class ListUpdateEvent extends ApplicationEvent {


	/**
	 * Create a new ApplicationEvent.
	 *
	 * @param source the object on which the event initially occurred (never {@code null})
	 */
	public ListUpdateEvent(Object source) {
		super(source);
	}
}
