package com.design.pattern.builder.abstractClass;

import com.design.pattern.builder.model.Bottle;
import com.design.pattern.builder.interfaces.Item;
import com.design.pattern.builder.interfaces.Pack;

/**
 * @Author liaoze
 * @Description
 * @Author 2019/5/16 下午8:24
 **/
public abstract class ColdDrink implements Item {

    @Override
    public Pack packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
