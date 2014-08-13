package com.kubang.olme.domain;

import java.sql.Date;
import java.util.List;

/**
 * Created by Bingo on 2014/8/13.
 */
public class AllQuestion {
    private int userId;
    private int comId;
    private String userName;
    private String userPhoto;
    private String commTheme;
    private String comContent;
    private Date comStartTime;
    private int answerCount;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getComId() {
        return comId;
    }

    public void setComId(int comId) {
        this.comId = comId;
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

    public String getCommTheme() {
        return commTheme;
    }

    public void setCommTheme(String commTheme) {
        this.commTheme = commTheme;
    }

    public String getComContent() {
        return comContent;
    }

    public void setComContent(String comContent) {
        this.comContent = comContent;
    }

    public Date getComStartTime() {
        return comStartTime;
    }

    public void setComStartTime(Date comStartTime) {
        this.comStartTime = comStartTime;
    }

    public int getAnswerCount() {
        return answerCount;
    }

    public void setAnswerCount(int answerCount) {
        this.answerCount = answerCount;
    }

    private class AllQuestionList{
        private List<AllQuestion> allQuestionList;

        public List<AllQuestion> getAllQuestionList() {
            return allQuestionList;
        }

        public void setAllQuestionList(List<AllQuestion> allQuestionList) {
            this.allQuestionList = allQuestionList;
        }
    }

}
