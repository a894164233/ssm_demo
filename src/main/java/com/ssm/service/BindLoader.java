/*
 * Copyright (c) 2018.
 * author: baitao
 */

package com.ssm.service;

import javax.servlet.Servlet;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import java.util.Timer;

/**
 * @author baitao
 * @date 2018/7/31 17:44
 */
public class BindLoader implements ServletContextListener {
	private Timer timer = null;

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		timer = new Timer();
		timer.schedule(new TestTimer(), 0, 1000);
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		timer.cancel();
	}
}
