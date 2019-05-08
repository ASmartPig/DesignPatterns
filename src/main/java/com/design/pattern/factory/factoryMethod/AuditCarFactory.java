package com.design.pattern.factory.factoryMethod;

import com.design.pattern.factory.model.AudiCar;
import com.design.pattern.factory.model.Car;

/**
 * @Author liaoze
 * @Description
 * @Author 2019/5/8 下午4:22
 **/
public class AuditCarFactory implements Carfactory {
    @Override
    public Car getCar() {
        return new AudiCar();
    }
}
