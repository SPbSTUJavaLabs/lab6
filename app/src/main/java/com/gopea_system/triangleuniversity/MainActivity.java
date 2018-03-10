package com.gopea_system.triangleuniversity;

import android.graphics.Paint;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Button;
import android.widget.LinearLayout;

import com.gopea_system.triangleuniversity.core.Point;
import com.gopea_system.triangleuniversity.core.Triangle;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button btn;
    private ConstraintLayout layout;
    private ConstraintLayout.LayoutParams params = new ConstraintLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,
            LinearLayout.LayoutParams.MATCH_PARENT);

    private DrawView view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button) findViewById(R.id.btnCreate);
        layout = (ConstraintLayout) findViewById(R.id.layout);
        btn.setOnClickListener(v -> {
            if (view != null) {
                layout.removeView(view);
            }
            Log.d("gopea.test", "Create are clicked");
            Triangle triangle = generateTriangle();
            view = new DrawView(this, triangle);
            layout.addView(view, params);
        });
    }

    @Override
    protected void onStart() {
        super.onStart();

    }

    private Triangle generateTriangle() {
        Random rand = new Random();
        Point[] points = new Point[3];
        for (int i = 0; i < 3; i++) {
            points[i] = new Point(rand.nextInt(1000), rand.nextInt(1500));
            Log.d("gopea.test", "point " + i + " = (" + points[i].getX() + ", " + points[i].getY() + ")");
        }
        Triangle triangle = new Triangle(points[0], points[1], points[2]);
        Paint paint = new Paint();
        paint.setARGB(55 + rand.nextInt(200), rand.nextInt(225), rand.nextInt(225), rand.nextInt
                (225));
        paint.setStrokeWidth(1 + rand.nextFloat() * 14);
        triangle.setPaint(paint);
        return triangle;
    }
}
