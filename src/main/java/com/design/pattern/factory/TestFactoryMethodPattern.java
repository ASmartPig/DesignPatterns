package com.design.pattern.factory;

import com.design.pattern.factory.factoryMethod.AuditCarFactory;
import com.design.pattern.factory.factoryMethod.BMWCarFactory;
import com.design.pattern.factory.factoryMethod.Carfactory;
import com.design.pattern.factory.factoryMethod.PorscheCarFactory;

/**
 * @Author liaoze
 * @Description
 * @Author 2019/5/8 下午4:28
 **/
public class TestFactoryMethodPattern {
    public static void main(String[] args) {
        Carfactory carfactory = new AuditCarFactory();
        Car car = carfactory.getCar();
        car.showName();

        Carfactory carfactory1 = new BMWCarFactory();
        Car car1 = carfactory1.getCar();
        car1.showName();

        Carfactory carfactory2 = new PorscheCarFactory();
        Car car2= carfactory2.getCar();
        car2.showName();
    }
}
