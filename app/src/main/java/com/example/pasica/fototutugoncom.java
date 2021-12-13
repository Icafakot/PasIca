package com.example.pasica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class fototutugoncom extends AppCompatActivity {
    Button btnBackFototutugoncom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fototutugoncom);
        btnBackFototutugoncom=(Button) findViewById(R.id.btn_fotoTo);

        btnBackFototutugoncom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindahBtnFototutugoncom = new Intent(fototutugoncom.this,MainActivity.class);
                startActivity(pindahBtnFototutugoncom);
            }
        });
    }
}