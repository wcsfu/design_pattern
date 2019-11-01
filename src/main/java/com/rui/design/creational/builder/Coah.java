package com.rui.design.creational.builder;

/**
 * @创建人 wangrui
 * @创建时间 2019/10/22
 * @描述
 */
public class Coah {

    private CourseBuilder courseBuilder;

    // 设置建造者
    public void setCourseBuilder(CourseBuilder courseBuilder) {
        this.courseBuilder = courseBuilder;
    }

    public Course makeCourse(String courseName,String coursePPT,String courseVideo,String courseArticle,String courseQA){
        // 设置被建造对象的各个属性
        this.courseBuilder.buildCourseName(courseName);
        this.courseBuilder.buildCourseArticle(courseArticle);
        this.courseBuilder.buildCoursePPT(coursePPT);
        this.courseBuilder.buildVideo(courseVideo);
        this.courseBuilder.buildCourseQA(courseQA);
        //返回被建造的对象
        return this.courseBuilder.makeCourse();
    }
}
