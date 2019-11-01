package com.rui.design.creational.abstractfactory;

/**
 * @创建人 wangrui
 * @创建时间 2019/10/22
 * @描述
 */
public class JavaArticle extends Article {
    @Override
    public void produce() {
        System.out.println("编写Java课程手记");
    }
}
