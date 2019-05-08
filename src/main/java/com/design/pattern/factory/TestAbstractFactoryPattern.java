package com.design.pattern.factory;

import com.design.pattern.factory.abstractFactory.AbstractFactory;
import com.design.pattern.factory.abstractFactory.FactoryProducer;
import com.design.pattern.factory.model.Car;
import com.design.pattern.factory.model.Tire;

/**
 * @Author liaoze
 * @Description
 * @Author 2019/5/8 下午5:39
 **/
public class TestAbstractFactoryPattern {
    public static void main(String[] args) {

        AbstractFactory carFactory = FactoryProducer.getFactory("Car");

        Car car = carFactory.getCar("Audi");
        car.showName();

        Car car1 = carFactory.getCar("BMW");
        car1.showName();

        Car car2 = carFactory.getCar("Porsche");
        car2.showName();


        AbstractFactory TireFactory = FactoryProducer.getFactory("Tire");

        Tire tire = TireFactory.getTire("Birdgestone");
        tire.loadTires();

        Tire tire1 = TireFactory.getTire("Michelin");
        tire1.loadTires();


        Tire tire2 = TireFactory.getTire("GermanHorse");
        tire2.loadTires();

    }


}
