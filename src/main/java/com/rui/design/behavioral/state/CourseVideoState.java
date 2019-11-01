package com.rui.design.behavioral.state;

/**
 * @创建人 wangrui
 * @创建时间 2019/11/1
 * @描述
 */
public abstract class CourseVideoState {

    protected CourseVideoContext courseVideoContext;

    public void setCourseVideoContext(CourseVideoContext courseVideoContext) {
        this.courseVideoContext = courseVideoContext;
    }

    public abstract void play();

    public abstract void speed();

    public abstract void pause();

    public abstract void stop();

}
