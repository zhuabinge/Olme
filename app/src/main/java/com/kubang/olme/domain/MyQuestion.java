package com.kubang.olme.domain;

import java.sql.Date;
import java.util.List;

/**
 * Created by Bingo on 2014/8/13.
 */
public class MyQuestion {
    private int userId;
    private int comId;
    private String commTheme;
    private String comContent;
    private Date comStartTime;

    public MyQuestion() {
        super();
    }

    public MyQuestion(int userId, int comId, String commTheme, String comContent, Date comStartTime) {
        this.userId = userId;
        this.comId = comId;
        this.commTheme = commTheme;
        this.comContent = comContent;
        this.comStartTime = comStartTime;
    }

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

    public class MyQuestionList{
        private List<MyQuestion> myQuestionList;

        public List<MyQuestion> getMyQuestionList() {
            return myQuestionList;
        }

        public void setMyQuestionList(List<MyQuestion> myQuestionList) {
            this.myQuestionList = myQuestionList;
        }
    }
}
