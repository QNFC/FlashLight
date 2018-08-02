package com.example.bang.light_android;

import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import java.util.Timer;
import java.util.TimerTask;

public class TrafficActivity extends AppCompatActivity {
ImageView img_polic;
Handler handler;
Timer timer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_traffic);

        AnhXa();
        ThucHien();
    }

    private void ThucHien() {
//        handler = new Handler(){
//            @Override
//            public void handleMessage(Message msg) {
//                super.handleMessage(msg);
//                int level = img_polic.getDrawable().getLevel();
//
//                if (level<2){
//                    level++;
//                }
//                else {
//                    level=0;
//                }
//                if (msg.what==0){
//                    img_polic.setImageLevel(level);
//                }
//            }
//        };
//
//        timer = new Timer();
//        timer.scheduleAtFixedRate(new TimerTask() {
//            @Override
//            public void run() {
//                handler.sendEmptyMessage(0);
//            }
//        },000,500);
    }

    private void AnhXa() {
        img_polic = findViewById(R.id.img_polic);
    }
}
