package com.deveire.dev.kegbots360;

import android.Manifest;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.location.Geocoder;
import android.location.Location;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.ResultReceiver;
import android.provider.Settings;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.LocationSettingsResult;
import com.google.android.gms.location.LocationSettingsStates;
import com.google.android.gms.location.LocationSettingsStatusCodes;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends Activity
{

    private ImageButton driverButton;
    private ImageButton managerButton;
    private EditText ipEditText;
    private SharedPreferences savedData;

    @Override
    protected void onCreate(final Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.

        //ipEditText = (EditText) findViewById(R.id.ipEditText);

        //savedData = this.getApplicationContext().getSharedPreferences("TruckyTrack SavedData", Context.MODE_PRIVATE);
        //String ip = savedData.getString("ServletIP", "-No Servlet IP found-");
        //ipEditText.setText(ip);

        driverButton = (ImageButton) findViewById(R.id.driverButton);
        managerButton = (ImageButton) findViewById(R.id.managerButton);

        driverButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                /*SharedPreferences.Editor edit = savedData.edit();
                edit.putString("ServletIP", ipEditText.getText().toString());
                edit.commit();*/
                startActivity(new Intent(getApplicationContext(), DriverActivity.class));
            }
        });

        managerButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                /*SharedPreferences.Editor edit = savedData.edit();
                edit.putString("ServletIP", ipEditText.getText().toString());
                edit.commit();*/
                startActivity(new Intent(getApplicationContext(), ManagerActivity.class));
            }
        });

    }


}
