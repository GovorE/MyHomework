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
import android.util.AttributeSet;
import android.view.View;

import java.util.Calendar;

public class Watch extends View  {
    int minute,hour;
    Calendar calendar;
    Paint colorBelt;
    Paint gray;
    Paint white;
    Paint colorBackground;
    RectF rectBolt;
    RectF rectBelt;
    RectF rectBackground;

    float radius;

    public Watch(Context context) {
        super(context);
        init();
    }

    public Watch(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();

    }

    public Watch(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();

    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public Watch(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
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

        white = new Paint();
        white.setColor(Color.WHITE);


        gray = new Paint();
        gray.setColor(Color.GRAY);
        gray.setAntiAlias(true);

        colorBackground = new Paint();
        colorBackground.setColor(Color.BLACK);


    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);


        square(canvas);
        circle(canvas);
        text(canvas);

        canvas.save();

        stick(canvas);

        canvas.restore();

        arrow(canvas);







    }

    private void square(Canvas canvas){
        canvas.drawRect(rectBackground, colorBackground);
        canvas.drawRect(rectBolt, gray);
        canvas.drawRect(rectBelt, colorBelt);

    }

    private void circle(Canvas canvas){
        canvas.drawCircle(getWidth() / 2, getHeight() / 2, radius, white);
        canvas.drawCircle(getWidth() / 2, getHeight() / 2, radius * 0.9f, gray);
    }

    private  void text(Canvas canvas) {
        white.setTextSize((int) 30 * Resources.getSystem().getDisplayMetrics().density);
        white.setTextAlign(Paint.Align.CENTER);
        white.setStrokeWidth((int) 5 * Resources.getSystem().getDisplayMetrics().density);

        canvas.drawText("12", getWidth() / 2, getHeight() / 2 - radius * 0.7f, white);
        canvas.drawText("6", getWidth() / 2, getHeight() / 2 + radius * 0.78f, white);
        canvas.drawText("9", getWidth() / 2 - radius * 0.7f, getHeight() / 2, white);
        canvas.drawText("3", getWidth() / 2 + radius * 0.7f, getHeight() / 2, white);
    }

    private void stick(Canvas canvas){
        for (float i = 0; i < 360; i = i + 30) {


            canvas.drawLine(getWidth()/2, getHeight()/2-radius * 0.9f,
                    getWidth() / 2, getHeight() / 2-radius * 0.8f,
                    white);

            canvas.rotate(30, getWidth() / 2, getHeight() / 2);


        }
    }
    private  void arrow(Canvas canvas){
        canvas.rotate((hour+3)*30, getWidth() / 2, getHeight() / 2);

        canvas.drawLine(getWidth()/2, getHeight()/2,
                getWidth() / 2, getHeight() / 2-radius * 0.4f,
                white);
        canvas.restore();
        canvas.rotate(minute*6, getWidth() / 2, getHeight() / 2);



        canvas.drawLine(getWidth()/2, getHeight()/2,
                getWidth() / 2, getHeight() / 2-radius * 0.65f,
                white);
    }
}







