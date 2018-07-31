package com.ssm.entity;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.*;

/**
 * @author newtranx_011
 */
public class HelloWorld implements InitializingBean, DisposableBean {

	private String msg;
	private Date date;
	private List<String> list;
	private Set<String> set;
	private Map<String, String> map;
	private Properties properties;
	public HelloWorld() {
	}

	public HelloWorld(Date date) {
		this.date = date;
	}

//	public HelloWorld(String msg, Date date) {
//		this.msg = msg;
//		this.date = date;
//	}

	@PostConstruct
	public void init() {
		System.out.println(1);
//		this.msg = "HelloWorld1";
//		this.date = new Date();
	}

	public void init2() {
		System.out.println(2);
//		this.msg = "HelloWorld2";
//		this.date = new Date();
	}

	@Override
	public void afterPropertiesSet() {
		System.out.println(3);
//		this.msg = "HelloWorld3";
//		this.date = new Date();
	}

	@Override
	public void destroy() throws Exception {
//		this.msg = "";
//		this.date = null;
		System.out.println("a");
	}

	public void cleanup() {
		System.out.println("b");
	}

	@PreDestroy
	public void close() {
		System.out.println("c");
	}

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

	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}

	public Set<String> getSet() {
		return set;
	}

	public void setSet(Set<String> set) {
		this.set = set;
	}

	public Map<String, String> getMap() {
		return map;
	}

	public void setMap(Map<String, String> map) {
		this.map = map;
	}

	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}
}
