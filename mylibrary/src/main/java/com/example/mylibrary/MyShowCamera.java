package com.example.mylibrary;

import android.app.Activity;
import android.content.Intent;
import android.provider.MediaStore;
import android.widget.Toast;

import java.util.Objects;

public class MyShowCamera {
    public static void ShowCamera(Activity activity) {
        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        if (intent.resolveActivity(Objects.requireNonNull(activity).getPackageManager()) != null) {
            activity.startActivityForResult(intent, 100);
        } else {
            Toast.makeText(activity, "Error", Toast.LENGTH_SHORT).show();
        }
    }
}
