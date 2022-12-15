package com.example.sep4_android.rest.interfaces;

import com.example.sep4_android.entities.Box;
import com.example.sep4_android.rest.BoxResponse;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface BoxApi {

    @GET("Box/{id}")
    Call<BoxResponse> getBox(@Path("id") String id, @Query("XApiKey") String api);

    @DELETE("Box/{id}")
    Call deleteBox(@Path("id") String id);

    @POST("Box")
    Call<Box> createBox(@Body Box box);

    @PATCH("Box")
    Call<Box> updateBox(@Body Box box);

    @GET("Box")
    Call<List<Box>> getAllBoxes();
}
