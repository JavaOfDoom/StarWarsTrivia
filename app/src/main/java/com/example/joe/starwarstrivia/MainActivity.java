package com.example.joe.starwarstrivia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int numberCorrect = 0;
    int questionNumber = 1;
    String missedList = "";

/*
    public void checkAnswers (View view) {
        String correctAnswer = "question" + questionNumber + "_correct_answer";
        while (questionNumber <= 10) {
            if () {
                
            }

        }
    }*/


    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.question1_correct_answer:
                if (checked)
                    // Tosche is the correct answer
                    break;
            case R.id.question1_wrong_answer1:
                if (checked)
                    // Tashee is incorrect
                    break;
            case R.id.question1_wrong_answer2:
                if (checked)
                    // Tosho is incorrect
                    break;
        }
    }

}
