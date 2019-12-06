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

    @Test
    public void testAssert() {
        String obj1 = "junit";
        String obj2 = "junit";
        String obj3 = "test";
        String obj4 = "test";
        String obj5 = null;
        int var1 = 1;
        int var2 = 2;
        int var3 = 1;
        int[] arithmetic1 = {1, 2, 3};
        int[] arithmetic2 = {1, 2, 3};

        //断言值相等
        Assert.assertEquals(obj1, obj2);

        //断言两个对象引用相同的对象
        Assert.assertSame(obj3, obj4);

        //断言，两个对象不是引用同一个对象
        Assert.assertNotSame(obj2, obj4);

        //断言一个对象不为空(null)
        Assert.assertNotNull(obj1);

        //断言一个对象为空(null)
        Assert.assertNull(obj5);

        //断言一个条件为假
        Assert.assertFalse("为假", var1 == var2);

        //断言一个条件为真
        Assert.assertTrue("为真", var1 == var3);

        //断言预期数组和结果数组相等
        Assert.assertArrayEquals(arithmetic1, arithmetic2);
    }
}
