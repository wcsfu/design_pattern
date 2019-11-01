package com.rui.design.behavioral.templatemethod;

/**
 * @创建人 wangrui
 * @创建时间 2019/11/1
 * @描述
 */
public class DesignPatternCourse extends ACourse {

    @Override
    void packageCourse() {
        System.out.println("提供课程Java源代码");
    }

    @Override
    protected boolean needWriteArticle() {
        return true;
    }
}
