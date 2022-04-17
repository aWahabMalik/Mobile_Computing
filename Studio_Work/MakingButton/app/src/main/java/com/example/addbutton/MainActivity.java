package com.example.addbutton;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onclickButton(View view){
        TextView textView = findViewById(R.id.textView);
        TextView textView2 = findViewById(R.id.txtEnterName);
        textView.setText("Hello " + textView2.getText().toString());
    }
}