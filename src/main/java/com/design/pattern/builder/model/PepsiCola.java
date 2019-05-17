package com.design.pattern.builder.model;

import com.design.pattern.builder.abstractClass.ColdDrink;

/**
 * @Author liaoze
 * @Description
 * @Author 2019/5/17 上午10:05
 **/
public class PepsiCola extends ColdDrink {
    @Override
    public String name() {
        return "pepsi-cola";
    }

    @Override
    public float price() {
        return 2.5f;
    }
}
