package com.example.alson.mathx;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Secondary_Education extends AppCompatActivity {
    private ImageButton b;
    private ImageButton a;
    private Button c;
    private Button d;
    private ImageButton e;
    private ImageButton f;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondary__education);

        f = (ImageButton) findViewById(R.id.imageButton4);
        f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent t = new Intent(Secondary_Education.this,Secondary_Four.class);
                startActivity(t);
            }
        });

        e = (ImageButton) findViewById(R.id.imageButton3);
        e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent r = new Intent(Secondary_Education.this,Secondary_Three.class);
                startActivity(r);
            }
        });

        d = (Button) findViewById(R.id.button18);
        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent w = new Intent(Secondary_Education.this,Notes.class);
                startActivity(w);
            }
        });
        c = (Button) findViewById(R.id.button19);
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent q = new Intent(Secondary_Education.this,Tools.class);
                startActivity(q);
            }
        });
        a = (ImageButton) findViewById(R.id.imageButton2);
        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent p = new Intent(Secondary_Education.this,Secondary_Two.class);
                startActivity(p);
            }
        });
        b = (ImageButton) findViewById(R.id.imageButton);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Secondary_Education.this,Secondary_One.class);
                startActivity(i);
            }
        });

    }
}
