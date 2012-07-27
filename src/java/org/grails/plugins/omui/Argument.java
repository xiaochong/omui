package org.grails.plugins.omui;


import java.lang.annotation.ElementType;

@java.lang.annotation.Target({ElementType.FIELD})
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
@java.lang.annotation.Documented
public @interface Argument {
    String[] value();
}
