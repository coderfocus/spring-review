package com.coderfocus.service.test;

import com.coderfocus.service.UserService;
import org.junit.*;
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

    //在测试类的所有测试之前执行一次，一般是测试计算共享配置方法(如连接到数据库)
    @BeforeClass
    public static void beforeClass(){
        System.out.println("beforeClass");
    }

    //禁用此测试方法
    @Ignore
    @Test
    public void ignore(){
        System.out.println("ignore");
    }
}
