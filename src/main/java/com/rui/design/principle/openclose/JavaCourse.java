package com.rui.design.principle.openclose;

/**
 * @创建人 wangrui
 * @创建时间 2019/10/21
 * @描述
 */
public class JavaCourse implements ICourse {

    private Integer id;
    private String name;
    private Double price;


    public JavaCourse(Integer id, String name, Double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public Integer getId() {
        return this.id;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Double getPrice() {
        return this.price;
    }

}
