package com.mariela.leon.web_service_retrofit.Interface;


import com.mariela.leon.web_service_retrofit.Model.Posts;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface JsonPlaceHolderApi {

    @GET("posts")
    Call<List<Posts>> getPosts();

}
