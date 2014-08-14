package com.kubang.olme.domain;

import java.util.List;

/**
 * Created by Bingo on 2014/8/13.
 */
public class CourseType {
    private int typeId;
    private String typeName;
    private String typePhoto;
    private String description;
    private int totalCourseCount;   //课程总数
    private int totalTime;  //总课时
    private int totalVedioCount; //总视频数

    public CourseType() {
        super();
    }

    public CourseType(int typeId, String typeName, String typePhoto, String description, int totalCourseCount, int totalTime, int totalVedioCount) {
        this.typeId = typeId;
        this.typeName = typeName;
        this.typePhoto = typePhoto;
        this.description = description;
        this.totalCourseCount = totalCourseCount;
        this.totalTime = totalTime;
        this.totalVedioCount = totalVedioCount;
    }

    public int getTypeId() {
        return typeId;
    }

    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getTypePhoto() {
        return typePhoto;
    }

    public void setTypePhoto(String typePhoto) {
        this.typePhoto = typePhoto;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getTotalCourseCount() {
        return totalCourseCount;
    }

    public void setTotalCourseCount(int totalCourseCount) {
        this.totalCourseCount = totalCourseCount;
    }

    public int getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(int totalTime) {
        this.totalTime = totalTime;
    }

    public int getTotalVedioCount() {
        return totalVedioCount;
    }

    public void setTotalVedioCount(int totalVedioCount) {
        this.totalVedioCount = totalVedioCount;
    }

//    public class CourseTypeList{
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
