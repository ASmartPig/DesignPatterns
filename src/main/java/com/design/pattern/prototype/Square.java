package com.design.pattern.prototype;

import ch.qos.logback.core.net.SyslogOutputStream;

/**
 * @Author liaoze
 * @Description
 * @Author 2019/5/17 下午4:19
 **/
public class Square extends Shape {

    public Square() {
        type = "Square";
    }

    @Override
    public void draw() {
        System.out.println("Inside Rectangle :: draw() method.");
    }




}
