package com.kubang.olme.domain;

import java.sql.Date;
import java.util.List;

/**
 * Created by Bingo on 2014/8/13.
 */
public class AllAnswer {
    private int commentId;
    private int comId;
    private int userId;
    private int userAnswerId;
    private int userReplyId;
    private String commentContent;
    private Date commentTime;
    private String  userName;
    private String userAnswerName;
    private String userReplyName;

    public AllAnswer() {
        super();
    }

    public AllAnswer(int commentId, int comId, int userId, int userAnswerId, int userReplyId, String commentContent, Date commentTime, String userName, String userAnswerName, String userReplyName) {
        this.commentId = commentId;
        this.comId = comId;
        this.userId = userId;
        this.userAnswerId = userAnswerId;
        this.userReplyId = userReplyId;
        this.commentContent = commentContent;
        this.commentTime = commentTime;
        this.userName = userName;
        this.userAnswerName = userAnswerName;
        this.userReplyName = userReplyName;
    }

    public int getCommentId() {
        return commentId;
    }

    public void setCommentId(int commentId) {
        this.commentId = commentId;
    }

    public int getComId() {
        return comId;
    }

    public void setComId(int comId) {
        this.comId = comId;
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

    public int getUserAnswerId() {
        return userAnswerId;
    }

    public void setUserAnswerId(int userAnswerId) {
        this.userAnswerId = userAnswerId;
    }

    public int getUserReplyId() {
        return userReplyId;
    }

    public void setUserReplyId(int userReplyId) {
        this.userReplyId = userReplyId;
    }

    public String getUserAnswerName() {
        return userAnswerName;
    }

    public void setUserAnswerName(String userAnswerName) {
        this.userAnswerName = userAnswerName;
    }

    public String getUserReplyName() {
        return userReplyName;
    }

    public void setUserReplyName(String userReplyName) {
        this.userReplyName = userReplyName;
    }

    @Override
    public String toString() {
        return "AllAnswer{" +
                "commentId=" + commentId +
                ", comId=" + comId +
                ", userId=" + userId +
                ", userAnswerId=" + userAnswerId +
                ", userReplyId=" + userReplyId +
                ", commentContent='" + commentContent + '\'' +
                ", commentTime=" + commentTime +
                ", userName='" + userName + '\'' +
                ", userAnswerName='" + userAnswerName + '\'' +
                ", userReplyName='" + userReplyName + '\'' +
                '}';
    }

//    public class AllAnswerList{
//        private List<AllAnswer> allAnswerList;
//
//        public List<AllAnswer> getAllAnswerList() {
//            return allAnswerList;
//        }
//
//        public void setAllAnswerList(List<AllAnswer> allAnswerList) {
//            this.allAnswerList = allAnswerList;
//        }
//    }
}
