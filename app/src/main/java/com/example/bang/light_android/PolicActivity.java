package com.example.bang.light_android;

import android.annotation.SuppressLint;
import android.graphics.drawable.LevelListDrawable;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public class PolicActivity extends AppCompatActivity {
ImageView img_traffic;
Handler handler , delay;
Timer timer;
View v_traffic;
int i=0;
final int drawable[] ={R.drawable.shape_color_red, R.drawable.shape_color_yellow, R.drawable.shape_color};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_polic);

        AnhXa();
        ThucHien();
    }

    private void ThucHien() {
        v_traffic.setBackgroundResource(R.drawable.shape_color_red);

        handler = new Handler(){
            @SuppressLint("ResourceAsColor")
            @Override
            public void handleMessage(Message msg) {
                super.handleMessage(msg);
                LevelListDrawable levelListDrawable = (LevelListDrawable) img_traffic.getDrawable();
                int level = levelListDrawable.getLevel();

                if (level <2){
                    level++;

                }
                else {
                    level =0;
                }

                if (msg.what==1){
                    img_traffic.setImageLevel(level);
                    v_traffic.setBackgroundResource(drawable[level]);



                }

            }
        };

        timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                handler.sendEmptyMessage(1);
            }
        },1000,1000);





//        for (final int i: drawable) {
//            delay.postDelayed(new Runnable() {
//                @Override
//                public void run() {
//
//                    v_traffic.setBackgroundResource(i);
//                }
//            },1000);
//        }




        }


    private void AnhXa() {
        img_traffic = findViewById(R.id.img_traffic);
        v_traffic = findViewById(R.id.viewTraffic);
    }
}
