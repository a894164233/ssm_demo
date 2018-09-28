package com.ssm.test;

import com.ssm.entity.HelloWorld;
import com.ssm.impl.TimeBookInterface;
import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

public class TestHelloWorld {
    public static void main(String[] args) throws Exception {
        test19();
//        test20();
//        test40();
    }
    
    /**
     * 测试 
     */
    public static void test19() throws IOException {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:/Spring-mvc.xml");
        //bean 的管理
//        HelloWorld helloWorld = (HelloWorld) applicationContext.getBean("HelloWorld");
//        System.out.println(helloWorld.getMsg().toString());
//        System.out.println(helloWorld.getDate());
//        helloWorld.getList().forEach(System.out::println);
//        helloWorld.getSet().forEach(System.out::println);
//        helloWorld.getMap().forEach((k,v) -> System.out.println(k + v));
//        helloWorld.getProperties().forEach((k,v) -> System.out.println(k + v.toString()));

        //国际化 test
//        System.out.println(Calendar.getInstance().getTime().toString());
//        Object[] objects = new Object[]{"jdbc.password", Calendar.getInstance().getTime()};
//        String password = applicationContext.getMessage("jdbc.password", objects, Locale.CHINA);
//        System.out.println(password);

        //应用上下文 资源管理
//        Resource resource = applicationContext.getResource("classpath:/messages.properties");
//        System.out.println(resource.getURL().toString());
//        System.out.println("" + resource.exists() + resource.isOpen() + resource.getURL());

        //事件传递
//        Log log = (Log) applicationContext.getBean("log");
//        log.log("test");
//        log.log("test2");

        //日志
//        TimeBook timeBook = new TimeBook();
//        timeBook.doAuditing("小明");
        //代理日志
//        TimeBookProxy timeBookProxy = new TimeBookProxy(new TimeBook());
//        timeBookProxy.doAuditing("小明");
        // Java 动态代理 日志
//        LogProxy logProxy = new LogProxy();
//        TimeBookInterface timeBookInterface = (TimeBookInterface) logProxy.bind(new TimeBook());
//        timeBookInterface.doAuditing("张三");
//        System.out.println(timeBookInterface.getClass().getName());

//        Pointcut pointcut;
//        AbstractRegexpMethodPointcut  abstractRegexpMethodPointcut;

//        LogInterceptor logInterceptor = new LogInterceptor();

        //spring 两种代理 1. java 代理，代理的是接口 2.cglib 代理的是类（proxyTargetClass=true）
        TimeBookInterface timeBookInterface = (TimeBookInterface) applicationContext.getBean("timeBook");
        System.out.println(timeBookInterface.getClass().getName());
        timeBookInterface.doAuditing("xiao ming");

    }
    
    /**
     * 测试 bean method 1
     */
    public static void test20() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Object obj = Class.forName("com.ssm.entity.HelloWorld").newInstance();
        BeanWrapper beanWrapper = new BeanWrapperImpl(obj);
        beanWrapper.setPropertyValue("msg", "test");
        beanWrapper.setPropertyValue("date", new Date());
        System.out.println(beanWrapper.getPropertyValue("msg"));
        System.out.println(beanWrapper.getPropertyValue("date"));
    }

    /**
     * 测试 bean method 2
     */
    public static void test40() throws FileNotFoundException {
        ApplicationContext applicationContext= new ClassPathXmlApplicationContext("classpath:/Spring-mvc.xml");
//        HelloWorld helloWorld = (HelloWorld) applicationContext.getBean("HelloWorld", String.class);
//        System.out.println(helloWorld.getMsg() + helloWorld.getDate());
    }
}