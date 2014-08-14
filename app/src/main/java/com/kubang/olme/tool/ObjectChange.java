package com.kubang.olme.tool;

import com.kubang.olme.domain.AllAnswer;
import com.kubang.olme.domain.AllQuestion;
import com.kubang.olme.domain.CourseInfo;
import com.kubang.olme.domain.CourseType;
import com.kubang.olme.domain.MyCollection;
import com.kubang.olme.domain.MyQuestion;
import com.kubang.olme.domain.OrederRecord;
import com.kubang.olme.domain.QuestionPhoto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Bingo on 2014/8/14.
 */
public class ObjectChange {
    private static List<HashMap<String,Object>> list;
    private static HashMap<String,Object> map;

    public static List<HashMap<String,Object>> changeCourseType( List<CourseType> courseTypeList){
        list = new ArrayList<HashMap<String, Object>>();
        map = new HashMap<String, Object>();
        for(int i = 0; i < courseTypeList.size(); i++){
            map = ObjMapReflect.changeToHashMap(courseTypeList.get(i));
            list.add(map);
        }
        return list;
    }

    public static List<HashMap<String,Object>> changeCourseInfo( List<CourseInfo> courseInfoList){
        list = new ArrayList<HashMap<String, Object>>();
        map = new HashMap<String, Object>();
        for(int i = 0; i < courseInfoList.size(); i++){
            map = ObjMapReflect.changeToHashMap(courseInfoList.get(i));
            list.add(map);
        }
        return list;
    }

    public static List<HashMap<String,Object>> changeAllQuestion( List<AllQuestion> allQuestionList){
        list = new ArrayList<HashMap<String, Object>>();
        map = new HashMap<String, Object>();
        for(int i = 0; i < allQuestionList.size(); i++){
            map = ObjMapReflect.changeToHashMap(allQuestionList.get(i));
            list.add(map);
        }
        return list;
    }

    public static List<HashMap<String,Object>> changeAllAnswer( List<AllAnswer> allAnswerList){
        list = new ArrayList<HashMap<String, Object>>();
        map = new HashMap<String, Object>();
        for(int i = 0; i < allAnswerList.size(); i++){
            map = ObjMapReflect.changeToHashMap(allAnswerList.get(i));
            list.add(map);
        }
        return list;
    }

    public static List<HashMap<String,Object>> changeMyCollection( List<MyCollection> myCollectionList){
        list = new ArrayList<HashMap<String, Object>>();
        map = new HashMap<String, Object>();
        for(int i = 0; i < myCollectionList.size(); i++){
            map = ObjMapReflect.changeToHashMap(myCollectionList.get(i));
            list.add(map);
        }
        return list;
    }

    public static List<HashMap<String,Object>> changeMyQuestion( List<MyQuestion> myQuestionList){
        list = new ArrayList<HashMap<String, Object>>();
        map = new HashMap<String, Object>();
        for(int i = 0; i < myQuestionList.size(); i++){
            map = ObjMapReflect.changeToHashMap(myQuestionList.get(i));
            list.add(map);
        }
        return list;
    }

    public static List<HashMap<String,Object>> changeOrederRecord( List<OrederRecord> orederRecordList){
        list = new ArrayList<HashMap<String, Object>>();
        map = new HashMap<String, Object>();
        for(int i = 0; i < orederRecordList.size(); i++){
            map = ObjMapReflect.changeToHashMap(orederRecordList.get(i));
            list.add(map);
        }
        return list;
    }

    public static List<HashMap<String,Object>> changeQuestionPhoto( List<QuestionPhoto> questionPhotoList){
        list = new ArrayList<HashMap<String, Object>>();
        map = new HashMap<String, Object>();
        for(int i = 0; i < questionPhotoList.size(); i++){
            map = ObjMapReflect.changeToHashMap(questionPhotoList.get(i));
            list.add(map);
        }
        return list;
    }

}
