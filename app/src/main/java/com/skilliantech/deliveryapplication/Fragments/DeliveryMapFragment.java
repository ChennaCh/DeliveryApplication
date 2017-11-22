package com.skilliantech.deliveryapplication.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.MapsInitializer;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.skilliantech.deliveryapplication.Maps.GPSTracker;
import com.skilliantech.deliveryapplication.R;

public class DeliveryMapFragment extends Fragment implements OnMapReadyCallback {

    private MapView mapView;
    private GoogleMap map;
    private GPSTracker gps;
    private Double currene_lat,current_lang;

    public DeliveryMapFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_map, container, false);
        mapView = (MapView) view.findViewById(R.id.vehiclemap);
        mapView.onCreate(savedInstanceState);
        onMapReady(map);

        map = mapView.getMap();
        map.getUiSettings().setMyLocationButtonEnabled(false);
        map.setMyLocationEnabled(true);

        // Needs to call MapsInitializer before doing any CameraUpdateFactory calls
        try {
            MapsInitializer.initialize(this.getActivity());
        } catch (Exception e) {
            e.printStackTrace();
        }

        return view;
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        gps = new GPSTracker(getActivity());
        currene_lat = gps.getLatitude();
        current_lang = gps.getLongitude();
    }

    @Override
    public void onResume() {
        mapView.onResume();
        super.onResume();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        mapView.onDestroy();

    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
        mapView.onLowMemory();
    }

}
