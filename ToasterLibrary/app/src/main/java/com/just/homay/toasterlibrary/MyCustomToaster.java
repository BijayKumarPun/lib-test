package com.just.homay.toasterlibrary;

import android.content.Context;
import android.widget.Toast;

public class MyCustomToaster {
    public void toastNewMessage(Context context, String message) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }
}
