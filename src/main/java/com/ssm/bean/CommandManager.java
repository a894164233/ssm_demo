/*
 * Copyright (c) 2018.
 * author: baitao
 */

package com.ssm.bean;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import java.util.Map;

/**
 * @author baitao
 * @date 2018/8/6 14:44
 */
public class CommandManager implements ApplicationContextAware {

	private ApplicationContext applicationContext;

	public Object process(Map commandState) {
		// grab a new instance of the appropriate Command
		Command command = createCommand();
		// set the state on the (hopefully brand new) Command instance
		command.setState(commandState);
		return command.execute();
	}

	protected Command createCommand() {
		// notice the Spring API dependency!
		return this.applicationContext.getBean("command", Command.class);
	}

	public void setApplicationContext(
			ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;
	}
}