package com.example.jawadcontacts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageButton;

public class ContactListActivity extends AppCompatActivity {
    ImageButton listImageButton,mapImageButton,settingImageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_list);
        initLayout();
        NavBarInitializer.initializeNavBar(listImageButton, mapImageButton, settingImageButton, ContactListActivity.this);
    }
    private void initLayout(){
        listImageButton= findViewById(R.id.imageButtonList);
        mapImageButton= findViewById(R.id.imageButtonMap);
        settingImageButton=findViewById(R.id.imageButtonSettings);
    }
}