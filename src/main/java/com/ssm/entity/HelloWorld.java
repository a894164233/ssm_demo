package com.ssm.entity;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.Date;

public class HelloWorld implements InitializingBean, DisposableBean {

	private String msg;

	private Date date;

	@PostConstruct
	public void init() {
		System.out.println(1);
		this.msg = "HelloWorld1";
		this.date = new Date();
	}

	public void init2() {
		System.out.println(2);
		this.msg = "HelloWorld2";
		this.date = new Date();
	}

	@Override
	public void afterPropertiesSet() {
		System.out.println(3);
		this.msg = "HelloWorld3";
		this.date = new Date();
	}
	//		this.msg = msg;
	//	public HelloWorld(String msg) {
	//
	//	}
	//
//	public HelloWorld() {

//	}

	@Override
	public String toString() {
		return "HelloWorld{" +
				"msg='" + msg + '\'' +
				", date=" + date +
				'}';
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public void destroy() throws Exception {
//		this.msg = "";
//		this.date = null;
//		System.out.println("销毁msg:" + this.msg + "和date:" + this.date);
		System.out.println("a");
	}

	@PreDestroy
	public void close() {
		System.out.println("b");
	}

	public void cleanup() {
		System.out.println("c");
	}
}
