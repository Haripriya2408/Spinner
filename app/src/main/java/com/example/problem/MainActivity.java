package com.example.problem;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
     ImageView imageview;
     int  currentPoint;
     int nextPoint;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageview=findViewById(R.id.imageview);
        imageview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                spinBottle(v);
            }
        });
    }

    private void spinBottle(View v) {
        nextPoint=new Random().nextInt(5000);
        int px=imageview.getWidth()/2;
        int py=imageview.getHeight()/2;
        Animation rotate=new RotateAnimation(currentPoint,nextPoint,px,py);
        rotate.setDuration(6000);
        rotate.setFillAfter(true);
        currentPoint=nextPoint;
        imageview.startAnimation(rotate);
    }
}