package com.design.pattern.singleton;

/**
 * @Author liaoze
 * @Description
 * @Author 2019/5/7 下午6:09
 **/
public class TestSingletonPattern {
    public static void main(String[] args) {

            SingletonPattern instance = SingletonPattern.getInstance();
            instance.showMessage();

    }
}
