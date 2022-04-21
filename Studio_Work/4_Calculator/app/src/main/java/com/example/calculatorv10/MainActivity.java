package com.example.calculatorv10;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    boolean isOperatorcalled = false;
    boolean newOp = true;
    String operation = "";
    String lastNum = "";
    TextView finalres;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        finalres = findViewById(R.id.finalAns);
    }

    //Number Clicked
    public void numberClick(View view){
        if(newOp){
            finalres.setText("");
        }
        newOp = false;
        String number = finalres.getText().toString();


        switch(view.getId())
        {
            case R.id.b0:
                number += "0";
                break;
            case R.id.b1:
                number += "1";
                break;
            case R.id.b2:
                number += "2";
                break;
            case R.id.b3:
                number += "3";
                break;
            case R.id.b4:
                number += "4";
                break;
            case R.id.b5:
                number += "5";
                break;
            case R.id.b6:
                number += "6";
                break;
            case R.id.b7:
                number += "7";
                break;
            case R.id.b8:
                number += "8";
                break;
            case R.id.b9:
                number += "9";
                break;
            case R.id.bDot:
                number += ".";
                break;
        }
        finalres.setText(number);
    }

    //operator Clicked
    public void operatorClick(View view){
        newOp = true;
        switch (view.getId()){
            case R.id.bPlus:
                operation = "+";
                break;
            case R.id.bMinus:
                operation = "-";
                break;
            case R.id.bMul:
                operation = "*";
                break;
            case R.id.bDiv:
                operation = "/";
                break;
        }
        lastNum = finalres.getText().toString();
        finalres.setText("");
    }

    //Equal Clicked
    public void equalClicked(View view){
        String num = finalres.getText().toString();
        double lastNumber = Double.parseDouble(lastNum);
        double currentNumber = Double.parseDouble(num);
        double result = 0.0;
        switch (operation){
            case "+":
                result = lastNumber + currentNumber;
                break;
            case "-":
                result = lastNumber - currentNumber;
                break;
            case "*":
                result = lastNumber * currentNumber;
                break;
            case "/":
                result = lastNumber / currentNumber;
                break;
        }
        finalres.setText(String.valueOf(result));
        newOp = true;
    }
}