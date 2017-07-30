package com.anuragkondeya.example.samplemultipane;

import android.content.res.Configuration;
import android.graphics.drawable.GradientDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        int screenOrientation = getResources().getConfiguration().orientation;

        if (screenOrientation == Configuration.ORIENTATION_PORTRAIT) {
            hideSidePanel();
        }
    }

    private void hideSidePanel() {

        View rightPane = findViewById(R.id.rightPane);
        if (rightPane.getVisibility() == View.VISIBLE) {
            rightPane.setVisibility(View.GONE);
        }


    }


}
