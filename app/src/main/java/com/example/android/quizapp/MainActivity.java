package com.example.android.quizapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitAnswer(View view) {
        RadioButton radioButtonQuiz1 = (RadioButton) findViewById(R.id.option_3_quiz_1_radio);
        boolean answerQuiz1 = radioButtonQuiz1.isChecked();
        if (answerQuiz1) {
            score++;
        }

        RadioButton radioButtonQuiz2 = (RadioButton) findViewById(R.id.option_4_quiz_2_radio);
        boolean answerQuiz2 = radioButtonQuiz2.isChecked();
        if (answerQuiz2) {
            score++;
        }

        RadioButton radioButtonQuiz3 = (RadioButton) findViewById(R.id.option_1_quiz_3_radio);
        boolean answerQuiz3 = radioButtonQuiz3.isChecked();
        if (answerQuiz3) {
            score++;
        }

        RadioButton radioButtonQuiz4 = (RadioButton) findViewById(R.id.option_1_quiz_4_radio);
        boolean answerQuiz4 = radioButtonQuiz4.isChecked();
        if (answerQuiz4) {
            score++;
        }

        RadioButton radioButtonQuiz5 = (RadioButton) findViewById(R.id.option_4_quiz_5_radio);
        boolean answerQuiz5 = radioButtonQuiz5.isChecked();
        if (answerQuiz5) {
            score++;
        }

        RadioButton radioButtonQuiz6 = (RadioButton) findViewById(R.id.option_3_quiz_6_radio);
        boolean answerQuiz6 = radioButtonQuiz6.isChecked();
        if (answerQuiz6) {
            score++;
        }

        RadioButton radioButtonQuiz7 = (RadioButton) findViewById(R.id.option_2_quiz_7_radio);
        boolean answerQuiz7 = radioButtonQuiz7.isChecked();
        if (answerQuiz7) {
            score++;
        }

        RadioButton radioButtonQuiz8 = (RadioButton) findViewById(R.id.option_1_quiz_8_radio);
        boolean answerQuiz8 = radioButtonQuiz8.isChecked();
        if (answerQuiz8) {
            score++;
        }

        CheckBox checkBoxQuizOption1 = (CheckBox) findViewById(R.id.option_1_quiz_9);
        boolean answerQuizOption1 = checkBoxQuizOption1.isChecked();

        CheckBox checkBoxQuizOption2 = (CheckBox) findViewById(R.id.option_2_quiz_9);
        boolean answerQuizOption2 = checkBoxQuizOption2.isChecked();

        CheckBox checkBoxQuizOption3 = (CheckBox) findViewById(R.id.option_3_quiz_9);
        boolean answerQuizOption3 = checkBoxQuizOption3.isChecked();

        CheckBox checkBoxQuizOption4 = (CheckBox) findViewById(R.id.option_4_quiz_9);
        boolean answerQuizOption4 = checkBoxQuizOption4.isChecked();
        if (answerQuizOption1 && answerQuizOption2 && answerQuizOption3 && answerQuizOption4) {
            score++;
        }

        EditText editTextQuiz = (EditText) findViewById(R.id.option_quiz_10);
        String answerQuiz10 = editTextQuiz.getText().toString();

        if (answerQuiz10.equalsIgnoreCase("Nil")) {
            score++;
        }

        Toast.makeText(this, "Your final score is " + score, Toast.LENGTH_SHORT).show();

        score = 0;
    }
}
