package com.sanli.bean_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CydeoApp {
    public static void main(String[] args) {

        ApplicationContext container = new AnnotationConfigApplicationContext(ConfigApp.class, ConfigAny.class);

        FullTimeMentor ft = container.getBean(FullTimeMentor.class);
        FullTimeMentor f2 = container.getBean(FullTimeMentor.class);

        String str = container.getBean(String.class);
        Integer number = container.getBean(Integer.class);

        System.out.println("str = " + str);
        System.out.println("number = " + number);


        System.out.println(ft);
        System.out.println(f2);
        System.out.println(f2==ft);

        f2.createAccount();

    }
}
