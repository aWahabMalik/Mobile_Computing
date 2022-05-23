package com.example.assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class ImgActivity extends AppCompatActivity {
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_img);

        Intent intent = getIntent();
        imageView = findViewById(R.id.imageView2);
        // receive the value by getStringExtra() method
        // and key must be same which is send by first activity
        String str = intent.getStringExtra("message_key");

        switch (str)
        {
            case "zero":
                imageView.setImageResource(R.drawable.n0);
                break;
            case "one":
                imageView.setImageResource(R.drawable.n1);
                break;
            case "two":
                imageView.setImageResource(R.drawable.n2);
                break;
            case "three":
                imageView.setImageResource(R.drawable.n3);
                break;
            case "four":
                imageView.setImageResource(R.drawable.n4);
                break;
            case "five":
                imageView.setImageResource(R.drawable.n5);
                break;
            case "six":
                imageView.setImageResource(R.drawable.n6);
                break;
            case "seven":
                imageView.setImageResource(R.drawable.n7);
                break;
            case "eight":
                imageView.setImageResource(R.drawable.n8);
                break;
            case "nine":
                imageView.setImageResource(R.drawable.n9);
                break;
        }
    }
}