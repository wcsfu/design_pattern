package com.rui.design.creational.simplefactory;

/**
 * @创建人 wangrui
 * @创建时间 2019/10/22
 * @描述
 */
public class VideoFactory {

//    Video getVideo(String type) {
//        if ("java".equals(type)) {
//            return new JavaVideo();
//        } else if ("python".equals(type)) {
//            return new PythonVideo();
//        }
//        return null;
//    }


    /**
     * 利用反射机制创建工厂
     * @param c
     * @return
     */
    public Video getVideo(Class c) {
        Video video = null;

        try {
            video = (Video) Class.forName(c.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return video;
    }
}
