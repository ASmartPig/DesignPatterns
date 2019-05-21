package com.design.pattern.prototype;

import java.util.Hashtable;

/**
 * @Author liaoze
 * @Description
 * @Author 2019/5/21 下午2:10
 **/
public class ShapeCache {
    private static Hashtable<String, Shape> shapeMap = new Hashtable<String, Shape>();

    public static Shape getShape(String shapeId) {
        Shape cacheShape = shapeMap.get(shapeId);
        return (Shape) cacheShape.clone();
    }


    /**
     * 假设创建原型实践很长，类似与读配置或者从数据库中读取信息创建。
     */
    public static void loadCache(){
        System.out.println("start");
        Circle circle = new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(),circle);

        Square square = new Square();
        square.setId("2");
        shapeMap.put(square.getId(),square);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("3");
        shapeMap.put(rectangle.getId(),rectangle);
    }
}