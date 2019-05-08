package com.design.pattern.factory.factoryMethod;

import com.design.pattern.factory.model.Car;
import com.design.pattern.factory.model.PorscheCar;

/**
 * @Author liaoze
 * @Description
 * @Author 2019/5/8 下午4:24
 **/
public class PorscheCarFactory implements Carfactory {
    @Override
    public Car getCar() {
        return new PorscheCar();
    }
}
