package com.rui.design.behavioral.command;

/**
 * @创建人 wangrui
 * @创建时间 2019/11/1
 * @描述
 */
public class Test {
    public static void main(String[] args) {
        CourseVideo courseVideo=new CourseVideo("java设计模式精简by Geely");

        OpenCourseCommand openCourseVideoCommand =new OpenCourseCommand(courseVideo);

        CloseCourseCommand closeCourseCommand=new CloseCourseCommand(courseVideo);
        Staff staff=new Staff();
        staff.addCommand(openCourseVideoCommand);
        staff.addCommand(closeCourseCommand);
        staff.executeCommands();
    }
}
