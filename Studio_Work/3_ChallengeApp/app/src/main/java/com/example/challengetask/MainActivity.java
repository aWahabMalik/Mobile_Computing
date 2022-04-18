package com.example.challengetask;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onclickButton(View view) {
        TextView name = findViewById(R.id.nameView);
        TextView username = findViewById(R.id.usernameView);
        TextView email = findViewById(R.id.emailView);

        EditText nameEdit = findViewById(R.id.nameTxt);
        EditText usernameEdit = findViewById(R.id.usernameTxt);
        EditText emailEdit = findViewById(R.id.emailTxt);

        name.setText(nameEdit.getText().toString());
        username.setText(usernameEdit.getText().toString());
        email.setText(emailEdit.getText().toString());

    }
}