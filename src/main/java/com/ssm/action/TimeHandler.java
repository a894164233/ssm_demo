/*
 * Copyright (c) 2018. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.ssm.action;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

import java.util.Arrays;
import java.util.Objects;

public class TimeHandler implements MethodInterceptor {
	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		long processdTime= System.currentTimeMillis();
		System.out.println(this.getClass().getName() + ": " + "start run " + invocation.getMethod().getName());
		try {
			Object result;
			result = invocation.proceed();
			return result;
		} finally {
			System.out.println(this.getClass().getName() + ": " + "end run " + invocation.getMethod().getName());
			processdTime = System.currentTimeMillis() - processdTime;
			System.out.println(this.getClass().getName() + ": " + "running method:" + invocation.getMethod().getName() + "; total times: " + processdTime);
		}
	}
}
