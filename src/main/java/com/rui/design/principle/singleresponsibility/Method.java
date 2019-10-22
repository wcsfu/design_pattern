package com.rui.design.principle.singleresponsibility;

/**
 * @创建人 wangrui
 * @创建时间 2019/10/21
 * @描述
 */
public class Method {

    private void updateUserInfo(String userName, String address) {
        userName = "geely";
        address = "beijing";
    }


    private void updateUserInfo(String userName, String... properties) {
        userName = "geely";
        // address = "beijing";
    }

    /**
     * 方法拆分：只更新username
     * @param userName
     */
    private void updateUserName(String userName) {
        userName = "geely";
    }

    /**
     * 方法拆分：只更新address
     * @param address
     */
    private void updateUserAddress(String address) {
        address = "beijing";
    }
}
