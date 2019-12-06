package com.coderfocus.service.test;

import com.coderfocus.service.UserService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserServiceTest {

    private UserService userService;


    //每个Test方法执行之前都会执行一次Before方法
    @Before
    public void before(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-context.xml");
        userService = (UserService)applicationContext.getBean("userService");
        System.out.println("before");
    }

    //每个Test方法执行之后都会执行一次After方法
    @After
    public void after(){
        System.out.println("after");
    }

    @Test
    public void sayHi(){
        userService.sayaHi();
    }

    @Test
    public void sayHello(){
        System.out.println("hello junit");
    }
}
