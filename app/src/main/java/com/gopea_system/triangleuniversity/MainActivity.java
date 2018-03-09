package com.gopea_system.triangleuniversity;

import android.graphics.Canvas;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.SurfaceView;
import android.widget.Button;

import com.gopea_system.triangleuniversity.core.Point;
import com.gopea_system.triangleuniversity.core.Triangle;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private SurfaceView view;
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        view = (SurfaceView) findViewById(R.id.surfaceView);
        btn = (Button) findViewById(R.id.btnCreate);
        btn.setOnClickListener(v -> {
            Random random = new Random();
            Canvas canvas = new Canvas();
            Point[] points = new Point[3];
            for (int i = 0; i < 3; i++) {
                points[i] = new Point(random.nextInt(200), random.nextInt(300));
            }
            Triangle triangle = new Triangle(points[0],points[1],points[2]);
            triangle.draw(canvas);
            view.draw(canvas);
        });
    }

    @Override
    protected void onStart() {
        super.onStart();

    }
}
