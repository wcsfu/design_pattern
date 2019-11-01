package com.rui.design.behavioral.oberver;

import java.util.Observable;

/**
 * @创建人 wangrui
 * @创建时间 2019/11/1
 * @描述
 */
//被观察对象
public class Course extends Observable {

    private String courseName;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void produceQuestion(Course course,Question question){
        System.out.println(question.getUserName()+"在"+course.courseName+"提交了一个问题");
        //调用已经发生改变
        super.setChanged();
        //通知各个观察者
        super.notifyObservers(question);
    }
}
