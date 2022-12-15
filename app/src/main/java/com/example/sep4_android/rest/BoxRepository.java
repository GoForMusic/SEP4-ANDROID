package com.example.sep4_android.rest;

import android.util.Log;

import androidx.annotation.NonNull;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.example.sep4_android.BoxAdapter;
import com.example.sep4_android.entities.Box;
import com.example.sep4_android.rest.interfaces.BoxApi;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class BoxRepository {

    private static BoxRepository instance;

    private final MutableLiveData<Box> box;

    public BoxRepository()
    {
        box = new MutableLiveData<>();
    }

    public static synchronized BoxRepository  getInstance()
    {
        if(instance == null) {

            instance = new BoxRepository();

        }
        return instance;
    }

    public LiveData<Box> getSearchedBox()
    {
        return box;
    }

    public void getBox(String id, String api)
    {
        BoxApi boxApi = ServiceGenerator.getBoxApi();
        Call<BoxResponse> call = boxApi.getBox(id, api);
        call.enqueue(new Callback<BoxResponse>() {
            @Override
            public void onResponse(@NonNull Call<BoxResponse> call, @NonNull Response<BoxResponse> response) {
                if(response.isSuccessful())
                {
                    box.setValue(response.body().getBox());
                }
            }

            @Override
            public void onFailure(@NonNull Call<BoxResponse> call, @NonNull Throwable t) {
                Log.i("Retrofit", "Something went wrong");

            }
        });
    }








}
