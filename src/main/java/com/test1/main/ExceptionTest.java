/*
 * Copyright (c) 2018.
 * author: baitao
 */

package com.test1.main;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.*;

/**
 * @author baitao
 * @date 2018/9/12 16:14
 */
public class ExceptionTest {

	public static void main(String[] args) {
//		test22();
//		test33();
//		test47();
//		test83();
//		List<String> list = new ArrayList<>();
//		list.add("123");
//		test36(list);

		test133();
	}

	/**
	 * 测试
	 */
	 @SafeVarargs// Not actually safe!
	public static void test36(List<String>... stringLists){
		Object[] array = stringLists;
		List<Integer> tmpList = Arrays.asList(42);
		array[0] = tmpList; // Semantically invalid, but compiles without warnings
		String s = stringLists[0].get(0); // Oh no, ClassCastException at runtime!
	}

	@SafeVarargs
	public static <T> void showArgs(T... array) {
		for (T arg : array) {
			System.out.println(arg.getClass().getName() + ":" + arg);
		}
	}

	//ClassCastException
	public static void test22() {
		try {
			Object x = new Integer(0);
			System.out.println((String) x);
		} catch (ClassCastException e) {
			e.printStackTrace();
		}
	}

	//ArrayStoreException
	public static void test33() {
		try {
			Object x[] = new String[3];
			x[0] = "123";
			x[1] = new Integer(0);
		} catch (ArrayStoreException e) {
			e.printStackTrace();
		}
	}

	//Void.class 作用,参考网址：https://www.jianshu.com/p/678292d341f8
	public static void test47() {
		System.out.println(Void.TYPE);
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println(123);
			}
		});

		Callable<Void> callable = () -> {
			System.out.println(123);
			return null;
		};

		FutureTask<Void> futureTask = new FutureTask<>(callable);
		Thread thread1 = new Thread(futureTask);
		thread1.start();

		try {
			Thread.sleep(3000);
			Void aVoid = futureTask.get();
			System.out.println(aVoid);
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}

	}

	//Future 并发完成，统一处理
	public static void test83() {
		ExecutorService executorService = Executors.newCachedThreadPool();
		ExecutorCompletionService<Integer> completableFuture = new ExecutorCompletionService<>(executorService);
		for (int i = 1; i < 5; i++) {
			final int taskId = i;
			completableFuture.submit(new Callable<Integer>() {
				@Override
				public Integer call() throws Exception {
					Thread.sleep(Math.abs(4 - taskId) * 1000);
					return taskId;
				}
			});
		}

		for (int i = 1; i < 5; i++) {
			try {
				int result = completableFuture.take().get();
				System.out.println(result);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} catch (ExecutionException e) {
				e.printStackTrace();
			}
		}

	}

	//ThreadLocal
	public static void test105() {
		ThreadLocal<String> threadLocal = new ThreadLocal<>();
	}
	
	/**
	 * 测试 
	 */
	public static void test133(){

		while (true) {
			Scanner scanner = new Scanner(System.in);
			System.out.println(scanner.nextLine());
		}
	}
}
