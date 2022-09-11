package com.example.animation;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView alianImg,all,dora,nobi;
    MediaPlayer sound;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void animation(View view)
    {
        sound=MediaPlayer.create(this,R.raw.doremon);
        sound.start();
        alianImg=findViewById(R.id.alian);
        alianImg.animate().translationXBy(-1600).scaleXBy(-0.5f).setDuration(7000);
        all=findViewById(R.id.all);
        all.animate().setDuration(6000).rotationBy(1600).alpha(0.1f);

    }

   public void flying(View view){
        dora=findViewById(R.id.doremon);
        nobi=findViewById(R.id.nobita);

        dora.animate().translationYBy(-1000).setDuration(5000).scaleXBy(-0.5f).alpha(0.2f).scaleXBy(-0.5f);
       nobi.animate().translationYBy(-1000).setDuration(5000).scaleXBy(-0.5f).alpha(0.2f).scaleXBy(-0.5f);
   }
}