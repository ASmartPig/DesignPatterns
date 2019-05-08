package com.design.pattern.factory.abstractFactory;

import com.design.pattern.factory.model.*;
import org.springframework.util.StringUtils;

/**
 * @Author liaoze
 * @Description
 * @Author 2019/5/8 下午5:19
 **/

/**
 * 抽象工厂的扩展工厂类，基于给定的信息生成实体类的对象。
 */
public class CarFactory extends AbstractFactory {

    @Override
    public Car getCar(String carType) {
        if (StringUtils.isEmpty(carType)){
            return null;
        }else if(carType.equals("Audi")){
            return new AudiCar();
        }else if(carType.equals("BMW")){
            return new BMWCar();
        }else if(carType.equals("Porsche")){
            return new PorscheCar();
        }
        return null;
    }


    @Override
    public Tire getTire(String tireBrand) {
        return null;
    }
}
