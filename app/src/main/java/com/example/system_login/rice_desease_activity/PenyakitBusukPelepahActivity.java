package com.example.system_login.rice_desease_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.system_login.rice_desease_activity.pengendalian.PengendalianBusukPelepahActivity;
import com.example.system_login.R;

public class PenyakitBusukPelepahActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_penyakit_busuk_pelepah);
    }
    public void Pindah(View view){
        Intent intent = new Intent(PenyakitBusukPelepahActivity.this, PengendalianBusukPelepahActivity.class);
        startActivity(intent);
    }
}
