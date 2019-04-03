package com.empty.domain;
 
public class IntrduceDemo {
    //姓名
    private String name;
    //年龄
    private  int  age;
    private body body;
 
    public int getAge() {
        return age;
    }
 
    public void setAge(int age) {
        this.age = age;
    }
 
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }

    public com.empty.domain.body getBody() {
        return body;
    }

    public void setBody(com.empty.domain.body body) {
        this.body = body;
    }

    /**
     * 自我介绍
     */
    public void intrduce(){
        System.out.println("您好，我叫"+this.name+"今年"+this.age+"岁！");
    }
 
}
