package com.example.viewflipper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button previous, next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        previous = findViewById(R.id.previousButton);
        next = findViewById(R.id.nextButton);
        previous.setOnClickListener(this);
        next.setOnClickListener(this);
    }

    public void onClick(View v) {
        ViewFlipper viewFlipper = findViewById(R.id.imageViewFlipper);

        if(v == previous) {
            viewFlipper.showPrevious();
        }
        else if(v == next) {
            viewFlipper.showNext();
        }
    }
}