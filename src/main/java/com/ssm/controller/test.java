package com.ssm.controller;

public class test {
    public static void main(String[] args) {
        test10();
    }

    public static void test10(){
        System.out.println(123);
        Thread thread = new Thread(() -> System.out.println(123));

    }

}
