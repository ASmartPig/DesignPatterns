package com.design.pattern.factory;

import com.design.pattern.factory.Car;

/**
 * @Author liaoze
 * @Description
 * @Author 2019/5/8 下午2:47
 **/
public class PorscheCar implements Car {

    @Override
    public void showName() {
        System.out.println("I am porsche");
    }
}
