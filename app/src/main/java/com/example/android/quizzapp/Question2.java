package com.example.android.quizzapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class Question2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question2);
    }

    public void nextView(View view) {
        CheckBox answer1 = (CheckBox) findViewById(R.id.answer1);
        CheckBox answer2 = (CheckBox) findViewById(R.id.answer2);
        CheckBox answer3 = (CheckBox) findViewById(R.id.answer3);
        CheckBox answer4 = (CheckBox) findViewById(R.id.answer4);
        CheckBox answer5 = (CheckBox) findViewById(R.id.answer5);
        CheckBox answer6 = (CheckBox) findViewById(R.id.answer6);

        if (answer1.isChecked() || answer2.isChecked() || answer3.isChecked() || answer4.isChecked
                () || answer5.isChecked() || answer6.isChecked()) {
            if (answer1.isChecked() && answer2.isChecked() && answer3.isChecked()) {
                MainActivity.score += 1;
            }
            Intent intent = new Intent(this, Question3.class);
            startActivity(intent);
        } else {
            Toast.makeText(this, "Please choose an answer", Toast.LENGTH_SHORT).show();
        }
    }
}
