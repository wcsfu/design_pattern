package com.rui.design.principle.liskovsubsitution;

/**
 * @创建人 wangrui
 * @创建时间 2019/10/21
 * @描述
 */
public class Rectangle  implements Quadrangle{

    private long length;
    private long width;

    @Override
    public long getWidth() {
        return this.width;
    }

    @Override
    public long getLength() {
        return this.length;
    }

    public void setLength(long length) {
        this.length = length;
    }

    public void setWidth(long width) {
        this.width = width;
    }
}
