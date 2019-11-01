package com.rui.design.behavioral.chainofresponsibility;

/**
 * @创建人 wangrui
 * @创建时间 2019/11/1
 * @描述
 */
public class ArticleApprover extends Approver {
    @Override
    public void deploy(Course course) {
        if (null != course.getArticle()) {
            System.out.println(course.getName() + "含有手记，批准");
            if(approver != null ){
                approver.deploy(course);
            }
        }else{
            System.out.println(course.getName() + "不包含手记，不批准，流程结束");
            return ;
        }
    }
}
