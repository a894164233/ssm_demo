package com.ssm.controller;

import com.ssm.entity.HelloWorld;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

@RestController
public class TestController {

	@Autowired
	private HelloWorld helloWorld;

	@PostMapping
	public String getHelloWorld() {
		if (Objects.isNull(helloWorld)) ;
		System.out.println(helloWorld.getMsg());
		return helloWorld.getMsg();
	}

	@PostMapping("test")
	public String test() {
		System.out.println();
		return "test";
	}


}
