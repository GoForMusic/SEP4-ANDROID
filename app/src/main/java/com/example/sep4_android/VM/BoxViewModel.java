package com.example.sep4_android.VM;

import android.net.wifi.hotspot2.pps.Credential;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.example.sep4_android.entities.Box;
import com.example.sep4_android.rest.BoxRepository;
import com.example.sep4_android.rest.Credentials;

public class BoxViewModel extends ViewModel {

    BoxRepository boxRepository;

    public BoxViewModel()
    {
        boxRepository = BoxRepository.getInstance();
    }

    public LiveData<Box> getBox()
    {
        return boxRepository.getSearchedBox();
    }
    public void searchBox(String id)
    {
        boxRepository.getBox(id, Credentials.API_KEY);
    }
}
