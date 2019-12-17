package com.dev.loginapi;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SinameActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sinamet);
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.cerrar_sesion:
                Intent i = new Intent(SinameActivity.this, LoginActivity.class);
                startActivity(i);
                break;
        }
    }

}
