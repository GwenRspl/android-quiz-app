package com.example.android.quizzapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;


public class Result extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result);

        TextView commentText = (TextView) findViewById(R.id.comment);
        TextView scoreText = (TextView) findViewById(R.id.score);
        TextView descriptionText = (TextView) findViewById(R.id.description);

        String score = "" + MainActivity.score + "/10";
        scoreText.setText(score);

        if (MainActivity.score == 10) {
            commentText.setText(getString(R.string.excellent));
            descriptionText.setText(getString(R.string.excellent_text));
        } else if (MainActivity.score > 6) {
            commentText.setText(getString(R.string.good));
            descriptionText.setText(getString(R.string.good_text));
        } else if (MainActivity.score > 3) {
            commentText.setText(getString(R.string.average));
            descriptionText.setText(getString(R.string.average_text));
        } else {
            commentText.setText(getString(R.string.bad));
            descriptionText.setText(getString(R.string.bad_text));
        }
    }


    public void nextView(View view) {
        MainActivity.score = 0;
        Intent intent = new Intent(this, Question1.class);
        startActivity(intent);
    }

}
