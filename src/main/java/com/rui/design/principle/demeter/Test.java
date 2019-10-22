package com.rui.design.principle.demeter;


/**
 * @创建人 wangrui
 * @创建时间 2019/10/21
 * @描述
 */
public class Test {
    public static void main(String[] args) {
        Boss boss=new Boss();
        TeamLeader teamLeader = new TeamLeader();
        boss.commandCheckNumber(teamLeader);
    }
}
