package com.design.pattern.singleton;

/**
 * @Author liaoze
 * @Description
 * @Author 2019/5/8 上午11:06
 **/

/**
 * 双重校验锁 （DCL,即double-checked locking）
 * 这种方式采用双锁机制，安全且在多线程情况下能保持高性能。
 * 是否 Lazy 初始化：yes
 * 是否多线程安全：yes
 */
public class DoubleCheckLockSingleton {

    private volatile static DoubleCheckLockSingleton instance;

    private DoubleCheckLockSingleton(){

    }

    private static DoubleCheckLockSingleton getInstance(){
        if (null == instance){
            synchronized (DoubleCheckLockSingleton.class){
                if (null == instance){
                    instance = new DoubleCheckLockSingleton();
                }
            }
        }
        return  instance;
    }

    public void  showMessage(){
        System.out.println("I am the only instance of the DoubleCheckLockSingleton pattern ");
    }
}
