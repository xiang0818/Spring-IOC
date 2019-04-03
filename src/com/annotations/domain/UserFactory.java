package com.annotations.domain;

import com.annotations.LoggeringAnnotation;
import com.sun.org.apache.xml.internal.security.Init;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;


/**
 * UserFactory.java
 * 
 * @author
 */

public class UserFactory{


    public   User user;

    public   User create()
    {

        user=new User();

        // 获取User类中所有的方法（getDeclaredMethods也行）
        //getDeclaredMethods(),该方法是获取本类中的所有方法，包括私有的(private、protected、默认以及public)的方法
        //getMethods()  获取所有的public方法
        Method[] methods = User.class.getMethods();
        try
        {
            for (Method method : methods)
            {
                // 如果此方法有注解，就把注解里面的数据赋值到user对象
                if (method.isAnnotationPresent(LoggeringAnnotation.class))
                {
                    LoggeringAnnotation init = method.getAnnotation(LoggeringAnnotation.class);
                    method.invoke(user, init.value());
                }
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
            return null;
        }

        return user;
    }
}