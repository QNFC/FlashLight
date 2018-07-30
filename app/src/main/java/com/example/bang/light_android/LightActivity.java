package com.example.bang.light_android;

import android.annotation.SuppressLint;
import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class LightActivity extends AppCompatActivity implements SeekBar.OnSeekBarChangeListener {
ImageView iv_Light;
SeekBar sb_Light;
TextView tv_Light;
Animation fide_in;
View view;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_light);

        AnhXa();
        ThucHien();
    }

    private void ThucHien() {
        sb_Light.setOnSeekBarChangeListener(this);
        iv_Light.startAnimation(fide_in);
        fide_in.setDuration(2000);
    }

    private void AnhXa() {
        iv_Light = findViewById(R.id.iv_Light);
        sb_Light = findViewById(R.id.sb_Light);
        tv_Light = findViewById(R.id.tv_Light);
        view = findViewById(R.id.view);


        fide_in = AnimationUtils.loadAnimation(this, R.anim.fade_in);



    }

    @SuppressLint("ResourceAsColor")
    @Override
    public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
         i = sb_Light.getProgress();
         if (i>30 && i<50){

             iv_Light.setImageLevel(1);
             view.setBackgroundResource(R.color.Second);



         }
         if (i>50){
             iv_Light.setImageLevel(2);
             view.setBackgroundResource(R.color.Last);


         }

         tv_Light.setText(i +"");



    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {
        iv_Light.setImageLevel(0);
        view.setBackgroundResource(R.color.First);


    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }
}
