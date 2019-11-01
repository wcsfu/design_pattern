package com.rui.design.behavioral.chainofresponsibility;

/**
 * @创建人 wangrui
 * @创建时间 2019/11/1
 * @描述
 */
public class Test {

    public static void main(String[] args) {
        Approver articleApprover =new ArticleApprover();
        Approver videApprover =new VideoApprover();

        Course course=new Course();
        course.setName("java设计模式精讲 --- By Geely");
        course.setArticle("java设计模式精讲的手记");
        //course.setVideo("java设计模式精讲的视屏");


        articleApprover.setNextApprover(videApprover);
        articleApprover.deploy(course);

    }
}
