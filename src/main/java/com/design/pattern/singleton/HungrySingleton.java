package com.design.pattern.singleton;

/**
 * @Author liaoze
 * @Description
 * @Time 2019/5/7 下午7:45
 **/

/**
 * 饿汉式 单例模式
 * 是否lazy loading : no
 * 线程安全
 * 这种方式比较常用，但容易产生辣鸡对象
 *  advantage : 没有加锁，执行效率高
 *  disadvantage : 类加载时就初始化，浪费内存
 *  它基于 classloader 机制避免了多线程的同步问题，不过，instance 在类装载时就实例化，虽然导致类装载的原因有很多种，在单例模式中大多数都是调用 getInstance 方法，
 *  但是也不能确定有其他的方式（或者其他的静态方法）导致类装载，这时候初始化 instance 显然没有达到 lazy loading 的效果
 */
public class HungrySingleton {

    private static HungrySingleton instance = new HungrySingleton();

    private HungrySingleton(){

    }

    public static HungrySingleton getInstance(){
        return instance;
    }

    public void showMessage(){
        System.out.println("I am the only instance of the HungrySingleton pattern");
    }
}
