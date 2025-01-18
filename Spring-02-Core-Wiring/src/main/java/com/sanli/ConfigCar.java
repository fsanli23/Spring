package com.sanli;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigCar {

   @Bean
    Car car() {
        Car car = new Car();
        car.setMake("Honda");
        return car;
    }

//    @Bean
//    Person person() {
//        Person person = new Person();
//        person.setName("Fatih");
//        person.setCar(car());
//        return person;
//    }

    @Bean
    Person person(Car car) {
       Person person = new Person();
       person.setName("Fatih");
       person.setCar(car);
       return person;
    }





}
