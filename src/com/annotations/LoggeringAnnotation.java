package com.annotations;


import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Documented
public @interface LoggeringAnnotation {
    String value() default "";
}
