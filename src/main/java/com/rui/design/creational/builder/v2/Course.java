package com.rui.design.creational.builder.v2;

/**
 * @创建人 wangrui
 * @创建时间 2019/10/27
 * @描述
 */
public class Course {
    private String courseName;
    private String coursePPT;
    private String courseVideo;
    private String courseArticle;
    private String courseQA;

    //在构造其中传入静态内部类的建造者
    private Course(CourseBuilder courseBuilder) {
        this.courseName = courseBuilder.courseName;
        this.coursePPT = courseBuilder.coursePPT;
        this.courseArticle = courseBuilder.courseArticle;
        this.courseVideo = courseBuilder.courseVideo;
        this.courseQA = courseBuilder.courseQA;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", coursePPT='" + coursePPT + '\'' +
                ", courseVideo='" + courseVideo + '\'' +
                ", courseArticle='" + courseArticle + '\'' +
                ", courseQA='" + courseQA + '\'' +
                '}';
    }

    //静态内部类，建造者
    public static class CourseBuilder {
        private String courseName;
        private String coursePPT;
        private String courseVideo;
        private String courseArticle;
        private String courseQA;

        public CourseBuilder buildCourseName(String courseName) {
            this.courseName = courseName;
            return this;
        }

        public CourseBuilder buildCoursePPT(String coursePPT) {
            this.coursePPT = coursePPT;
            return this;
        }

        public CourseBuilder buildVideo(String courseVideo) {
            this.courseVideo = courseVideo;
            return this;
        }


        public CourseBuilder buildCourseArticle(String courseArticle) {
            this.courseArticle = courseArticle;
            return this;
        }


        public CourseBuilder buildCourseQA(String courseQA) {
            this.courseQA = courseQA;
            return this;
        }
        //返回要返回的对象
        public Course build() {
            return new Course(this);
        }
    }
}
