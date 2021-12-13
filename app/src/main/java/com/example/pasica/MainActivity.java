package com.example.pasica;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import de.hdodenhof.circleimageview.CircleImageView;

public class MainActivity extends AppCompatActivity {
    CircleImageView imgBakakakayam,imgNasiliwet,imgTutugoncom,imgKaredok;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imgBakakakayam = (CircleImageView) findViewById(R.id.bakak_ayam);
        imgNasiliwet = (CircleImageView) findViewById(R.id.nasi_liwet);
        imgTutugoncom = (CircleImageView) findViewById(R.id.to);
        imgKaredok = (CircleImageView) findViewById(R.id.karedok);

        imgBakakakayam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindahBakakakayam = new Intent(MainActivity.this, bakakayam.class);
                startActivity(pindahBakakakayam);
            }
        });
        imgNasiliwet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindahNasiliwet = new Intent(MainActivity.this, nasiliwet.class);
                startActivity(pindahNasiliwet);
            }
        });
        imgTutugoncom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindahTutugoncom = new Intent(MainActivity.this, nasito.class);
                startActivity(pindahTutugoncom);
            }
        });

        imgKaredok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindahKaredok = new Intent(MainActivity.this, karedok.class);
                startActivity(pindahKaredok);
            }
        });

    }}