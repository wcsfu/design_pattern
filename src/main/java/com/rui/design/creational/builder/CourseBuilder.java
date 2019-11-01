package com.rui.design.creational.builder;

/**
 * @创建人 wangrui
 * @创建时间 2019/10/22
 * @描述  被创建对象的内部细节
 */
public abstract class CourseBuilder {


    public abstract void buildCourseName(String courseName);

    public abstract void buildCoursePPT(String coursePPT);

    public abstract void buildVideo(String courseVideo);

    public abstract void buildCourseArticle(String courseArticle);

    public abstract void buildCourseQA(String courseQA);


    //创建对象
    public abstract Course makeCourse();


}
