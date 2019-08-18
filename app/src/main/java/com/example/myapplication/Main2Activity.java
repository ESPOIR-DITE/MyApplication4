package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class Main2Activity extends AppCompatActivity implements OnMapReadyCallback {
    /**
     * map key: AIzaSyC25GqCIwhX-mO02uPxgC85yJX_bi4cCXo
     * @param savedInstanceState
     */


    GoogleMap map;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        SupportMapFragment mapFragment =(SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);


    }
    @Override
    public void onMapReady(GoogleMap googleMap)
    {
        map = googleMap;
        LatLng Congo =new LatLng(-33.950482, 18.473972);//will need to put the coordinates
        map.addMarker(new MarkerOptions().position(Congo).title("CONGO"));
        map.moveCamera(CameraUpdateFactory.newLatLng(Congo));
    }
}
