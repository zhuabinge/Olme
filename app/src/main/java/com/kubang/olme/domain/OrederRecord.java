package com.kubang.olme.domain;

import java.sql.Date;
import java.util.List;

/**
 * Created by Bingo on 2014/8/11.
 */
public class OrederRecord {
    private int userId;
    private int orderId;
    private int courseId;
    private int teacherId;
    private Date orderDate;
    private String courseName;
    private String courseDescription;
    private String coursePhoto;
    private String teacherName;
    private int courseTotalLength;
    private int consumeScore;
    private float coursePrice;
    private float actualPrice;

    public OrederRecord() {
        super();
    }

    public OrederRecord(int userId, int orderId, int courseId, int teacherId, Date orderDate, String courseName, String courseDescription, String coursePhoto, String teacherName, int courseTotalLength, int consumeScore, float coursePrice, float actualPrice) {
        this.userId = userId;
        this.orderId = orderId;
        this.courseId = courseId;
        this.teacherId = teacherId;
        this.orderDate = orderDate;
        this.courseName = courseName;
        this.courseDescription = courseDescription;
        this.coursePhoto = coursePhoto;
        this.teacherName = teacherName;
        this.courseTotalLength = courseTotalLength;
        this.consumeScore = consumeScore;
        this.coursePrice = coursePrice;
        this.actualPrice = actualPrice;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
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

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
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

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public int getVedioTotalLength() {
        return courseTotalLength;
    }

    public void setVedioTotalLength(int courseTotalLength) {
        this.courseTotalLength = courseTotalLength;
    }

    public int getConsumeScore() {
        return consumeScore;
    }

    public void setConsumeScore(int consumeScore) {
        this.consumeScore = consumeScore;
    }

    public float getCoursePrice() {
        return coursePrice;
    }

    public void setCoursePrice(float coursePrice) {
        this.coursePrice = coursePrice;
    }

    public float getActualPrice() {
        return actualPrice;
    }

    public void setActualPrice(float actualPrice) {
        this.actualPrice = actualPrice;
    }

	@Override
	public String toString() {
		return "OrederRecord [userId=" + userId + ", orderId=" + orderId
				+ ", courseId=" + courseId + ", teacherId=" + teacherId
				+ ", orderDate=" + orderDate + ", courseName=" + courseName
				+ ", courseDescription=" + courseDescription + ", coursePhoto="
				+ coursePhoto + ", teacherName=" + teacherName
				+ ", courseTotalLength=" + courseTotalLength
				+ ", consumeScore=" + consumeScore + ", coursePrice="
				+ coursePrice + ", actualPrice=" + actualPrice + "]";
	}
    
}
