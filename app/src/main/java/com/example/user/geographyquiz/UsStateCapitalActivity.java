package com.example.user.geographyquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class UsStateCapitalActivity extends AppCompatActivity {

    private StateCapitalCollection stateCapitalCollection = new StateCapitalCollection();
    private int currentIndex = 0;



    private void checkAnswer() {

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_us_state_capital);

        stateCapitalCollection.getQuestionAndAnswer();
        stateCapitalCollection.fillQuestionBank();


    }
}
