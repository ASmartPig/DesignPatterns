package com.design.pattern.singleton;

/**
 * @Author liaoze
 * @Description
 * 一般情况下，不建议使用懒汉方式，建议使用饿汉方式。只有在要明确实现 lazy loading 效果时，才会使用登记方式。
 * 如果涉及到反序列化创建对象时，可以尝试使用第 6 种枚举方式。如果有其他特殊的需求，可以考虑使用双检锁方式
 * @Author 2019/5/7 下午6:09
 **/
public class TestSingletonPattern {
    public static void main(String[] args) {

            SingletonPattern instance = SingletonPattern.getInstance();
            instance.showMessage();

    }
}
