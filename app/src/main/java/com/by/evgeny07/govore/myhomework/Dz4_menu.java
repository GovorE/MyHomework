package com.by.evgeny07.govore.myhomework;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;

public class Dz4_menu extends Activity {


    private    Button watch;
    private    Button owl;
    private    Button diagram;
    public  Intent intent;

    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dz4_menu);
        watch=(Button)findViewById(R.id.watch);
        owl=(Button)findViewById(R.id.owl);
        diagram=(Button)findViewById(R.id.diagram);

        watch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent= new Intent(Dz4_menu.this,StartWatch.class);
                startActivity(intent);
                overridePendingTransition(R.anim.diagonaltranslate,R.anim.alpha);
            }
        });

        owl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent= new Intent(Dz4_menu.this,Owl.class);
                startActivity(intent);
                overridePendingTransition(R.anim.diagonaltranslate,R.anim.alpha);
            }
        });

        diagram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                intent= new Intent(Dz4_menu.this,StartDiagram.class);
                startActivity(intent);
                overridePendingTransition(R.anim.diagonaltranslate,R.anim.alpha);
            }
        });

    }
}
