package com.sanli;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DealerApp {
    public static void main(String[] args) {


        ApplicationContext container = new AnnotationConfigApplicationContext(ConfigCar.class);

        Car car = container.getBean(Car.class);

        Person person = container.getBean(Person.class);

        System.out.println("person.name = " + person.name);

        System.out.println("car.getMake() = " + car.getMake());

        System.out.println("person.getCar() = " + person.getCar().getMake());


    }
}
