package com.sanli;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Cydeo {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigApp.class);
          Java java =context.getBean(Java.class);
          java.getTeachingHour();

    }
}
