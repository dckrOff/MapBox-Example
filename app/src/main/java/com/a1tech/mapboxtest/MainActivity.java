package com.a1tech.mapboxtest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.mapbox.maps.MapView;
import com.mapbox.maps.Style;

public class MainActivity extends AppCompatActivity {

    private MapView mapView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mapView = findViewById(R.id.mapView);
        mapView.getMapboxMap().loadStyleUri(Style.DARK);
    }
}