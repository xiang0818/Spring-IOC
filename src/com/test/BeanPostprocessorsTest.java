package com.test;

import com.beanpostprocessors.InstantiationTracingBeanPostProcessor;
import com.beanpostprocessors.TestVOS;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericGroovyApplicationContext;

import java.util.HashMap;

public class BeanPostprocessorsTest {


    public static void main(String[] args) {
//        InstantiationTracingBeanPostProcessor

        ApplicationContext ctx = new AnnotationConfigApplicationContext( InstantiationTracingBeanPostProcessor.class,TestVOS.class);

         HashMap hashMap = new HashMap<>();
//       ctx.getBean(TestVOS.class);

        String a=null;
        String b=a;

        System.out.println(a==b);
        a="1";
        System.out.println(a==b);


    }

}

