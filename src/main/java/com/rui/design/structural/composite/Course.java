package com.rui.design.structural.composite;

/**
 * @创建人 wangrui
 * @创建时间 2019/10/31
 * @描述
 */
public class Course extends CatelogComponent {

    private String name;
    private double price;

    public Course(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName(CatelogComponent catelogComponent) {
        return this.name;
    }

    @Override
    public double getPrice(CatelogComponent catelogComponent) {
        return this.price;
    }

    @Override
    public void print() {
        System.out.println("Course Name:" + name + "Price" + price);
    }
}
