package com.design.pattern.builder.model;

import com.design.pattern.builder.abstractClass.Burger;

/**
 * @Author liaoze
 * @Description
 * @Author 2019/5/17 上午9:45
 **/
public class ChickenBurger extends Burger {
    @Override
    public String name() {
        return "chicken Burger";
    }

    @Override
    public float price() {
        return 7.0f;
    }
}
