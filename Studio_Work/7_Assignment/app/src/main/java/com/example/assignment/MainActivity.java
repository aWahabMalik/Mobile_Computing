package com.example.assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void repoClick(View view)
    {
        openWebPage("https://github.com/aWahabMalik/Mobile_Computing");

    }

    public void digitClick(View view)
    {
        switch (view.getId())
        {
            case R.id.b0:
                openActivity("zero");
                break;
            case R.id.b1:
                openActivity("one");
                break;
            case R.id.b2:
                openActivity("two");
                break;
            case R.id.b3:
                openActivity("three");
                break;
            case R.id.b4:
                openActivity("four");
                break;
            case R.id.b5:
                openActivity("five");
                break;
            case R.id.b6:
                openActivity("six");
                break;
            case R.id.b7:
                openActivity("seven");
                break;
            case R.id.b8:
                openActivity("eight");
                break;
            case R.id.b9:
                openActivity("nine");
                break;

        }
    }

    public void openWebPage(String url)
    {
        Uri webpage = Uri.parse(url);
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(intent);
    }

    public void openActivity(String imgNo)
    {
        Intent intent = new Intent(getApplicationContext(), ImgActivity.class);
        intent.putExtra("message_key", imgNo);
        // start the Intent
        startActivity(intent);
    }
}