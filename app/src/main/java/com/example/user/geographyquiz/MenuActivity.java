package com.example.user.geographyquiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by user on 06/01/2017.
 */
public class MenuActivity extends AppCompatActivity{

    private Button stateCapitals;
    private Button worldCapitals;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_activity);

        stateCapitals = (Button)findViewById(R.id.state_capitals);
        stateCapitals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this, UsStateCapitalActivity.class);
                startActivity(intent);
            }
        });

        worldCapitals = (Button)findViewById(R.id.world_capitals);
        worldCapitals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this, WorldCapitalsActivity.class);
                startActivity(intent);
            }
        });
    }

}
