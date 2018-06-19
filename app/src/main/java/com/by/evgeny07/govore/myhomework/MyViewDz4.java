package com.by.evgeny07.govore.myhomework;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.text.format.Time;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import java.util.Calendar;

public class MyViewDz4 extends View implements Runnable {
    int minute,hour;
    Calendar calendar;
    Paint colorBelt;
    Paint colorMetal;
    Paint colorCircle;
    Paint colorBackground;
    RectF rectBolt;
    RectF rectBelt;
    RectF rectBackground;

    float radius;

    public MyViewDz4(Context context) {
        super(context);
        init();
    }

    public MyViewDz4(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();

    }

    public MyViewDz4(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();

    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public MyViewDz4(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init();

    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        rectBolt.left = getWidth() * 0.85f;
        rectBolt.right = getWidth() * 0.94f;
        rectBolt.top = getHeight() / 2 * 0.90f;
        rectBolt.bottom = getHeight() / 2 * 1.10f;
        radius = Math.min(getWidth() / 2, getHeight() / 2) * 0.80f;

        rectBelt.left = getWidth() * 0.30f;
        rectBelt.right = getWidth() - rectBelt.left;
        rectBelt.top = 0;
        rectBelt.bottom = getHeight();

        rectBackground.left = 0;
        rectBackground.right = getWidth();
        rectBackground.top = 0;
        rectBackground.bottom = getHeight();
    }

    protected void init() {

        calendar= Calendar.getInstance();
        hour = calendar.get(Calendar.HOUR);
        minute = calendar.get(Calendar.MINUTE);

        rectBolt = new RectF();
        rectBelt = new RectF();
        rectBackground = new RectF();

        colorBelt = new Paint();
        colorBelt.setARGB(255, 112, 70, 8);
        colorBelt.setAntiAlias(true);

        colorCircle = new Paint();
        colorCircle.setColor(Color.WHITE);


        colorMetal = new Paint();
        colorMetal.setColor(Color.GRAY);
        colorMetal.setAntiAlias(true);

        colorBackground = new Paint();
        colorBackground.setColor(Color.BLACK);


    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);



        canvas.drawRect(rectBackground, colorBackground);
        canvas.drawRect(rectBolt, colorMetal);
        canvas.drawRect(rectBelt, colorBelt);
        canvas.drawCircle(getWidth() / 2, getHeight() / 2, radius, colorCircle);
        canvas.drawCircle(getWidth() / 2, getHeight() / 2, radius * 0.9f, colorMetal);

        colorCircle.setTextSize((int) 30 * Resources.getSystem().getDisplayMetrics().density);
        colorCircle.setTextAlign(Paint.Align.CENTER);
        colorCircle.setStrokeWidth((int) 5 * Resources.getSystem().getDisplayMetrics().density);

        canvas.drawText("12", getWidth() / 2, getHeight() / 2 - radius * 0.7f, colorCircle);
        canvas.drawText("6", getWidth() / 2, getHeight() / 2 + radius * 0.78f, colorCircle);
        canvas.drawText("9", getWidth() / 2 - radius * 0.7f, getHeight() / 2, colorCircle);
        canvas.drawText("3", getWidth() / 2 + radius * 0.7f, getHeight() / 2, colorCircle);
            canvas.save();
        for (float i = 0; i < 360; i = i + 30) {


            canvas.drawLine(getWidth()/2, getHeight()/2-radius * 0.9f,
                    getWidth() / 2, getHeight() / 2-radius * 0.8f,
                    colorCircle);

            canvas.rotate(30, getWidth() / 2, getHeight() / 2);


        }
        canvas.restore();


        canvas.rotate((hour+3)*30, getWidth() / 2, getHeight() / 2);

        canvas.drawLine(getWidth()/2, getHeight()/2,
                getWidth() / 2, getHeight() / 2-radius * 0.4f,
                colorCircle);
        canvas.restore();
        canvas.rotate(minute*6, getWidth() / 2, getHeight() / 2);



        canvas.drawLine(getWidth()/2, getHeight()/2,
                getWidth() / 2, getHeight() / 2-radius * 0.65f,
                colorCircle);




    }


    @Override
    public void run() {

    }
}







