package com.design.pattern.builder.abstractClass;

import com.design.pattern.builder.model.Wrapper;
import com.design.pattern.builder.interfaces.Item;
import com.design.pattern.builder.interfaces.Pack;

/**
 * @Author liaoze
 * @Description
 * @Author 2019/5/16 下午8:20
 **/
public abstract class Burger implements Item {

    @Override
    public Pack packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();

}
