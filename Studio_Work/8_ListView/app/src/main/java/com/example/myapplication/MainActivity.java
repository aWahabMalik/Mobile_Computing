package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.myList);
        ArrayList<String> friendList = new ArrayList<String>();
        friendList.add("Ali");
        friendList.add("Ahmed");
        friendList.add("Noor");
        friendList.add("Waleed");
        friendList.add("Hamza");

        ArrayAdapter<String> arrayAapter = new ArrayAdapter<String>
                ( this, android.R.layout.simple_expandable_list_item_1, friendList);

        listView.setAdapter(arrayAapter);

    }
}