package com.sanli.bean_annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ConfigAny {
    @Bean
    String str() {
        return "Developer";
    }

    @Bean
    Integer number01l() {
        return 101;
    }


    @Primary
    @Bean
    Integer number() {
        return 100;
    }


}
