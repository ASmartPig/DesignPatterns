package com.design.pattern.factory.abstractFactory;

import com.design.pattern.factory.Car;

/**
 * @Author liaoze
 * @Description
 * @Author 2019/5/8 下午2:46
 **/
public class BMWCar implements Car {
    @Override
    public void showName() {
        System.out.println("I am BMW car ");
    }
}