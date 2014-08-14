package com.kubang.olme.domain;

import java.util.List;

/**
 * Created by Bingo on 2014/8/13.
 */
public class CourseInfo {

    private int typeId;
    private int courseId;
    private int teacherId;
    private String courseName;
    private String teacherName;
    private String courseDescription;
    private String coursePhoto;
    private float price;

    public CourseInfo() {
        super();
    }

    public CourseInfo(int typeId, int courseId, int teacherId, String courseName, String teacherName, String courseDescription, String coursePhoto, float price) {
        this.typeId = typeId;
        this.courseId = courseId;
        this.teacherId = teacherId;
        this.courseName = courseName;
        this.teacherName = teacherName;
        this.courseDescription = courseDescription;
        this.coursePhoto = coursePhoto;
        this.price = price;
    }

    public int getTypeId() {
        return typeId;
    }

    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getCourseDescription() {
        return courseDescription;
    }

    public void setCourseDescription(String courseDescription) {
        this.courseDescription = courseDescription;
    }

    public String getCoursePhoto() {
        return coursePhoto;
    }

    public void setCoursePhoto(String coursePhoto) {
        this.coursePhoto = coursePhoto;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

//    public class CourseInfoList{
//        private List<CourseType> courseTypeList;
//
//        public List<CourseType> getCourseTypeList() {
//            return courseTypeList;
//        }
//
//        public void setCourseTypeList(List<CourseType> courseTypeList) {
//            this.courseTypeList = courseTypeList;
//        }
//    }

}

