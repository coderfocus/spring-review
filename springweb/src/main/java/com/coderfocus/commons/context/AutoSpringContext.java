package com.coderfocus.commons.context;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class AutoSpringContext implements ApplicationContextAware, DisposableBean {

    private static ApplicationContext applicationContext = null;
    @Override
    public void destroy() throws Exception {
        this.applicationContext = null;
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    public static <T> T getBean(String beanId){
        return (T)applicationContext.getBean(beanId);
    }

}
