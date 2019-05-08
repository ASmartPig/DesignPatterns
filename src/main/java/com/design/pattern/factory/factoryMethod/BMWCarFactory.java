package com.design.pattern.factory.factoryMethod;

import com.design.pattern.factory.BMWCar;
import com.design.pattern.factory.Car;

/**
 * @Author liaoze
 * @Description
 * @Author 2019/5/8 下午4:23
 **/
public class BMWCarFactory implements Carfactory {
    @Override
    public Car getCar() {
        return new BMWCar();
    }
}
