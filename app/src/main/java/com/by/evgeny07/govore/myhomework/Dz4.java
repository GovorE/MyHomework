package com.by.evgeny07.govore.myhomework;

import android.app.Activity;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class Dz4 extends Activity{

    private AnimationDrawable animationDrawable = null;
    private final static int DURATION = 250;
    private ImageView imageView;

    ImageView owl1;
    int i;
    ImageView owl2;
    ImageView owl3;

    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new MyViewDz4(this));
        imageView = findViewById(R.id.imageView);
        startFrameAnimation();


}

  private void   startFrameAnimation(){
      BitmapDrawable owl1 =
              (BitmapDrawable)getResources().getDrawable(R.drawable.sova_anmation_1);
      BitmapDrawable owl2 =
              (BitmapDrawable)getResources().getDrawable(R.drawable.sova_anmation_2);
      BitmapDrawable owl3 =
      (BitmapDrawable)getResources().getDrawable(R.drawable.sova_anmation_3);
      AnimationDrawable animation = new AnimationDrawable();
      animation.setOneShot(false);
      animation.addFrame(owl1, DURATION);
      animation.addFrame(owl2, DURATION);
      animation.addFrame(owl3, DURATION);
  }

  private  void   stopFrameAnimation(){}

    }


