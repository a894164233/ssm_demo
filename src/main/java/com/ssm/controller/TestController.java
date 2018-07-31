package com.ssm.controller;

import com.ssm.entity.HelloWorld;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

/**
 * @author newtranx_011
 */
@RestController
public class TestController {

	@Autowired
	private HelloWorld helloWorld;

	@PostMapping
	public String getHelloWorld() {
		System.out.println(helloWorld.getMsg());
		return helloWorld.getMsg();
	}

	@PostMapping("test")
	public String test() {
		System.out.println();
		return "test";
	}


}
