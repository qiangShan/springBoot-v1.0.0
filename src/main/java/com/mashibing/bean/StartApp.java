package com.mashibing.bean;

import com.mashibing.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StartApp {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        Object userService = applicationContext.getBean("userService", UserService.class);

    }
}
