package com.example.pasica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class karedok extends AppCompatActivity {
    Button btnKaredok;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_karedok);
       btnKaredok = (Button) findViewById(R.id.button_karedok);

       btnKaredok.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent pindahBtnKaredok = new Intent(karedok.this,fotokaredok.class);
               startActivity(pindahBtnKaredok);
           }
       });
    }
}