package com.rui.design.behavioral.command;

/**
 * @创建人 wangrui
 * @创建时间 2019/11/1
 * @描述
 */
public class OpenCourseCommand implements Command {

    private CourseVideo courseVideo;

    public OpenCourseCommand(CourseVideo courseVideo) {
        this.courseVideo = courseVideo;
    }

    @Override
    public void excute() {
        courseVideo.open();
    }
}
