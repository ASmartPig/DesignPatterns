package com.design.pattern.builder.model;

import com.design.pattern.builder.interfaces.Pack;

/**
 * @Author liaoze
 * @Description
 * @Author 2019/5/16 下午8:05
 **/
public class Bottle implements Pack {

    @Override
    public String packing() {
        return "Bottle";
    }
}
