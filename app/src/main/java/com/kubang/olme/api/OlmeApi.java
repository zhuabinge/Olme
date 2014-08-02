package com.kubang.olme.api;

import com.kubang.olme.domain.TUser;

import org.androidannotations.annotations.rest.Get;
import org.androidannotations.annotations.rest.Post;
import org.androidannotations.annotations.rest.Rest;
import org.springframework.http.converter.json.GsonHttpMessageConverter;

/**
 * Created by wuzeyong on 2014/7/31 0031.
 * Function:调用Olme服务端接口
 */
@Rest(rootUrl="http://10.0.2.2:8080/olme/",converters = GsonHttpMessageConverter.class)
public interface OlmeApi {



    @Get("user/{username}/{password}")
    TUser login(String username,String password);
}
