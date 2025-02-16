package com.annotation;

import com.reflection.basiclevel.Person;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Type;
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface TaskInfo {
    int priority();
     String assignedTo();
}
