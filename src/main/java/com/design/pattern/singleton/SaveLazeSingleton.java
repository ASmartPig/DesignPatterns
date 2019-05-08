package com.design.pattern.singleton;

/**
 * @Author liaoze
 * @Description  描述：这种方式具备很好的 lazy loading，能够在多线程中很好的工作，但是，效率很低，99% 情况下不需要同步。
 * @Time 2019/5/7 下午7:25
 **/

/**
 *  线程安全 懒汉式  单例模式
 *  是否lazy 初始化 ：是
 *  advantage :
 *      第一次调用才初始化，避免内存浪费
 *  disadvantage:
 *      必须加锁佳能保证单例，但加锁会影响效率
 */
public class SaveLazeSingleton {

    private static SaveLazeSingleton instance;

    private SaveLazeSingleton(){
    }


    public static synchronized SaveLazeSingleton getInstance(){
        if (null == instance){
            instance = new SaveLazeSingleton();
        }
        return instance;
    }

    public void showMessage(){
        System.out.println("I am the only instance of SaveLazeSingleton pattern");
    }


}
