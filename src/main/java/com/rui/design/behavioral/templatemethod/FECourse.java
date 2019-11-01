package com.rui.design.behavioral.templatemethod;

/**
 * @创建人 wangrui
 * @创建时间 2019/11/1
 * @描述
 */
public class FECourse extends ACourse {

    private boolean needWriteArticleFlag=false;

    public FECourse(boolean needWriteArticleFlag) {
        this.needWriteArticleFlag = needWriteArticleFlag;
    }

    @Override
    void packageCourse() {
        System.out.println("提供课程的前端代码");
        System.out.println("提供课程的图片等多媒体素材");
    }

    @Override
    protected boolean needWriteArticle() {
        return this.needWriteArticleFlag;
    }
}
