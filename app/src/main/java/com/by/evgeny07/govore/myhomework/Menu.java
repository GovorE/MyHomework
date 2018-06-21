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
    private    Button button_dz5;
    public  Intent intent;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        button_dz1=(Button)findViewById(R.id.button1);
        button_dz2=(Button)findViewById(R.id.button2);
        button_dz3=(Button)findViewById(R.id.button3);
        button_dz4=(Button)findViewById(R.id.button4);
        button_dz5=(Button)findViewById(R.id.button5);


        button_dz5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                activityDZ5();
            }
        });
        button_dz4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                activityDZ4();
            }
        });

        button_dz3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                activityDZ3();
            }
        });



        button_dz2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                activityDZ2();
            }
        });

        button_dz1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               activityDZ1();


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

    public void activityDZ3(){
        intent= new Intent(Menu.this,Dz3.class);
        startActivity(intent);
    }

    public void activityDZ4(){
        intent= new Intent(Menu.this,Dz4_menu.class);
        startActivity(intent);
    }

    public void activityDZ5(){
        intent= new Intent(Menu.this,Owl.class);
        startActivity(intent);
    }
}
