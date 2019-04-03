package com.IOStream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @program: Spring-IOC
 * @description: 留
 * @author: Mr.Luo
 * @create: 2019-03-29 17:13
 **/
public class Streamss {


    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Hollis", "HollisChuang", "hollis", "Hello", "HelloWorld", "Hollis");
        Stream<String> stream = strings.stream();


        System.out.println("1");
    }
}
