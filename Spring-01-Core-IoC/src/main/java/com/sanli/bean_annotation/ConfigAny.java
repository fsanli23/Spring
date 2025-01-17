package com.sanli.bean_annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigAny {
    @Bean
    String str(){
        return "Developer";
    }

    @Bean(name="number")
    Integer number(){
        return 100;
    }

    @Bean(name = "number01")
    Integer number01(){
        return 101;
    }

}
