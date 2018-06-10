package com.by.evgeny07.govore.myhomework;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;

public class Menu extends Activity {
    private    Button button_dz1;
    private    Button button_dz2;
    private    Button button_dz3;
    private    Button button_dz4;
    public  Intent intent;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        button_dz1=(Button)findViewById(R.id.button1);
        button_dz2=(Button)findViewById(R.id.button2);


        button_dz1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               activityDZ1();


            }
        });

        button_dz2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                activityDZ2();
               }
        });


    }

    public void activityDZ1(){
        intent= new Intent(Menu.this,Dz1.class);
        startActivity(intent);
    }

    public void activityDZ2(){
        intent= new Intent(Menu.this,Dz2.class);
        startActivity(intent);
    }
}
