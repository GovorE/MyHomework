package com.by.evgeny07.govore.myhomework;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class dz1 extends AppCompatActivity{
 private    TextView text1;
 private    TextView text2;
 private    Button button1;
 private CharSequence exchange ;
 private Drawable color ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dz1_activity);
        text1=(TextView)findViewById(R.id.textView);
        text2=(TextView)findViewById(R.id.textView2);
        button1=(Button)findViewById(R.id.button);
        final dz1 dz = new dz1();
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                dz.buttonClick();
            }
        });

        text1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                dz.buttonClick();
            }
        });


        text2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                dz.buttonClick();
            }
        });


    }



     private void buttonClick(){
         exchange = text1.getText();
         text1.setText(text2.getText());
         text2.setText(exchange);
         color= text1.getBackground();
         text1.setBackground(text2.getBackground());
         text2.setBackground(color);
     }

}
