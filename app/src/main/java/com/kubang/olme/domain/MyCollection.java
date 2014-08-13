package com.kubang.olme.domain;

import java.util.List;

/**
 * Created by Bingo on 2014/8/13.
 */
public class MyCollection {
    private int userId;
    private int vedioId;
    private String vedioName;
    private String vedioLocation;
    private int vedioOpenLength;

    public MyCollection() {
        super();
    }

    public MyCollection(int userId, int vedioId, String vedioName, String vedioLocation, int vedioOpenLength) {
        this.userId = userId;
        this.vedioId = vedioId;
        this.vedioName = vedioName;
        this.vedioLocation = vedioLocation;
        this.vedioOpenLength = vedioOpenLength;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getVedioId() {
        return vedioId;
    }

    public void setVedioId(int vedioId) {
        this.vedioId = vedioId;
    }

    public String getVedioName() {
        return vedioName;
    }

    public void setVedioName(String vedioName) {
        this.vedioName = vedioName;
    }

    public String getVedioLocation() {
        return vedioLocation;
    }

    public void setVedioLocation(String vedioLocation) {
        this.vedioLocation = vedioLocation;
    }

    public int getVedioOpenLength() {
        return vedioOpenLength;
    }

    public void setVedioOpenLength(int vedioOpenLength) {
        this.vedioOpenLength = vedioOpenLength;
    }


    public class MyCollectionList{
        private List<MyCollection> myCollection;

        public List<MyCollection> getMyCollection() {
            return myCollection;
        }

        public void setMyCollection(List<MyCollection> myCollection) {
            this.myCollection = myCollection;
        }
    }
}
