package com.example.jawadcontacts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageButton;

public class ContactMapActivity extends AppCompatActivity {
    ImageButton listImageButton,mapImageButton,settingImageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_map);
        initLayout();
        NavBarInitializer.initializeNavBar(listImageButton, mapImageButton, settingImageButton, ContactMapActivity.this);
    }
    private void initLayout(){
        listImageButton= findViewById(R.id.imageButtonList);
        mapImageButton= findViewById(R.id.imageButtonMap);
        settingImageButton=findViewById(R.id.imageButtonSettings);
    }
}