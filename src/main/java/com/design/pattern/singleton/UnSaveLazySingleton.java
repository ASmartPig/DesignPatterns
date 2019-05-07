package com.design.pattern.singleton;

/**
 * @Author liaoze
 * @Description
 * @Author 2019/5/7 下午6:16
 **/

/**
 *  懒汉式 线程不安全 单例模式
 *  是否lazy 初始化 ： yes
 *  这种实现最大的问题就是不支持多线程。因为没有加锁 synchronized，所以严格意义上它并不算单例模式。
 */
public class UnSaveLazySingleton {

    private static UnSaveLazySingleton instance;

    private UnSaveLazySingleton(){

    }


    public  static UnSaveLazySingleton getInstance(){
        if (null == instance){
            instance = new UnSaveLazySingleton();
        }
        return instance;
    }



}
