package com.gopea_system.triangleuniversity.core;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.annotation.NonNull;

/**
 * Created by Андрей on 09.03.2018.
 */

public class Triangle {
    private Point[] points = new Point[3];
    //private Canvas canvas;

    public Triangle(@NonNull Point a, @NonNull Point b, @NonNull Point c) {
        points[0] = a;
        points[1] = b;
        points[2] = c;
    }

    public Canvas draw(Canvas canvas) {
        Paint paint = new Paint();
        for (int i = 0; i < 2; i++) {
            canvas.drawLine(points[i].getX(), points[i].getY(), points[i + 1].getX(), points[i +
                    1].getY(), paint);
        }
        canvas.drawLine(points[0].getX(), points[0].getY(), points[2].getX(), points[2]
                .getY(), paint);
        return canvas;
    }
}
