package com.example.pasica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class fotokaredok extends AppCompatActivity {
    Button btnBackFotokaredok;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fotokaredok);
        btnBackFotokaredok=(Button) findViewById(R.id.btn_fotokaredok);

        btnBackFotokaredok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindahBtnFotokaredok = new Intent(fotokaredok.this,MainActivity.class);
                startActivity(pindahBtnFotokaredok);

            }
        });
    }
}