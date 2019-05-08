package com.design.pattern.singleton;

/**
 * @Author liaoze
 * @Description
 * @Author 2019/5/7 下午5:34
 **/

/**
 *  单例模式简介:
 *     1、单例类只有一个实例
 *     2、单例类必须自己创建自己唯一实例
 *     3、单例类必须提供给其他对象获取自己唯一实例的接口
 *
 *   advantage:
 *     1、在内存中只有一个实例,减少了内存的开销，尤其是频繁的创建和销毁实例
 *     2、避免对资源的多重占用（比如文件操作，打印机）
 *
 *   disadvantage:
 *     1、没有接口，不能继承，与单一职责原则冲突，一个类应该只关心内部逻辑，而不关心外面怎么去实例化
 */
public class SingletonPattern {

    private static SingletonPattern singleton = new SingletonPattern();

    /**
     * 构造函数私有化，避免创建实例
     */
    private SingletonPattern(){

    }

    /**
     *  获取唯一实例
     */
    public static SingletonPattern getInstance(){
        return singleton;
    }

    public void showMessage(){
        System.out.println("I am the only instance of the singletonPattern pattern");
    }

}
