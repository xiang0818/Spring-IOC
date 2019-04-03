package com.empty.domain;

import java.beans.ConstructorProperties;


public class ExampleBean {

    // Fields omitted
    private int years;
    private String ultimateAnswer;

    @ConstructorProperties({"years", "ultimateAnswer"})
    public ExampleBean(int years, String ultimateAnswer) {
        this.years = years;
        this.ultimateAnswer = ultimateAnswer;
    }

    @Override
    public String toString() {
        return years+"："+ultimateAnswer;
    }
}