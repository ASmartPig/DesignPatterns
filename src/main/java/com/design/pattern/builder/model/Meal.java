package com.design.pattern.builder.model;

import com.design.pattern.builder.interfaces.Item;
import com.google.common.collect.Lists;

import java.util.List;

/**
 * @Author liaoze
 * @Description
 * @Author 2019/5/17 上午10:37
 **/
public class Meal {
    private List<Item> items = Lists.newArrayList();

    public void addItem(Item item){
        items.add(item);
    }

    public void showCost(){
        float cost =0.0f;
        for (Item item : items){
            cost += item.price();
        }
        System.out.println( "套餐总共："+cost +"元");
    }

    public float getCost(){
        float cost =0.0f;
        for (Item item : items){
            cost += item.price();
        }
        return cost;
    }

    public void showItems(){
        for (Item item :items){
            System.out.println("Item :"+item.name());
            System.out.println("pack method :"+item.packing().packing());
            System.out.println("price :"+item.price());
        }
    }



}
