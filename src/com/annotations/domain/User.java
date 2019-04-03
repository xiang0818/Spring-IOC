package com.annotations.domain;

import com.annotations.LoggeringAnnotation;

public class User {


    public  String name;
    public  String id;
    public  String age;


    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getAge() {
        return age;
    }

    @LoggeringAnnotation(value = "我叫测试!")
    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
