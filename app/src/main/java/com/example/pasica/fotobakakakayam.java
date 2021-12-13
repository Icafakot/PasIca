package com.example.pasica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class fotobakakakayam extends AppCompatActivity {
    Button btnBackFotobakakakyam;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fotobakakakayam);
        btnBackFotobakakakyam=(Button) findViewById(R.id.btn_fotobkka);

        btnBackFotobakakakyam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindahBtnFotobakakakayam = new Intent(fotobakakakayam.this,MainActivity.class);
                startActivity(pindahBtnFotobakakakayam);
            }
        });
    }
}