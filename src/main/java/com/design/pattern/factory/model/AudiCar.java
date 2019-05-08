package com.design.pattern.factory.model;

/**
 * @Author liaoze
 * @Description
 * @Author 2019/5/8 下午2:46
 **/
public class AudiCar implements Car {

    @Override
    public void showName() {
        System.out.println("I am audit Car , I am full of technology");
    }
}
