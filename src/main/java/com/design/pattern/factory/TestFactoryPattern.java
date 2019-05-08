package com.design.pattern.factory;

/**
 * @Author liaoze
 * @Description
 * @Author 2019/5/8 下午3:10
 **/
public class TestFactoryPattern {
    public static void main(String[] args) {
        CarFactory carFactory = new CarFactory();

        Car car = carFactory.getCar("Audi");
        car.showName();

        Car car1 = carFactory.getCar("BMW");
        car1.showName();

        Car car2 = carFactory.getCar("Porsche");
        car2.showName();

    }
}
