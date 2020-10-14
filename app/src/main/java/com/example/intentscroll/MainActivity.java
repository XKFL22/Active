package com.example.intentscroll;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button tombol = findViewById(R.id.tombol);
        tombol.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.tombol:
                Intent pindahIntent = new Intent(MainActivity.this, Activity2.class);
                startActivities(new Intent[]{pindahIntent});
                break;
        }

    }



}