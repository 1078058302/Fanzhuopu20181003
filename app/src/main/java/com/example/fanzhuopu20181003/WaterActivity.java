package com.example.fanzhuopu20181003;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class WaterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_water);
        final ImageView image = findViewById(R.id.image);
        WaterView waterView = findViewById(R.id.waterView);
        final RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) image.getLayoutParams();
        waterView.result(new WaterView.AnimationListener() {
            @Override
            public void animation(float y) {
                layoutParams.setMargins(0, 0, 0, (int) y);
                image.setLayoutParams(layoutParams);
            }
        });
    }
}
