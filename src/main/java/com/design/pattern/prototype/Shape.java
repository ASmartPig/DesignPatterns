package com.design.pattern.prototype;

/**
 * @Author liaoze
 * @Description
 * @Author 2019/5/17 下午3:50
 **/
public abstract class Shape  implements  Cloneable{

    private String id;

    protected String type;

    abstract void draw();

    public String getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public Object clone(){
        Object clone = null;
        try{
            clone = super.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }

        return clone;
    }
}
