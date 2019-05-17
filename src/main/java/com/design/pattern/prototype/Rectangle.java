package com.design.pattern.prototype;

/**
 * @Author liaoze
 * @Description
 * @Author 2019/5/17 下午4:10
 **/
public class Rectangle extends Shape {

    public Rectangle(){
        type = "Rectangle";
    }

    @Override
    void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
