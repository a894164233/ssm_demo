package com.ssm.test;

import com.ssm.entity.HelloWorld;
import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.Resource;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Objects;

public class TestHelloWorld {
    public static void main(String[] args) throws Exception {
        test19();
//        test20();
//        test40();
    }
    
    /**
     * 测试 
     */
    public static void test19(){
        ApplicationContext applicationContext = new FileSystemXmlApplicationContext("classpath:/Spring-mvc.xml");
        HelloWorld helloWorld = (HelloWorld) applicationContext.getBean("HelloWorld");
        System.out.println(helloWorld.getMsg().toString());
        System.out.println(helloWorld.getDate());
    }
    
    /**
     * 测试 bean method 1
     */
    public static void test20(){
        HelloWorld helloWorld = new HelloWorld();
        BeanWrapper beanWrapper = new BeanWrapperImpl(helloWorld);
        beanWrapper.setPropertyValue("msg", "test");
        System.out.println(beanWrapper.getPropertyValue("msg"));
    }

//    /**
//     * 测试 bean method 2
//     */
//    public static void test40() throws FileNotFoundException {
//        InputStream inputStream = new FileInputStream("E:\\1study\\learn_work\\ssm_demo\\src\\main\\resources\\Spring-mvc.xml");
//        XmlBeanFactory factory = new XmlBeanFactory(inputStream);
//        HelloWorld helloWorld = (HelloWorld) factory.getBean("HelloWorld");
//        System.out.println(helloWorld.getMsg() + helloWorld.getDate());
//    }
}