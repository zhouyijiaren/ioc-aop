package com.mySpring.aop;

import java.lang.annotation.*;

/**
 * Created by 10033 on 2017/5/12.
 */
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
public @interface PointCut {
    String value();
}