package com.example.android.quizzapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Question6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question6);
    }

    public void nextView(View view) {
        EditText answer = (EditText) findViewById(R.id.answer);

        if (answer.getText().toString().isEmpty()) {
            Toast.makeText(this, "Please enter an answer", Toast.LENGTH_SHORT).show();
        } else {
            if (answer.getText().toString().toUpperCase().equals("3")) {
                MainActivity.score += 1;
            }

            Intent intent = new Intent(this, Question7.class);
            startActivity(intent);
        }
    }
}
