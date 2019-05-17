package com.design.pattern.builder;

import com.design.pattern.builder.model.*;

/**
 * @Author liaoze
 * @Description 建造者模式（Builder Pattern）使用多个简单的对象一步一步构建成一个复杂的对象。这种类型的设计模式属于创建型模式，它提供了一种创建对象的最佳方式。
 *              一个 Builder 类会一步一步构造最终的对象。该 Builder 类是独立于其他对象的。
 * @Author 2019/5/17 上午11:11
 **/

/**
 * 应用实例： 1、去肯德基，汉堡、可乐、薯条、炸鸡翅等是不变的，而其组合是经常变化的，生成出所谓的"套餐"。 2、JAVA 中的 StringBuilder。
 *
 * 优点： 1、建造者独立，易扩展。 2、便于控制细节风险。
 *
 * 缺点： 1、产品必须有共同点，范围有限制。 2、如内部变化复杂，会有很多的建造类。
 */
public class Mealbuilder {

    public Meal prepareMealVegMeal(){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new CocaCola());
        return meal;
    }

    public Meal prepareMealChickMeal(){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new PepsiCola());
        return meal;
    }
}
