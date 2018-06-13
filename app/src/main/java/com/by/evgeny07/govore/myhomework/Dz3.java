package com.by.evgeny07.govore.myhomework;

import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;
import com.squareup.picasso.Transformation;

public class Dz3 extends Activity {
    Button button;
    TextView buildText;
    ImageView image;
    String urlApple;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dz3);
        urlApple = getString(R.string.imageApple);
        buildText=(TextView)findViewById(R.id.buildText);
        button=(Button)findViewById(R.id.button);
        image=(ImageView)findViewById(R.id.imageView);



        buildText.setText( BuildConfig.BANK_NAME);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Picasso.get().load(urlApple).placeholder(R.drawable.ic_wait__24dp).error(R.drawable.ic_error_24dp). transform(new Circular(400)).into(image);
            }
        });


    }
}


