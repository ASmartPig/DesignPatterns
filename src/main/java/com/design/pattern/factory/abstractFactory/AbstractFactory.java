package com.design.pattern.factory.abstractFactory;

import com.design.pattern.factory.model.Car;
import com.design.pattern.factory.model.Tire;

/**
 * @Author liaoze
 * @Description
 * @Author 2019/5/8 下午5:16
 **/

/**
 * 创建抽象工厂
 */
public abstract class AbstractFactory {
    public abstract Car getCar(String carType);

    public abstract Tire getTire(String tireBrand);
}
