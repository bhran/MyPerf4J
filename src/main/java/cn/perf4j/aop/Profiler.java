package cn.perf4j.aop;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by LinShunkang on 2018/3/11
 */

/**
 * 该注解可以作用于类上也可以作用于具体接口上；
 * 作用于类上，则对该类的所有接口都起作用；
 * 作用于接口上，则只针对该接口起作用，其余接口不起作用！
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.TYPE})
public @interface Profiler {

    int mostTimeThreshold() default 50;

    int outThresholdCount() default 50;

}