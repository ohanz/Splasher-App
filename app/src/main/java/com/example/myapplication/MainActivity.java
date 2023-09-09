package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Activity act;
    TextView tapper; public static int timer = 3*1000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tapper = findViewById(R.id.hell_w);
        act = MainActivity.this;

        findViewById(R.id.tapper).setOnClickListener(view -> {
            new Handler().postDelayed(() -> {
                tapper.setText("Test Application here!");
                System.out.println("Timer: "+timer);
            }, timer);
            Toast.makeText(act, "See the magics above..", Toast.LENGTH_SHORT).show();
        });
    }

}
