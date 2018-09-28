/*
 * Copyright (c) 2018.
 * author: baitao
 */

package com.ssm.bean;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

import java.util.List;

/**
 * @author baitao
 * @date 2018/8/14 17:16
 */
public class EmailService implements ApplicationEventPublisherAware {
	private List<String> blackList;
	private ApplicationEventPublisher applicationEventPublisher;

	public void setBlackList(List<String> blackList) {
		this.blackList = blackList;
	}

	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
		this.applicationEventPublisher = applicationEventPublisher;
	}

	public void sendEmail(String address, String test) {
		if (blackList.contains(address)) {
			BlackListEvent event = new BlackListEvent(this, address, test);
			this.applicationEventPublisher.publishEvent(event);
			return;
		}
		//send email...
	}
}
