package com.example.pasica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class fotonasiliwet extends AppCompatActivity {
    Button btnBackFotonasiliwet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fotonasiliwet);
        btnBackFotonasiliwet=(Button) findViewById(R.id.btn_fotonl);

        btnBackFotonasiliwet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindahBtnFotonasiliwet = new Intent(fotonasiliwet.this,MainActivity.class);
                startActivity(pindahBtnFotonasiliwet);
            }
        });
    }
}