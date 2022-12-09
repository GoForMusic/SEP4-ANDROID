package com.example.sep4_android.rest;

import com.example.sep4_android.rest.interfaces.BoxApi;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ServiceGenerator {
    private static BoxApi boxApi;

    public static BoxApi getBoxApi()
    {
        if(boxApi==null)
        {
            boxApi = new Retrofit.Builder()
                    .baseUrl("http://sep4dataserver-env.eba-szznaygj.eu-north-1.elasticbeanstalk.com/api/v1")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()
                    .create(BoxApi.class);
        }
        return boxApi;
    }
}
