package com.example.app2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class Alphabets extends AppCompatActivity {

    TextView tv;
    ImageButton ib;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabets);
        tv=findViewById(R.id.textView);
        ib=findViewById(R.id.sharepic6);
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition( R.anim.slide_left_other,R.anim.slide_right_other);
    }

    public void goMenu(View view) {
        Intent intent = new Intent(Alphabets.this,MainActivity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_left_other,R.anim.slide_right_other);
    }

    public void changeAlphabet(View view) {
        char value=tv.getText().toString().charAt(0);
        if(value>=65 && value<=90)
        {
            value+=32;
            ib.setBackgroundResource(R.drawable.rounded_button);
            ib.setRotation(0);
            ib.animate().rotation(180).setDuration(100);
        }
        else
        {
            value-=32;
            ib.setBackgroundResource(R.drawable.rounded_button_2);
            ib.setRotation(0);
            ib.animate().rotation(180).setDuration(100);
        }
        ib.clearAnimation();
        tv.setText(String.valueOf(value));

    }

    public void decrement(View view) {
        char value=tv.getText().toString().charAt(0);
        if(value==65)
            value=90;
        else if(value>65 && value<=90)
            value--;
        else if(value==97)
            value=122;
        else if(value>97 && value<=122)
            value--;
        tv.setText(String.valueOf(value));
    }

    public void increment(View view) {
        char value=tv.getText().toString().charAt(0);
        if(value==90)
            value=65;
        else if(value>=65 && value<90)
            value++;
        else if(value==122)
            value=97;
        else if(value>=97 && value<122)
            value++;
        tv.setText(String.valueOf(value));
    }
}