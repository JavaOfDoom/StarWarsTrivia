package com.example.joe.starwarstrivia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    RadioGroup question1_answers;
    CheckBox question2_answer1;
    CheckBox question2_answer2;
    CheckBox question2_answer3;
    CheckBox question2_answer4;
    CheckBox question2_answer5;
    CheckBox question2_answer6;
    CheckBox question2_answer7;
    CheckBox question2_answer8;
    EditText question3_answers;
    RadioGroup question4_answers;
    RadioGroup question5_answers;
    RadioGroup question6_answers;
    EditText question7_answers;
    RadioGroup question8_answers;
    RadioGroup question9_answers;
    RadioGroup question10_answers;
    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        question1_answers = findViewById(R.id.question1);
        question2_answer1 = findViewById(R.id.question2_right_answer1);
        question2_answer2 = findViewById(R.id.question2_wrong_answer1);
        question2_answer3 = findViewById(R.id.question2_wrong_answer2);
        question2_answer4 = findViewById(R.id.question2_wrong_answer3);
        question2_answer5 = findViewById(R.id.question2_wrong_answer4);
        question2_answer6 = findViewById(R.id.question2_wrong_answer5);
        question2_answer7 = findViewById(R.id.question2_right_answer2);
        question2_answer8 = findViewById(R.id.question2_wrong_answer6);
        question3_answers = findViewById(R.id.question3_answer);
        question4_answers = findViewById(R.id.question4);
        question5_answers = findViewById(R.id.question5);
        question6_answers = findViewById(R.id.question6);
        question7_answers = findViewById(R.id.question7_answer);
        question8_answers = findViewById(R.id.question8);
        question9_answers = findViewById(R.id.question9);
        question10_answers = findViewById(R.id.question10);
    }

    public void answerCheck(View view) {
        String question_one = getRadioGroupAnswer(question1_answers.getCheckedRadioButtonId());
        String question_four = getRadioGroupAnswer(question4_answers.getCheckedRadioButtonId());
        String question_five = getRadioGroupAnswer(question5_answers.getCheckedRadioButtonId());
        String question_six = getRadioGroupAnswer(question6_answers.getCheckedRadioButtonId());
        String question_eight = getRadioGroupAnswer(question8_answers.getCheckedRadioButtonId());
        String question_nine = getRadioGroupAnswer(question9_answers.getCheckedRadioButtonId());
        String question_ten = getRadioGroupAnswer(question10_answers.getCheckedRadioButtonId());

        if (question_one.equals(getString(R.string.question_one_correct_answer))) {
            score += 1;
        }

        if (question2_answer1.isChecked() && question2_answer7.isChecked()
                && !question2_answer2.isChecked() && !question2_answer3.isChecked()
                && !question2_answer4.isChecked() && !question2_answer5.isChecked()
                && !question2_answer6.isChecked() && !question2_answer8.isChecked()) {
            score += 1;
        }

        String answerQuestion3 = question3_answers.getText().toString();
        if (answerQuestion3.toLowerCase().equals("blue")) {
            score += 1;
        }

        if (question_four.equals(getString(R.string.question_four_correct_answer))) {
            score += 1;
        }

        if (question_five.equals(getString(R.string.question_five_correct_answer))) {
            score += 1;
        }

        if (question_six.equals(getString(R.string.question_six_correct_answer))) {
            score += 1;
        }

        String answerQuestion7 = question7_answers.getText().toString();
        if (answerQuestion7.toLowerCase().equals("gamorrean")) {
            score += 1;
        }

        if (question_eight.equals(getString(R.string.question_eight_correct_answer))) {
            score += 1;
        }

        if (question_nine.equals(getString(R.string.question_nine_correct_answer))) {
            score += 1;
        }

        if (question_ten.equals(getString(R.string.question_ten_correct_answer))) {
            score += 1;
        }

        resultsToast();

    }

    private String getRadioGroupAnswer(int id) {
        // Handle the case where the user did not make a choice
        if (id != -1) {
            RadioButton getSelectedRadioButton = findViewById(id);
            return getSelectedRadioButton.getText().toString();
        } else {
            // the user did not choose an answer, return an empty string
            return "";
        }
    }

    private void resultsToast() {
        if (score == 10) {
            String winningToast = getString(R.string.win_message);
            Toast.makeText(this, winningToast, Toast.LENGTH_LONG).show();
        } else {
            String losingToast = getString(R.string.lose_message);
            Toast.makeText(this, losingToast, Toast.LENGTH_LONG).show();
        }

        resetScore();
    }

    private void resetScore() {
        score = 0;
    }

}
