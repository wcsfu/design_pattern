package com.rui.design.principle.liskovsubsitution;

/**
 * @创建人 wangrui
 * @创建时间 2019/10/21
 * @描述
 */
public class Square implements Quadrangle {
    private long sideLength;


    @Override
    public long getWidth() {
        return this.sideLength;
    }

    @Override
    public long getLength() {
        return this.sideLength;
    }

    public void setSideLength(long sideLength) {
        this.sideLength = sideLength;
    }


    public long getSideLength() {
        return sideLength;
    }
}
