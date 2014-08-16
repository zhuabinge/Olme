package com.kubang.olme.api;

import com.kubang.olme.domain.LoginUser;
import com.kubang.olme.domain.MyCollection;

import org.androidannotations.annotations.rest.Get;
import org.androidannotations.annotations.rest.Rest;
import org.springframework.http.converter.json.GsonHttpMessageConverter;

import java.util.List;

/**
 * Created by wzy on 2014/8/16.
 */
//@Rest(rootUrl="http://192.168.137.220:8080/olme/user/",converters = GsonHttpMessageConverter.class)
@Rest(rootUrl="http://10.0.2.2:8080/olme/",converters = GsonHttpMessageConverter.class)
public interface UserApi {
    @Get("login/{userEmail}/{userPw}")
    LoginUser login(String userEmail,String userPw);

    @Get("collection/{userId}")
    List<MyCollection> getMyCollections(Integer userId);
}
