package com.annotations.domain;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Appconfig {



    @Bean(name="UserFactory")
    public UserFactory getUserFactory(){

        return new UserFactory();
    }

}
