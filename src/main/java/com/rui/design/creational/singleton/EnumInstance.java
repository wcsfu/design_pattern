package com.rui.design.creational.singleton;

/**
 * @创建人 wangrui
 * @创建时间 2019/10/27
 * @描述
 */
public enum EnumInstance {
    INSTANCE;

    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static EnumInstance getInstance(){
        return INSTANCE;
    }
}
