package com.by.evgeny07.govore.myhomework;

import android.app.Activity;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.ImageView;

public class Owl extends Activity {
    AnimationDrawable animation_owl;
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_owl);

        ImageView imageView = (ImageView)findViewById(R.id.imageViewOwl);
        imageView.setBackgroundResource(R.drawable.anim_owl);
        animation_owl = (AnimationDrawable) imageView.getBackground();



    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        animation_owl.start();
    }
}
