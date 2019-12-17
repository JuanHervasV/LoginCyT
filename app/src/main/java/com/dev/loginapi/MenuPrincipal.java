package com.dev.loginapi;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class MenuPrincipal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_principal);
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnCyT:
                Intent i = new Intent(MenuPrincipal.this, CyTActivity.class);
                startActivity(i);
                break;
            case R.id.btnSinamet:
                Intent e = new Intent(MenuPrincipal.this, SinameActivity.class);
                startActivity(e);
                break;
        }
    }
}
