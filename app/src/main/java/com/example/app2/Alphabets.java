package com.example.app2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class Alphabets extends AppCompatActivity {

    TextView tv;
    ImageButton ib;
    MediaPlayer mp;
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

    public void voice(View view) {
        char value=tv.getText().toString().charAt(0);
        if(value>=65&&value<=90)
            value-=65;
        else
            value-=97;
        if(value==0)
        {
            mp=MediaPlayer.create(this,R.raw.a);
            mp.start();
        }
        else if(value==1)
        {
            mp=MediaPlayer.create(this,R.raw.b);
            mp.start();
        }
        else if(value==2)
        {
            mp=MediaPlayer.create(this,R.raw.c);
            mp.start();
        }
        else if(value==3)
        {
            mp=MediaPlayer.create(this,R.raw.d);
            mp.start();
        }
        else  if(value==4)
        {
            mp=MediaPlayer.create(this,R.raw.e);
            mp.start();
        }
        else if(value==5)
        {
            mp=MediaPlayer.create(this,R.raw.f);
            mp.start();
        }
        else if(value==6)
        {
            mp=MediaPlayer.create(this,R.raw.g);
            mp.start();
        }
        else if(value==7)
        {
            mp=MediaPlayer.create(this,R.raw.h);
            mp.start();
        }
        else if(value==8)
        {
            mp=MediaPlayer.create(this,R.raw.i);
            mp.start();
        }
        else if(value==9)
        {
            mp=MediaPlayer.create(this,R.raw.j);
            mp.start();
        }
        else if(value==10)
        {
            mp=MediaPlayer.create(this,R.raw.k);
            mp.start();
        }
        else if(value==11)
        {
            mp=MediaPlayer.create(this,R.raw.l);
            mp.start();
        }
        else if(value==12)
        {
            mp=MediaPlayer.create(this,R.raw.m);
            mp.start();
        }
        else if(value==13)
        {
            mp=MediaPlayer.create(this,R.raw.n);
            mp.start();
        }
        else if(value==14)
        {
            mp=MediaPlayer.create(this,R.raw.o);
            mp.start();
        }
        else if(value==15)
        {
            mp=MediaPlayer.create(this,R.raw.p);
            mp.start();
        }
        else if(value==16)
        {
            mp=MediaPlayer.create(this,R.raw.q);
            mp.start();
        }
        else if(value==17)
        {
            mp=MediaPlayer.create(this,R.raw.r);
            mp.start();
        }
        else if(value==18)
        {
            mp=MediaPlayer.create(this,R.raw.s);
            mp.start();
        }
        else if(value==19)
        {
            mp=MediaPlayer.create(this,R.raw.t);
            mp.start();
        }
        else if(value==20)
        {
            mp=MediaPlayer.create(this,R.raw.u);
            mp.start();
        }
        else if(value==21)
        {
            mp=MediaPlayer.create(this,R.raw.v);
            mp.start();
        }
        else if(value==22)
        {
            mp=MediaPlayer.create(this,R.raw.w);
            mp.start();
        }
        else if(value==23)
        {
            mp=MediaPlayer.create(this,R.raw.x);
            mp.start();
        }
        else if(value==24)
        {
            mp=MediaPlayer.create(this,R.raw.y);
            mp.start();
        }
        else if(value==25)
        {
            mp = MediaPlayer.create(this, R.raw.z);
            mp.start();
        }

    }
}