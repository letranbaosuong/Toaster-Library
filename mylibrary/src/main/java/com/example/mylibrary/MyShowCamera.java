package com.example.mylibrary;

import android.content.Context;
import android.content.Intent;

public class MyShowCamera {
    public static void ShowCamera(Context context){
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        context.startActivity(intent);
    }
}
