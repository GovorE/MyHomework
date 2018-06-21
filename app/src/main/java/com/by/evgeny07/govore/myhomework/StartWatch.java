package com.by.evgeny07.govore.myhomework;

import android.app.Activity;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class StartWatch extends Activity {







    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new Watch(this));



    }
}




