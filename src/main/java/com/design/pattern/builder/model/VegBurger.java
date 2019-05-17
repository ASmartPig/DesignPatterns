package com.design.pattern.builder.model;

import com.design.pattern.builder.abstractClass.Burger;

/**
 * @Author liaoze
 * @Description
 * @Author 2019/5/16 下午8:41
 **/
public class VegBurger extends Burger {
    @Override
    public String name() {
        return "veg Burger";
    }

    @Override
    public float price() {
        return 12.0f;
    }
}
