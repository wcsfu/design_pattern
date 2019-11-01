package com.rui.design.structural.composite;

/**
 * @创建人 wangrui
 * @创建时间 2019/10/31
 * @描述
 */
public abstract class CatelogComponent {

    public void add(CatelogComponent catelogComponent) {
        throw new UnsupportedOperationException("不支持添加操作");
    }


    public void remove(CatelogComponent catelogComponent) {
        throw new UnsupportedOperationException("不支持删除操作");
    }


    public String getName(CatelogComponent catelogComponent) {
        throw new UnsupportedOperationException("不支持获取名称操作");
    }

    public double getPrice(CatelogComponent catelogComponent) {
        throw new UnsupportedOperationException("不支持获取价格操作");
    }

    public void print() {
        throw new UnsupportedOperationException("不支持打印操作");
    }
}
