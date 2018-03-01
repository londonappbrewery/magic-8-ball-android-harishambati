package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       final ImageView image =findViewById(R.id.cap);
       final int[] array=new int[]{R.drawable.antmanlogo,
                R.drawable.bpanther,
                R.drawable.cap,
                R.drawable.superlogo,
                R.drawable.wolverine,
                R.drawable.wonderwoman,
                R.drawable.flash};
        Button noobbutton =findViewById(R.id.noobbutton);

        noobbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Random rndnmbr = new Random();
                int harish =rndnmbr.nextInt(5);
                image.setImageResource(array[harish]);
            }
        });


    }






}




