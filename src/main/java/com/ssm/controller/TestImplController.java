package com.ssm.controller;

import org.apache.log4j.Logger;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * @author newtranx_011
 */
public class TestImplController implements Controller {

	private static final String FLAG_TRUE = "1";

	private Logger logger = Logger.getLogger(this.getClass().getName());
	private String helloWorld;
	private String viewPage;

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String flag = request.getParameter("flag");
		System.out.println(flag);
		if (FLAG_TRUE.equals(flag)) {
			throw new Exception("test");
		}
		Map<String, String> map = new HashMap<>(10);
		map.put("helloWorld", this.getHelloWorld());
		logger.info(map);
		return new ModelAndView(this.getViewPage(), map);
	}

	public String getHelloWorld() {
		return helloWorld;
	}

	public void setHelloWorld(String helloWorld) {
		this.helloWorld = helloWorld;
	}

	public String getViewPage() {
		return viewPage;
	}

	public void setViewPage(String viewPage) {
		this.viewPage = viewPage;
	}
}
