package com.zecovery.android.dev.asp.activity;

import android.Manifest;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.location.LocationServices;
import com.zecovery.android.dev.asp.main.PermissionObject;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/**
 * Created by fran on 03-08-16.
 */

public class BaseActivity extends AppCompatActivity implements
        ConnectionCallbacks, OnConnectionFailedListener {

    public static final String LOG_TAG = "log::: ";
    private static final int PERMISSIONS_REQUEST_ALL_PERMISSIONS = 1;

    protected ArrayList<PermissionObject> permissionsArray = new ArrayList<>();

    public GoogleApiClient mGoogleApiClient;
    public double mLatitude;
    public double mLongitude;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //TODO: aqui hacer que se cargue lo del inicio, eliminar los 3 segundos fijos
        SystemClock.sleep(TimeUnit.SECONDS.toMillis(3));

        // Create an instance of GoogleAPIClient.
        if (mGoogleApiClient == null) {
            mGoogleApiClient = new GoogleApiClient.Builder(this)
                    .addConnectionCallbacks(this)
                    .addOnConnectionFailedListener(this)
                    .addApi(LocationServices.API)
                    .build();
        }
    }

    protected void onStart() {
        mGoogleApiClient.connect();
        super.onStart();
    }

    protected void onStop() {
        mGoogleApiClient.disconnect();
        super.onStop();
    }

    @Override
    public void onConnected(@Nullable Bundle bundle) {

        String[] permission = new String[]{Manifest.permission.ACCESS_FINE_LOCATION};
        askForPermissions(permission);
    }

    public void onRequestPermissionsResult(int requestCode, @NonNull String permissions[], @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        switch (requestCode) {
            case PERMISSIONS_REQUEST_ALL_PERMISSIONS:


                break;
            default:
                Log.e(LOG_TAG, "Unexpected request code");
        }

    }

    public void askForPermissions(String[] permissions) {

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            PermissionObject permission = new PermissionObject(permissions);
            permissionsArray.add(permission);
        }
    }

    @Override
    public void onConnectionSuspended(int i) {

    }

    @Override
    public void onConnectionFailed(@NonNull ConnectionResult connectionResult) {

    }


}
