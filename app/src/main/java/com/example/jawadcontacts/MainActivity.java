package com.example.jawadcontacts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton listImageButton,mapImageButton,settingImageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initLayout();
        NavBarInitializer.initializeNavBar(listImageButton, mapImageButton, settingImageButton, MainActivity.this);

    }
    private void initLayout(){
        listImageButton= findViewById(R.id.imageButtonList);
        mapImageButton= findViewById(R.id.imageButtonMap);
        settingImageButton=findViewById(R.id.imageButtonSettings);
    }
}