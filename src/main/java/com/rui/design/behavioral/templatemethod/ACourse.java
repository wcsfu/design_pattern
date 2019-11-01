package com.rui.design.behavioral.templatemethod;

/**
 * @创建人 wangrui
 * @创建时间 2019/11/1
 * @描述
 */
//定义模版
public abstract class ACourse {


    /**
     * 模版过程
     */
    protected final void makeCourse() {
        this.makePPT();
        this.makeVideo();
        //判断钩子方法
        if (this.needWriteArticle()) {
            this.writeArticle();
        }
        this.packageCourse();
    }


    //固定行为
    final void makePPT() {
        System.out.println("制作PPT");
    }

    //固定行为
    final void makeVideo() {
        System.out.println("制作视屏");
    }

    //固定行为
    final void writeArticle() {
        System.out.println("编写手记");
    }

    //钩子方法
    protected boolean needWriteArticle() {
        return false;
    }


    abstract void packageCourse();
}
