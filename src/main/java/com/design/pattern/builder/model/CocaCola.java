package com.design.pattern.builder.model;

import com.design.pattern.builder.abstractClass.ColdDrink;

/**
 * @Author liaoze
 * @Description
 * @Author 2019/5/17 上午10:03
 **/
public class CocaCola extends ColdDrink {
    @Override
    public String name() {
        return "coca-cola";
    }

    @Override
    public float price() {
        return 3.0f;
    }
}
