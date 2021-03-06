package com.example.user.geographyquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class WorldCapitalsActivity extends AppCompatActivity {

    private CapitalCityCollection capitalCityCollection = new CapitalCityCollection();

    private TextView question;
    private String cityOne;
    private String cityTwo;
    private String cityThree;
    private String cityFour;
    private Button buttonCityOne;
    private Button buttonCityTwo;
    private Button buttonCityThree;
    private Button buttonCityFour;
    private Button nextButton;
    private TextView scoreCard;

    private int score = 0;

    private int getScore() {
        return score;
    }

    private void updateQuestion() {
        capitalCityCollection.getQuestionAndAnswer();

        ArrayList<String> questionBank = capitalCityCollection.fillQuestionBank();
        cityOne = questionBank.get(0);
        cityTwo = questionBank.get(1);
        cityThree = questionBank.get(2);
        cityFour = questionBank.get(3);
    }

    private void checkAnswer(String city) {
        if (city.equals(capitalCityCollection.getCurrentCorrectAnswer())) {
            score += 1;
            Toast.makeText(this, "Correct!", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Incorrect!", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_capital_quiz);

        updateQuestion();

        question = (TextView)findViewById(R.id.question);
        question.setText(capitalCityCollection.getQuestionToString());

        buttonCityOne = (Button)findViewById(R.id.button_city_one);
        buttonCityOne.setText(cityOne);
        buttonCityOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkAnswer(cityOne);
            }
        });

        buttonCityTwo = (Button)findViewById(R.id.button_city_two);
        buttonCityTwo.setText(cityTwo);
        buttonCityTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkAnswer(cityTwo);
            }
        });

        buttonCityThree = (Button)findViewById(R.id.button_city_three);
        buttonCityThree.setText(cityThree);
        buttonCityThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkAnswer(cityThree);
            }
        });

        buttonCityFour = (Button)findViewById(R.id.button_city_four);
        buttonCityFour.setText(cityFour);
        buttonCityFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkAnswer(cityFour);
            }
        });

        nextButton = (Button)findViewById(R.id.next_button);
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateQuestion();
                question.setText(capitalCityCollection.getQuestionToString());
                buttonCityOne.setText(cityOne);
                buttonCityTwo.setText(cityTwo);
                buttonCityThree.setText(cityThree);
                buttonCityFour.setText(cityFour);
            }
        });

        scoreCard = (TextView)findViewById(R.id.score_card);
        scoreCard.setText(R.string.scorecard);
    }
}
