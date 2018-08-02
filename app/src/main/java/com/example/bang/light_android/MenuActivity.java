package com.example.bang.light_android;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MenuActivity extends AppCompatActivity implements View.OnClickListener {
ImageButton ibtn_Light, ibtn_FL, ibtn_traffic, ibtn_warning, ibtn_polic, ibtn_neon;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        AnhXa();
        ThucHien();
    }

    private void ThucHien() {
        ibtn_Light.setOnClickListener(this);
        ibtn_warning.setOnClickListener(this);
        ibtn_traffic.setOnClickListener(this);
    }

    private void AnhXa() {
        ibtn_Light = findViewById(R.id.ibtn_Light);
        ibtn_warning = findViewById(R.id.ibtn_Warning);
        ibtn_traffic = findViewById(R.id.ibtn_traffic);
        ibtn_polic =findViewById(R.id.ibtn_polic);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.ibtn_Light:
                startActivity(new Intent(this, LightActivity.class));
                break;
            case R.id.ibtn_Warning:
                startActivity(new Intent(this, WarningActivity.class));
                break;
            case R.id.ibtn_traffic:
                startActivity(new Intent(this, PolicActivity.class));
                break;
            case R.id.ibtn_polic:
                startActivity(new Intent(this, TrafficActivity.class));
                break;

        }
    }
}
