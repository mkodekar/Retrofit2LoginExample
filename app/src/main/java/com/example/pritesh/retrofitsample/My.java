package com.example.pritesh.retrofitsample;

import java.util.List;

import retrofit.Callback;
import retrofit.http.Field;
import retrofit.http.FormUrlEncoded;
import retrofit.http.GET;
import retrofit.http.POST;

/**
 * Created by yashwant on 7/27/2016.
 */
public interface My {

    @FormUrlEncoded
    @POST("/Login.php")
    void getUser(@Field("username") String username,@Field("password") String password, Callback<Pojo> uscb);

}
