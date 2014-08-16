package com.kubang.olme.api;

import com.kubang.olme.domain.AllAnswer;
import com.kubang.olme.domain.AllQuestion;
import com.kubang.olme.domain.MyQuestion;
import com.kubang.olme.domain.QuestionPhoto;

import org.androidannotations.annotations.rest.Get;
import org.androidannotations.annotations.rest.Rest;
import org.springframework.http.converter.json.GsonHttpMessageConverter;

import java.util.List;

/**
 * Created by wzy on 2014/8/16.
 */
@Rest(rootUrl="http://10.0.2.2:8080/olme/communication/",converters = GsonHttpMessageConverter.class)
public interface CommunicationApi {

    @Get("findmyquestion/{page}")
    List<MyQuestion> getMyQuestions(Integer page);

    @Get("findallquestions/{page}")
    List<AllQuestion> getAllQuestions(Integer page);

    @Get("findallanswers/{page}")
    List<AllAnswer> getAllAnswers(Integer page);

    @Get("picture/{comId}")
    List<QuestionPhoto> getQuestionPhotos(Integer comId);
}
