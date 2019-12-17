package com.dev.loginapi;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class CyTActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cy_t);
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.cerrar_sesion:
                Intent i = new Intent(CyTActivity.this, LoginActivity.class);
                startActivity(i);
                break;
        }
    }
}
