package com.example.masterinanimation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView txtAnimation,txtAnimation1;
    private boolean isAnimationFaded;
    private ImageView imgTiger,imgLion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtAnimation = findViewById(R.id.txtAnimation);
        txtAnimation1 = findViewById(R.id.txtAnimation1);
        imgTiger = findViewById(R.id.imgTiger);
        imgLion = findViewById(R.id.imgLion);

        //setting up animation effect

        txtAnimation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (isAnimationFaded){

                    txtAnimation1.animate().alpha(1f).setDuration(1000);
                    txtAnimation.animate().alpha(0f).setDuration(1000);
                    isAnimationFaded = false;
                }else if(!isAnimationFaded){
                    txtAnimation1.animate().alpha(0f).setDuration(1000);
                    txtAnimation.animate().alpha(1f).setDuration(1000);
                    isAnimationFaded= true;
                }

            }
        });

        imgLion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (isAnimationFaded){

                    imgLion.animate().rotationXBy(360f).alpha(0).setDuration(1000);
                    imgTiger.animate().alpha(1).setDuration(1000);
                    isAnimationFaded = false;
                }else if(!isAnimationFaded){
                    imgTiger.animate().rotationXBy(360f).alpha(0).setDuration(1000);
                    imgLion.animate().alpha(1).setDuration(1000);
                    isAnimationFaded= true;
                }


            }
        });

    }
}
