package com.just.homay.toastapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.just.homay.toasterlibrary.MyCustomToaster;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MyCustomToaster myCustomToaster = new MyCustomToaster();
        myCustomToaster.toastNewMessage(this, "hello there");


    }
}
