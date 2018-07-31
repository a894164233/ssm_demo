/*
 * Copyright (c) 2018. 
 * author: baitao
 */

package com.ssm.test;

import java.util.StringTokenizer;

/**
 * @author newtranx_011
 */
public class TestJavaDelimiters {
	public static void main(String[] args) {
		StringTokenizer stringTokenizer = new StringTokenizer("asd, asd", ",; \t\n", false);
		while (stringTokenizer.hasMoreTokens()) {
			System.out.println(stringTokenizer.nextToken());
		}
	}
}
