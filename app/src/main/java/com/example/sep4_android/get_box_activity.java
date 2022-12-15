package com.example.sep4_android;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.sep4_android.VM.BoxViewModel;

public class get_box_activity extends AppCompatActivity {

    private EditText id;
    private BoxViewModel boxViewModel;
    private TextView userId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_box);

        id = findViewById(R.id.boxID);
        userId = findViewById(R.id.userID);

        boxViewModel = new ViewModelProvider(this).get(BoxViewModel.class);



    }

    public void getBoxButton(View view)
    {
        boxViewModel.searchBox(id.getText().toString());
    }
}