package com.zaurtregulov.spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext3.xml");

        Dog dog1 = context.getBean("dog", Dog.class);
        dog1.say();



//        Dog dog2 = context.getBean("dog", Dog.class);
//
//        System.out.println("Variable are equal? "+ dog1.equals(dog2));
//        System.out.println(dog1);
//        System.out.println(dog2);



        context.close();
    }
}
