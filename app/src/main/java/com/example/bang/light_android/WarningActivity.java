package com.example.bang.light_android;

import android.media.Image;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Timer;
import java.util.TimerTask;

public class WarningActivity extends AppCompatActivity {
ImageView warning_Top, warning_Bot;
Handler handler;
Timer timer;
int i=0;
int j=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_warning);


        AnhXa();
        ThucHien();
    }

    private void ThucHien() {
        handler = new Handler(){
            @Override
            public void handleMessage(Message msg) {
                super.handleMessage(msg);
                if (msg.what ==1 ){
                    if (i<=1 ){
                        j=0;
                        warning_Top.setImageLevel(i);
                        warning_Bot.setImageLevel(j);
                        i++;
                        j++;


                    }
                    else {
                        i=0;

                        warning_Top.setImageLevel(i);
                        warning_Bot.setImageLevel(j);

                    }


                }


            }
        };

        timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                handler.sendEmptyMessage(1);

            }
        },000,300);



    }

    private void AnhXa() {
        warning_Top = findViewById(R.id.warning_Top);
        warning_Bot = findViewById(R.id.warning_Bot);




    }
}
