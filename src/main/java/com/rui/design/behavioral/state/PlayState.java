package com.rui.design.behavioral.state;

/**
 * @创建人 wangrui
 * @创建时间 2019/11/1
 * @描述
 */
public class PlayState extends CourseVideoState {
    @Override
    public void play() {
        System.out.println("正常播放课程视屏状态");
    }

    @Override
    public void speed() {

    }

    @Override
    public void pause() {

    }

    @Override
    public void stop() {

    }
}
