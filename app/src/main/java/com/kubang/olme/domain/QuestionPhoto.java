package com.kubang.olme.domain;

import java.util.List;

/**
 * Created by Bingo on 2014/8/14.
 */
public class QuestionPhoto {
    private int photoId;
    private int commId;
    private String photoLocation;

    public QuestionPhoto() {
        super();
    }

    public QuestionPhoto(int photoId, int commId, String photoLocation) {
        this.photoId = photoId;
        this.commId = commId;
        this.photoLocation = photoLocation;
    }

    public int getPhotoId() {
        return photoId;
    }

    public void setPhotoId(int photoId) {
        this.photoId = photoId;
    }

    public int getCommId() {
        return commId;
    }

    public void setCommId(int commId) {
        this.commId = commId;
    }

    public String getPhotoLocation() {
        return photoLocation;
    }

    public void setPhotoLocation(String photoLocation) {
        this.photoLocation = photoLocation;
    }

//    public class QuestionPhotoList{
//        private List<QuestionPhoto> questionPhotoList;
//
//        public List<QuestionPhoto> getQuestionPhotoList() {
//            return questionPhotoList;
//        }
//
//        public void setQuestionPhotoList(List<QuestionPhoto> questionPhotoList) {
//            this.questionPhotoList = questionPhotoList;
//        }
//    }
}
