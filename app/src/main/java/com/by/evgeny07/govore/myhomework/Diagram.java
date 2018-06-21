package com.by.evgeny07.govore.myhomework;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.view.View;

import java.util.Random;


public class Diagram extends View {
    Paint paint;
    RectF oval;
    float radius;
    float center_x, center_y;
    public Diagram(Context context) {
        super(context);

    }

    public Diagram(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);

    }

    public Diagram(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public Diagram(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);

    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        radius = Math.min(getWidth() / 2, getHeight() / 2) * 0.80f;
        paint = new Paint();
        paint.setColor(Color.BLACK);
        paint.setStyle(Paint.Style.FILL);
        paint.setTextSize(100f);
        paint.setAntiAlias(true);



        center_x = getWidth() / 2;
        center_y = getHeight() / 2;

        oval = new RectF();
    }

    @Override
    protected void onDraw(Canvas canvas) {







            Diagram(canvas, new int[]{3, 2,4});



    }




    private void Diagram(Canvas canvas, int[] array) {

        Random rnd = new Random();
        int percent;
        int step = 0;
        int sum = 0;

        oval.set(center_x - radius, center_y - radius, center_x + radius,
                center_y + radius);



        for (int i = 0; i <array.length ; i++) {
            sum = sum+array[i];
        }
        percent = 360/sum;
        for (int j = 0; j <array.length ; j++) {
            paint.setARGB(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));

            canvas.drawArc(oval, step,percent*array[j] , true, paint);
            step= percent*array[j]+step;
        }
    }
}






