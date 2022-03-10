package com.example.offlinequizz;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class QuizzResults extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quizz_results);

        final AppCompatButton startNewBtn = findViewById(R.id.startNewQuizzBtn);
        final TextView correctAnswers = findViewById(R.id.correctAnswers);
        final TextView incorrectAnswers = findViewById(R.id.incorrectAnswers);
        final TextView percentage = findViewById(R.id.finalScore);

        final int getCorrectAnswers = getIntent().getIntExtra("correct", 0);
        final int getIncorrectAnswers = getIntent().getIntExtra("incorrect", 0);
        final int finalScoreCalculus = getCorrectAnswers / (getCorrectAnswers + getIncorrectAnswers);

        correctAnswers.setText("Correct Answers : " + String.valueOf(getCorrectAnswers));
        incorrectAnswers.setText("Wrong Answers : " + String.valueOf(getIncorrectAnswers));
        percentage.setText(String.valueOf(finalScoreCalculus) + "%");

        startNewBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(QuizzResults.this, MainActivity.class));
                finish();
            }
        });
    }

    @Override
    public void onBackPressed() {
        startActivity(new Intent(QuizzResults.this, MainActivity.class));
        finish();
    }
}