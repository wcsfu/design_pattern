package com.rui.design.creational.abstractfactory;

/**
 * @创建人 wangrui
 * @创建时间 2019/10/22
 * @描述
 */
public class JavaCourseFactory implements CourseFactory {

    @Override
    public Video getVideo() {
        return new JavaVideo();
    }

    @Override
    public Article getArticle() {
        return new JavaArticle();
    }
}
