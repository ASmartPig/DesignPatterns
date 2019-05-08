package com.design.pattern.factory.abstractFactory;

/**
 * @Author liaoze
 * @Description
 * @Author 2019/5/8 下午5:28
 **/

/**
 * 工厂创造器/生成器类
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String choice){
        if (choice.equalsIgnoreCase("Car")){
            return new CarFactory();
        }else if (choice.equalsIgnoreCase("Tire")){
            return new TireFactory();
        }
        return null;
    }
}
