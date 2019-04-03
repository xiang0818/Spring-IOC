package com.beanpostprocessors;

import org.springframework.beans.factory.config.BeanPostProcessor;



public class InstantiationTracingBeanPostProcessor  implements BeanPostProcessor {

    // simply return the instantiated bean as-is
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) {
        return bean; // we could potentially return any object reference here...
    }


    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) {

       return bean;
    }
}