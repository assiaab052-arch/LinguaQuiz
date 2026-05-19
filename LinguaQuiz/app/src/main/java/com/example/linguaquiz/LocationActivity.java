package com.example.linguaquiz;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationServices;

public class LocationActivity extends AppCompatActivity {

    Button btnGetLocation;
    TextView txtLocation;

    FusedLocationProviderClient fusedLocationClient;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location);

        btnGetLocation = findViewById(R.id.btnGetLocation);
        txtLocation = findViewById(R.id.txtLocation);

        fusedLocationClient =
                LocationServices.getFusedLocationProviderClient(this);

        btnGetLocation.setOnClickListener(v -> {

            checkPermission();
        });
    }

    private void checkPermission() {

        if (ContextCompat.checkSelfPermission(
                this,
                Manifest.permission.ACCESS_FINE_LOCATION)
                == PackageManager.PERMISSION_GRANTED) {

            getLocation();

        } else {

            ActivityCompat.requestPermissions(
                    this,
                    new String[]{
                            Manifest.permission.ACCESS_FINE_LOCATION
                    },
                    100
            );
        }
    }

    private void getLocation() {

        if (ActivityCompat.checkSelfPermission(
                this,
                Manifest.permission.ACCESS_FINE_LOCATION)
                != PackageManager.PERMISSION_GRANTED) {

            return;
        }

        fusedLocationClient.getLastLocation()
                .addOnSuccessListener(location -> {

                    if (location != null) {

                        double latitude = location.getLatitude();
                        double longitude = location.getLongitude();

                        txtLocation.setText(
                                "Latitude : " + latitude +
                                        "\nLongitude : " + longitude
                        );

                    } else {

                        txtLocation.setText(
                                "Localisation introuvable"
                        );
                    }
                });
    }

    @Override
    public void onRequestPermissionsResult(
            int requestCode,
            @NonNull String[] permissions,
            @NonNull int[] grantResults) {

        super.onRequestPermissionsResult(
                requestCode,
                permissions,
                grantResults
        );

        if (requestCode == 100
                && grantResults.length > 0
                && grantResults[0]
                == PackageManager.PERMISSION_GRANTED) {

            getLocation();
        }
    }
}