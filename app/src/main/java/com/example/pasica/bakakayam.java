package com.example.pasica;

import androidx.appcompat.app.AppCompatActivity;

import android.app.BackgroundServiceStartNotAllowedException;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class bakakayam extends AppCompatActivity {
    Button btnBakakakayam;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bakakayam);
        btnBakakakayam=(Button) findViewById(R.id.Button_bkka);

        btnBakakakayam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindaBtnBakakayam = new Intent( bakakayam.this,fotobakakakayam.class);
                startActivity(pindaBtnBakakayam);
            }
        });
    }
}