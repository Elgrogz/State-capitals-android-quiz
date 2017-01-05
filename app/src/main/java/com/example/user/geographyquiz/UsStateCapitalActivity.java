package com.example.user.geographyquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class UsStateCapitalActivity extends AppCompatActivity {

    private StateCapitalCollection stateCapitalCollection = new StateCapitalCollection();
    private int currentIndex = 0;

    private TextView question;
    private Button buttonCityOne;
    private Button buttonCityTwo;
    private Button buttonCityThree;
    private Button buttonCityFour;

    private void checkAnswer() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_us_state_capital);

        stateCapitalCollection.getQuestionAndAnswer();
        ArrayList<String> questionBank = stateCapitalCollection.fillQuestionBank();
        String cityOne = questionBank.get(0);
        String cityTwo = questionBank.get(1);
        String cityThree = questionBank.get(2);
        String cityFour = questionBank.get(3);

        question = (TextView)findViewById(R.id.question);
        question.setText(stateCapitalCollection.getQuestionToString());

        buttonCityOne = (Button)findViewById(R.id.button_city_one);
        buttonCityOne.setText(cityOne);
        buttonCityOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        buttonCityTwo = (Button)findViewById(R.id.button_city_two);
        buttonCityTwo.setText(cityTwo);
        buttonCityTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        buttonCityThree = (Button)findViewById(R.id.button_city_three);
        buttonCityThree.setText(cityThree);
        buttonCityThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        buttonCityFour = (Button)findViewById(R.id.button_city_four);
        buttonCityFour.setText(cityFour);
        buttonCityFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
