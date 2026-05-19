package com.example.linguaquiz;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationServices;

import org.osmdroid.config.Configuration;
import org.osmdroid.tileprovider.tilesource.TileSourceFactory;
import org.osmdroid.util.GeoPoint;
import org.osmdroid.views.MapView;
import org.osmdroid.views.overlay.Marker;

public class MapActivity extends AppCompatActivity {

    private MapView map;

    private FusedLocationProviderClient fusedLocationClient;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Configuration.getInstance().setUserAgentValue(getPackageName());

        setContentView(R.layout.activity_map);

        map = findViewById(R.id.map);

        fusedLocationClient =
                LocationServices.getFusedLocationProviderClient(this);

        // Type de carte
        map.setTileSource(TileSourceFactory.MAPNIK);

        // Zoom tactile
        map.setMultiTouchControls(true);

        // Zoom
        map.getController().setZoom(18.0);

        showMyLocation();
    }

    private void showMyLocation() {

        if (ActivityCompat.checkSelfPermission(
                this,
                Manifest.permission.ACCESS_FINE_LOCATION)
                != PackageManager.PERMISSION_GRANTED) {

            ActivityCompat.requestPermissions(
                    this,
                    new String[]{
                            Manifest.permission.ACCESS_FINE_LOCATION
                    },
                    1
            );

            return;
        }

        fusedLocationClient.getLastLocation()
                .addOnSuccessListener(location -> {

                    if (location != null) {

                        double latitude =
                                location.getLatitude();

                        double longitude =
                                location.getLongitude();

                        GeoPoint myPosition =
                                new GeoPoint(latitude, longitude);

                        // Centrer la map
                        map.getController().setCenter(myPosition);

                        // Marker
                        Marker marker = new Marker(map);

                        marker.setPosition(myPosition);

                        marker.setTitle("Ma Position");

                        map.getOverlays().add(marker);

                        map.invalidate();
                    }
                });
    }

    @Override
    protected void onResume() {
        super.onResume();
        map.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
        map.onPause();
    }
}