/*
 * Copyright (c) 2018.
 * author: baitao
 */

package com.ssm.bean;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.EventListener;

/**
 * @author baitao
 * @date 2018/8/14 17:20
 */
public class BlackListNotifier implements ApplicationListener<BlackListEvent> {
	private String notificationAddress;

	public void setNotificationAddress(String notificationAddress) {
		this.notificationAddress = notificationAddress;
	}

	@EventListener({BlackListEvent.class})
	public  void processBlackListEvent() {

	}

	@EventListener
	public  void processBlackListEvent2(BlackListEvent blackListEvent) {

	}

	@EventListener(condition = "#blackListEvent.test = 'foo'")
	public  void processBlackListEvent3(BlackListEvent blackListEvent) {

	}

	@EventListener(condition = "#blackListEvent.test = 'foo'")
	public  void processBlackListEvent4(BlackListEvent blackListEvent) {

	}

	@Override
	public void onApplicationEvent(BlackListEvent event) {
		//...
	}
}
