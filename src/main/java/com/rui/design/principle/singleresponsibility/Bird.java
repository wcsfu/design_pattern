package com.rui.design.principle.singleresponsibility;

/**
 * @创建人 wangrui
 * @创建时间 2019/10/21
 * @描述
 */
public class Bird {

    public void mainMoveMode(String birdName) {
        if ("鸵鸟".equals(birdName)) {
            System.out.println(birdName + "用脚走");
        } else {
            System.out.println(birdName + "用翅膀飞");
        }

    }
}
