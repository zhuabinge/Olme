package com.kubang.olme.domain;

import java.sql.Date;
import java.util.List;

/**
 * Created by Bingo on 2014/8/13.
 */
public class AllAnswer {
    private int commentId;
    private int courseId;
    private int userId;
    private String commentContent;
    private Date commentTime;
    private String  userName;
    private String userPhoto;

    public AllAnswer() {
        super();
    }

    public AllAnswer(int commentId, int courseId, int userId, String commentContent, Date commentTime, String userName, String userPhoto) {
        this.commentId = commentId;
        this.courseId = courseId;
        this.userId = userId;
        this.commentContent = commentContent;
        this.commentTime = commentTime;
        this.userName = userName;
        this.userPhoto = userPhoto;
    }

    public int getCommentId() {
        return commentId;
    }

    public void setCommentId(int commentId) {
        this.commentId = commentId;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getCommentContent() {
        return commentContent;
    }

    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent;
    }

    public Date getCommentTime() {
        return commentTime;
    }

    public void setCommentTime(Date commentTime) {
        this.commentTime = commentTime;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPhoto() {
        return userPhoto;
    }

    public void setUserPhoto(String userPhoto) {
        this.userPhoto = userPhoto;
    }

    public class AllAnswerList{
        private List<AllAnswer> allAnswerList;

        public List<AllAnswer> getAllAnswerList() {
            return allAnswerList;
        }

        public void setAllAnswerList(List<AllAnswer> allAnswerList) {
            this.allAnswerList = allAnswerList;
        }
    }
}
