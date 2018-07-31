/*
 * Copyright (c) 2018.
 * author: baitao
 */

package com.ssm.service;

import java.util.TimerTask;

/**
 * @author baitao
 * @date 2018/7/31 17:38
 */
public class TestTimer extends TimerTask {

	@Override
	public void run() {
		System.out.println("timer running");
	}
}
