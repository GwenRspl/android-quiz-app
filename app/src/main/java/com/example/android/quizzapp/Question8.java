package com.example.android.quizzapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class Question8 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question8);
    }

    public void nextView(View view) {
        RadioButton rightAnswer = (RadioButton) findViewById(R.id.rightAnswer);
        RadioButton answer1 = (RadioButton) findViewById(R.id.answer1);
        RadioButton answer2 = (RadioButton) findViewById(R.id.answer2);

        if (rightAnswer.isChecked() || answer1.isChecked() || answer2.isChecked()) {
            if (rightAnswer.isChecked()) {
                MainActivity.score += 1;
            }

            Intent intent = new Intent(this, Question9.class);
            startActivity(intent);
        } else {
            Toast.makeText(this, "Please choose an answer", Toast.LENGTH_SHORT).show();
        }

    }
}
