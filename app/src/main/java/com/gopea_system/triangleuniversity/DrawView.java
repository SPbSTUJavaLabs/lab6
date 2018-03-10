package com.gopea_system.triangleuniversity;

import android.content.Context;
import android.graphics.Canvas;
import android.util.Log;
import android.view.View;

import com.gopea_system.triangleuniversity.core.Triangle;

/**
 * Created by Андрей on 10.03.2018.
 */

public class DrawView extends View {
    private Triangle [] triangles;
    public DrawView(Context context, Triangle... triangles) {
        super(context);
        this.triangles = triangles;
    }

    @Override
    public void onDraw(Canvas canvas){
        Log.d("gopea.test","in on Draw");
        for (Triangle triangle:triangles){
            triangle.drawOn(canvas);
        }
    }
}
