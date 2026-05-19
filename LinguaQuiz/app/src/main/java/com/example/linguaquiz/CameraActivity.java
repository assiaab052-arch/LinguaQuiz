package com.example.linguaquiz;

import android.Manifest;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Base64;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import java.io.ByteArrayOutputStream;

public class CameraActivity extends AppCompatActivity {

    Button btnOpenCamera;
    ImageView imageView;

    ActivityResultLauncher<Intent> cameraLauncher;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera);

        btnOpenCamera = findViewById(R.id.btnOpenCamera);
        imageView = findViewById(R.id.imageView);

        cameraLauncher =
                registerForActivityResult(
                        new ActivityResultContracts.StartActivityForResult(),
                        result -> {

                            if (result.getResultCode() == RESULT_OK
                                    && result.getData() != null) {

                                Bitmap imageBitmap =
                                        (Bitmap) result.getData().getExtras().get("data");

                                imageView.setImageBitmap(imageBitmap);

                                saveImage(imageBitmap);
                            }
                        });

        btnOpenCamera.setOnClickListener(v -> checkCameraPermission());
    }

    private void checkCameraPermission() {

        if (ContextCompat.checkSelfPermission(
                this,
                Manifest.permission.CAMERA)
                == PackageManager.PERMISSION_GRANTED) {

            openCamera();

        } else {

            ActivityCompat.requestPermissions(
                    this,
                    new String[]{Manifest.permission.CAMERA},
                    100
            );
        }
    }

    private void openCamera() {

        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        cameraLauncher.launch(intent);
    }

    private void saveImage(Bitmap bitmap) {

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, baos);

        byte[] bytes = baos.toByteArray();

        String encoded = Base64.encodeToString(bytes, Base64.DEFAULT);

        SharedPreferences prefs =
                getSharedPreferences("profile", MODE_PRIVATE);

        SharedPreferences.Editor editor = prefs.edit();

        editor.putString("image", encoded);
        editor.apply();
    }

    @Override
    public void onRequestPermissionsResult(
            int requestCode,
            @NonNull String[] permissions,
            @NonNull int[] grantResults) {

        super.onRequestPermissionsResult(requestCode, permissions, grantResults);

        if (requestCode == 100
                && grantResults.length > 0
                && grantResults[0] == PackageManager.PERMISSION_GRANTED) {

            openCamera();
        }
    }
}