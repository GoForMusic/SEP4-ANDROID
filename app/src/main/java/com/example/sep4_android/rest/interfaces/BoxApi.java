package com.example.sep4_android.rest.interfaces;

import com.example.sep4_android.entities.Box;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface BoxApi {

    @GET("api/v1/Box/{id}")
    Call<List<Box>> getBox(@Path("id") String id);

    @DELETE("api/v1/Box/{id}")
    Call<List<Box>> deleteBox(@Path("id") String id);

    @POST("api/v1/Box")
    Call<Box> createBox(@Body Box box);

    @PATCH("api/v1/Box")
    Call<Box> updateBox(@Body Box box);
}
