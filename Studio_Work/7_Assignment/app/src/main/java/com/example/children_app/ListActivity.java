package com.example.children_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class ListActivity extends AppCompatActivity {
ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        ArrayList<DataClass> dataClassArrayList = new ArrayList<DataClass>();
        dataClassArrayList.add(new DataClass("One", "1", "i", R.drawable.one));
        dataClassArrayList.add(new DataClass("Two", "2", "ii", R.drawable.two));
        dataClassArrayList.add(new DataClass("Three", "3", "iii", R.drawable.three));
        dataClassArrayList.add(new DataClass("Four", "4", "iv", R.drawable.four));
        dataClassArrayList.add(new DataClass("Five", "5", "v", R.drawable.five));
        dataClassArrayList.add(new DataClass("Six", "6", "vi", R.drawable.six));
        listView = findViewById(R.id.mycustomList);
        MyListViewAdapter listviewAdapter = new MyListViewAdapter(this, dataClassArrayList);
        listView.setAdapter(listviewAdapter);
        listView.setOnItemClickListener((adapterView, view, i, l) -> {
            String text = "You Clicked on Position " + i;
            Toast.makeText(getApplicationContext(),text,Toast.LENGTH_LONG).show();
        });
    }
}