package com.empty.domain;

import com.spring.implinterface.Iserivces;
import com.spring.implinterface.ServiceLocator;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.Map;

public class test {

    public static <sysout> void main(String[] args) {
        //创建Spring上下文（加载bean.xml）
        ApplicationContext acx= new ClassPathXmlApplicationContext("beans.xml");
        //获取HelloWorld实例
        IntrduceDemo id=acx.getBean("IntrduceDemo",IntrduceDemo.class);

        ServiceLocator  interfaces=acx.getBean("interfaces", ServiceLocator .class);
        interfaces.setApplicationContext(acx);
        Map<String, Iserivces> map = interfaces.getMap();

        ExampleBean exampleBean = acx.getBean("ExampleBean", ExampleBean.class);

        System.out.println(exampleBean.toString());
        //调用方法
        id.intrduce();
        body body = id.getBody();
        body.sel();



    }


}
