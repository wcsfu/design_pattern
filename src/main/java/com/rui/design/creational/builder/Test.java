package com.rui.design.creational.builder;

/**
 * @创建人 wangrui
 * @创建时间 2019/10/22
 * @描述
 */
public class Test {
    public static void main(String[] args) {
        //创建建造者对象
        CourseBuilder courseBuilder= new CourseActualBuilder();
        //引用创建者对象
        Coah coah=new Coah();
        coah.setCourseBuilder(courseBuilder);
        //使用创建者构造对象
        Course course=coah.makeCourse("Java设计模式精讲","java设计模式精讲PPT","java设计模式精讲视屏","java设计模式精讲手记","java设计模式精讲问答");
        System.out.println(course);
    }
}
