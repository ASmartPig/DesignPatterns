package com.design.pattern.factory.model;

/**
 * @Author liaoze
 * @Description
 * @Author 2019/5/8 下午5:04
 **/
public class MichelinTire implements Tire {
    @Override
    public void loadTires() {
        System.out.println("I put on Michelin tires");
    }
}
