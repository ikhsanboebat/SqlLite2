package com.example.sqllite2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick1(View v){
        Intent lihat_data = new Intent(MainActivity.this,list_data.class);
        startActivity(lihat_data);
    }

    public void onClick2(View v){
        Intent input_data = new Intent(MainActivity.this,input_data.class);
        startActivity(input_data);
    }
}

