package com.empty.domain;

public class body {



    private String hand;

    private String sex;

    public String getHand() {
        return hand;
    }

    public String getSex() {
        return sex;
    }

    public void setHand(String hand) {
        this.hand = hand;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void sel(){


        System.out.println("hand:"+hand+"--sex"+sex);
    }
}
