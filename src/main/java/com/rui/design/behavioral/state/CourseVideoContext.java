package com.rui.design.behavioral.state;

/**
 * @创建人 wangrui
 * @创建时间 2019/11/1
 * @描述
 */
public class CourseVideoContext {

    private CourseVideoState courseVideoState;

    public final static PlayState PLAY_STATE = new PlayState();
    public final static StopState STOP_STATE = new StopState();
    public final static SpeedState SPEED_STATE = new SpeedState();
    public final static PauseState PAUSE_STATE = new PauseState();


    public CourseVideoState getCourseVideoState() {
        return courseVideoState;
    }

    public void setCourseVideoState(CourseVideoState courseVideoState) {
        this.courseVideoState = courseVideoState;
        this.courseVideoState.setCourseVideoContext(this);
    }

    public void play() {
        this.courseVideoState.play();
    }

    public void speed() {
        this.courseVideoState.speed();
    }

    public void pause() {
        this.courseVideoState.pause();
    }

    public void stop() {
        this.courseVideoState.stop();
    }

}
