package com.example.sept5;

import android.graphics.Color;
import android.graphics.Paint;
import android.view.SurfaceView;
import android.content.Context;
import android.util.AttributeSet;
import android.graphics.Canvas;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

public class MySurfaceView extends SurfaceView {
    //private int radius;

    public MySurfaceView(Context context, AttributeSet attrs)
    {
        super(context, attrs);

        //Tell android to call my draw function, so I can actually draw something
        setWillNotDraw(false); // #IMPORTANT double negative
        //radius = 0;
    }

    public void onDraw(Canvas canvas)
    {
        Paint paint = new Paint();
        paint.setColor(Color.BLUE);
        //paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(5.0f);

        canvas.drawRect(20,20,10,10, paint);

        Bitmap theImg = BitmapFactory.decodeResource(getResources(), com.example.sept10.R.drawable.myimage);
        canvas.drawBitmap(theImg, 10, 10, null);
    }

    //public void setRadius(int radius)
    //{
    //   radius = r;
    //    invalidate();
    //    Log.i("mySurfaceview.setRadius", "I just set the radius");
    //}

}
