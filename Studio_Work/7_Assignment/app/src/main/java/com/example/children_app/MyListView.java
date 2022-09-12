package com.example.children_app;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

class MyListViewAdapter extends ArrayAdapter<DataClass>
{

    public MyListViewAdapter(Context context, ArrayList<DataClass> myDataClass)
    {
        super(context, 0, myDataClass);

    }
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent)
    {
        DataClass DClass = getItem(position);
        convertView = LayoutInflater.from(getContext()).inflate(R.layout.customized, parent, false);
        TextView Alphabet =  convertView.findViewById(R.id.AlphabetTextView);
        TextView Digit = convertView.findViewById(R.id.DIgitTextView);
        TextView Roman = convertView.findViewById(R.id.RomantextView);
        ImageView imageView = convertView.findViewById(R.id.imageView7);
        Alphabet.setText(DClass.getAlphabet());
        Digit.setText(DClass.getDigit());
        Roman.setText(DClass.getRoman());
        imageView.setImageResource(DClass.getImgId());
        return convertView;
    }

}
