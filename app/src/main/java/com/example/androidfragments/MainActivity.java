package com.example.androidfragments;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    View view;
    Button Fragment1, Fragment2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Fragment1 = (Button) findViewById(R.id.firstButton);
        Fragment2 = (Button) findViewById(R.id.secondButton);

// perform setOnClickListener event on First Button
        Fragment1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
// load First Fragment
                loadFragment(new Fragment1());
            }

            private void loadFragment(com.example.androidfragments.Fragment1 fragment1) {
            }
        });
// perform setOnClickListener event on Second Button
       Fragment2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
// load Second Fragment
                loadFragment(new Fragment2());
            }

           private void loadFragment(com.example.androidfragments.Fragment2 fragment2) {
           }
       });

    }

    
    }

    

