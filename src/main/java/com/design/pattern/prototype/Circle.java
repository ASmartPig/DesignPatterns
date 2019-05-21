package com.design.pattern.prototype;

/**
 * @Author liaoze
 * @Description
 * @Author 2019/5/21 下午2:04
 **/
public class Circle extends Shape {

    public Circle() {
        type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Circle :: draw() method.");
    }

}
