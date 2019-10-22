package com.rui.design.creational.simplefactory;

/**
 * @创建人 wangrui
 * @创建时间 2019/10/22
 * @描述
 */
public class Test {
    public static void main(String[] args) {

        VideoFactory videoFactory = new VideoFactory();
//        Video video = videoFactory.getVideo("python");
        Video video = videoFactory.getVideo(JavaVideo.class);
        if (video == null) {
            return;
        }
        video.produce();
    }
}
