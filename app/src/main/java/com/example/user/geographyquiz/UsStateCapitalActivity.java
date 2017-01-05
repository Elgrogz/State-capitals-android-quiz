package com.example.user.geographyquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class UsStateCapitalActivity extends AppCompatActivity {

    private StateCapitalCollection stateCapitalCollection = new StateCapitalCollection();
    private int currentIndex = 0;

    private TextView question;
    private Button cityOne;
    private Button cityTwo;
    private Button cityThree;
    private Button cityFour;

    private void checkAnswer() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_us_state_capital);

        stateCapitalCollection.getQuestionAndAnswer();
        stateCapitalCollection.fillQuestionBank();

        question = (TextView)findViewById(R.id.question);
        question.setText(stateCapitalCollection.getQuestionToString());



        cityOne = (Button)findViewById(R.id.button_city_one);
        cityOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });


        cityTwo = (Button)findViewById(R.id.button_city_two);
        cityTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        cityThree = (Button)findViewById(R.id.button_city_three);
        cityThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        cityFour = (Button)findViewById(R.id.button_city_four);
        cityFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
