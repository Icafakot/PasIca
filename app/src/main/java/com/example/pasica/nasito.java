package com.example.pasica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class nasito extends AppCompatActivity {
    Button btnNasito;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nasito);
        btnNasito =(Button) findViewById(R.id.button_to);

        btnNasito.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindahBtnNasito = new Intent(nasito.this,fototutugoncom.class);
                startActivity(pindahBtnNasito);
            }
        });
    }
}