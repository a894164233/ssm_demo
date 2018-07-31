/*
 * Copyright (c) 2018.
 * author: baitao
 */

package com.ssm.test;

import com.ssm.service.TestTimer;

import java.util.Timer;

/**
 * @author baitao
 * @date 2018/7/31 17:41
 */
public class TestTimerMain {

	public static void main(String[] args) {
		System.out.println(1);
		Timer timer = new Timer();
		timer.schedule(new TestTimer(), 0, 1000);
	}
}
