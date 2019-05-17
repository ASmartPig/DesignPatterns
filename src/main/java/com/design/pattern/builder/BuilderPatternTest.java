package com.design.pattern.builder;

import com.design.pattern.builder.model.Meal;

/**
 * @Author liaoze
 * @Description
 * @Author 2019/5/17 上午11:21
 **/
public class BuilderPatternTest {

    public static void main(String[] args) {
        Mealbuilder mealbuilder = new Mealbuilder();
        //选择蔬菜套餐创建
       Meal meal =  mealbuilder.prepareMealChickMeal();
       meal.showItems();
       meal.showCost();

        System.out.println("----------------------------");
       //选择鸡肉套餐
        Meal chickMeal = mealbuilder.prepareMealVegMeal();
        chickMeal.showItems();
        chickMeal.showCost();
    }
}
