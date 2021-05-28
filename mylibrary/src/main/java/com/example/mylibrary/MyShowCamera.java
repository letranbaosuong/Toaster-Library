package com.example.mylibrary;

import android.Manifest;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.provider.MediaStore;
import android.widget.Toast;

import androidx.core.app.ActivityCompat;

import java.util.Objects;

public class MyShowCamera {
    public static void ShowCamera(Activity activity) {
        if (ActivityCompat.checkSelfPermission(activity, Manifest.permission.CAMERA) != PackageManager.PERMISSION_GRANTED
        ) {
            ActivityCompat.requestPermissions(activity,
                    new String[]{Manifest.permission.CAMERA},
                    1);
            Toast.makeText(activity, "Vui lòng cấp quyền Camera.", Toast.LENGTH_SHORT).show();
        } else {
            _showCamera(activity);
        }
    }

    private static void _showCamera(Activity activity) {
        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        if (intent.resolveActivity(Objects.requireNonNull(activity).getPackageManager()) != null) {
            activity.startActivityForResult(intent, 100);
        } else {
            Toast.makeText(activity, "Error", Toast.LENGTH_SHORT).show();
        }
    }
}
