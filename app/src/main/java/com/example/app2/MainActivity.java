package com.example.app2;

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


    public void startLearning(View view) {
        Intent intent = new Intent(MainActivity.this,Alphabets.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_right, R.anim.slide_left);
    }

    public void goAbout(View view) {
        Intent intent = new Intent(MainActivity.this,About.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_right, R.anim.slide_left);
    }
}