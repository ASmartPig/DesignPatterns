package com.design.pattern.factory.abstractFactory;

import com.design.pattern.factory.model.*;
import org.springframework.util.StringUtils;

/**
 * @Author liaoze
 * @Description
 * @Author 2019/5/8 下午5:24
 **/

/**
 * 抽象工厂的扩展工厂类，基于给定的信息生成实体类的对象。
 */
public class TireFactory extends AbstractFactory {
    @Override
    public Car getCar(String carType) {
        return null;
    }

    @Override
    public Tire getTire(String tireBrand) {
        if (StringUtils.isEmpty(tireBrand)){
            return null;
        }else if(tireBrand.equals("Birdgestone")){
            return new BirdgestoneTires();
        }else if(tireBrand.equals("Michelin")){
            return new MichelinTire();
        }else if(tireBrand.equals("GermanHorse")){
            return new GermanHorseBrandTire();
        }
        return null;
    }
}
