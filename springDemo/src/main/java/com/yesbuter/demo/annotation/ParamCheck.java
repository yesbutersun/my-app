package com.yesbuter.demo.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface ParamCheck {
    String value() default "";

    int min() default 1;

    int max() default 255;

    int type() default 0;

    String level() default "info";
}
