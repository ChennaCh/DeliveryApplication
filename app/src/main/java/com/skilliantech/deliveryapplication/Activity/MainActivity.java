package com.skilliantech.deliveryapplication.Activity;

import android.Manifest;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.skilliantech.deliveryapplication.Permissions.AbsRuntimePermission;
import com.skilliantech.deliveryapplication.R;

public class MainActivity extends AbsRuntimePermission {

    private Button login_btn;
    private static final int REQUEST_PERMISSION = 10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(R.style.Theme_AppCompat);
        setContentView(R.layout.activity_main);

        requestAppPermissions(new String[]{
                        Manifest.permission.ACCESS_FINE_LOCATION
                },
                R.string.msg,REQUEST_PERMISSION);

        login_btn = (Button) findViewById(R.id.login_btn);

        login_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, HomeScreenActivity.class));
            }
        });
    }

    @Override
    public void onPermissionsGranted(int requestCode) {

    }
}
