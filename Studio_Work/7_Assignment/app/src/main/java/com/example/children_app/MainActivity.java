package com.example.children_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button RepoBtn, LessonBtn, QuizBtn, ListViewBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RepoBtn = findViewById(R.id.Repobtn);
        LessonBtn = findViewById(R.id.Lessonbtn);
        QuizBtn = findViewById(R.id.Quizbtn);
        ListViewBtn = findViewById(R.id.listviewBtn);
        ListViewBtn.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, ListActivity.class);
            startActivity(intent);
        });
        QuizBtn.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, QuizActivity.class);
            startActivity(intent);
        });
        LessonBtn.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, LessonActivity.class);
            startActivity(intent);
        });
        RepoBtn.setOnClickListener(view -> {
            String webpage = "https://github.com/SyedMajidFareed/Children_App";
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(webpage));
            startActivity(intent);
        });
    }

}