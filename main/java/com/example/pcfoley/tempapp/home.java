package com.example.pcfoley.tempapp;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.view.View.OnClickListener;


/**
 * Created by pcfoley on 18/03/2016.
 */
public class home extends Activity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        ImageButton nextCam = (ImageButton) findViewById(R.id.camera);
        nextCam.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent devIntent = new Intent(home.this, camera.class);
                home.this.startActivity(devIntent);
            }
        });

        ImageButton nextDev = (ImageButton) findViewById(R.id.devices);
        nextDev.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent devIntent = new Intent(home.this, device.class);
                home.this.startActivity(devIntent);
            }
        });


        ImageButton nextLog = (ImageButton) findViewById(R.id.log_out);
        nextLog.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent devIntent = new Intent(home.this, log_out.class);
                home.this.startActivity(devIntent);
            }
        });

        ImageButton nextSet = (ImageButton) findViewById(R.id.settings);
        nextSet.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent devIntent = new Intent(home.this, settings.class);
                home.this.startActivity(devIntent);
            }
        });

    }

}
