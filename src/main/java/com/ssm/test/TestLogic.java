/*
 * Copyright (c) 2018. Lorem ipsum dolor sit amet, consectetur adipiscing elit. 
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan. 
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna. 
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus. 
 * Vestibulum commodo. Ut rhoncus gravida arcu. 
 */

package com.ssm.test;

import com.ssm.action.Logic2;
import com.ssm.impl.LogicInterface;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author newtranx_011
 */
public class TestLogic {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:/Spring-logic.xml");
		LogicInterface logicInterface = (LogicInterface) applicationContext.getBean("logic1Proxy");
		try {
			logicInterface.doInsert("rose");
			logicInterface.doUpdate("rose");
			logicInterface.doDelete("rose");
		} catch (Exception e) {
			System.out.println(TestLogic.class.getName() + ": " + e.getMessage());
		}

		Logic2 logic2 = (Logic2) applicationContext.getBean("logic2Proxy");
		try {
			logic2.doInsert("jack");
			logic2.doUpdate("jack");
			logic2.doDelete("jack");
		} catch (Exception e) {
			System.out.println(TestLogic.class.getName() + ": " + e.getMessage());
		}

	}
}
