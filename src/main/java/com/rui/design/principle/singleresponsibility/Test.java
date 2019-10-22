package com.rui.design.principle.singleresponsibility;

/**
 * @创建人 wangrui
 * @创建时间 2019/10/21
 * @描述
 */
public class Test {
    public static void main(String[] args) {
//        Bird bird=new Bird();
//        bird.mainMoveMode("大雁");
//        bird.mainMoveMode("鸵鸟");
        FlyBird flyBird = new FlyBird();
        flyBird.mainMoveMode("大雁");
        WalkBird walkBird = new WalkBird();
        walkBird.mainMoveMode("鸵鸟");
    }
}

