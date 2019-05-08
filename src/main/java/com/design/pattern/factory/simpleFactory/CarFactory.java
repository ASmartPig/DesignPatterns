package com.design.pattern.factory.simpleFactory;

import com.design.pattern.factory.AudiCar;
import com.design.pattern.factory.Car;
import com.design.pattern.factory.PorscheCar;
import com.design.pattern.factory.BMWCar;
import org.springframework.util.StringUtils;

/**
 * @Author liaoze
 * @Description
 * @Author 2019/5/8 下午2:54
 **/
public class CarFactory {

    public Car getCar(String type){
        if (StringUtils.isEmpty(type)){
            return null;
        }else if(type.equals("Audi")){
            return new AudiCar();
        }else if(type.equals("BMW")){
            return new BMWCar();
        }else if(type.equals("Porsche")){
            return new PorscheCar();
        }
        return null;
    }
}
