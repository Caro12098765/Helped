package fr.esilv.helped;

import androidx.fragment.app.FragmentActivity;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */

    private Marker MyMarker1;
    private Marker MyMarker2;
    private Marker MyMarker3;

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        mMap.setOnInfoWindowClickListener(new GoogleMap.OnInfoWindowClickListener()
        {

            @Override
            public void onInfoWindowClick(Marker arg0) {
                if(arg0 != null && arg0.getTitle().equals("Mow the lawn")){
                    Intent intent1 = new Intent(MapsActivity.this, profile_JacquelineDLV.class);
                    startActivity(intent1);}

                if(arg0 != null && arg0.getTitle().equals("Furniture assembly")){
                    Intent intent1 = new Intent(MapsActivity.this, profile_jojoR.class);
                    startActivity(intent1);}

                if(arg0 != null && arg0.getTitle().equals("Window cleaning")){
                    Intent intent1 = new Intent(MapsActivity.this, profile_JC92.class);
                    startActivity(intent1);}
            }
        });

        LatLng marker1 = new LatLng(48.890151, 2.253556);
        LatLng marker2 = new LatLng(48.897803, 2.242299);
        LatLng marker3 = new LatLng(48.901139, 2.250332);

        MyMarker1 = mMap.addMarker(new MarkerOptions().position(marker1).title("Mow the lawn").snippet("JacquelineDeLaVille"));
        googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(marker1, 13));

        MyMarker2 = mMap.addMarker(new MarkerOptions().position(marker2).title("Furniture assembly").snippet("JojoDEV4"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(marker2));

        MyMarker3 = mMap.addMarker(new MarkerOptions().position(marker3).title("Window cleaning").snippet("JeanCharles92"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(marker3));


    }

}
