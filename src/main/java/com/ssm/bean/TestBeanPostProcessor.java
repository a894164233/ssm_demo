/*
 * Copyright (c) 2018.
 * author: baitao
 */

package com.ssm.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanClassLoaderAware;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.web.context.ServletConfigAware;

import javax.servlet.ServletConfig;

/**
 * @author baitao
 * @date 2018/8/8 10:23
 */
public class TestBeanPostProcessor implements ApplicationContextAware, ApplicationEventPublisherAware,
		BeanClassLoaderAware, BeanFactoryAware,ServletConfigAware, BeanPostProcessor {

	@Override
	public void setBeanClassLoader(ClassLoader classLoader) {

	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {

	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

	}

	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {

	}

	@Override
	public void setServletConfig(ServletConfig servletConfig) {

	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		return null;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		return null;
	}
}
