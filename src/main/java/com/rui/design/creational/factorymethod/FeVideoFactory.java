package com.rui.design.creational.factorymethod;

/**
 * @创建人 wangrui
 * @创建时间 2019/10/22
 * @描述
 */
public class FeVideoFactory extends VideoFactory {
    @Override
    public Video getVideo() {
        return new FeVideo();
    }
}
