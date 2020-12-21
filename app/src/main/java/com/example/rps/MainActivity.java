package com.example.rps;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        //define which button P1 pressed
        final Button buttonp1rock = findViewById(R.id.p1rock);
        buttonp1rock.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
               int position1 = Integer.parseInt(v.getTag().toString());
                proceed(0, position1);
            }
        });
        final Button buttonp1scissor = findViewById(R.id.p1scissor);
        buttonp1scissor.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                 int position1 = Integer.parseInt(v.getTag().toString());
                proceed(0, position1);
            }
        });
        final Button buttonp1paper = findViewById(R.id.p1paper);
        buttonp1paper.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                int position1 = Integer.parseInt(v.getTag().toString());
                proceed(0, position1);
            }
        });


        //define which button P2 pressed
        final Button buttonp2rock = findViewById(R.id.p2rock);
        buttonp2rock.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                int position2 = Integer.parseInt(v.getTag().toString());
                proceed(1, position2);
            }
        });
        final Button buttonp2scissor = findViewById(R.id.p2scissor);
        buttonp2scissor.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                int position2 = Integer.parseInt(v.getTag().toString());
                proceed(1, position2);
            }
        });

        final Button buttonp2paper = findViewById(R.id.p2paper);
        buttonp2paper.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                 int position2 = Integer.parseInt(v.getTag().toString());
                 proceed(1, position2);
            }
        });


    }
    int [][] gamematch = { {2,5}, {2,5}};
    private void proceed(int player ,int value) {
        final TextView textOutput = findViewById(R.id.textView);
        gamematch[player][0] = player;
        gamematch[player][1] = value;
        if (gamematch[0][0] != 2 && gamematch[1][0] != 2) {
            //rock =1 ; scissor =2; paper= 3
            // Rock beats scissors – scissors beats paper – paper beats rock
            if (gamematch[0][1] == gamematch[1][1]){
                textOutput.setText("Withdraw!");
            }
           else if(gamematch[0][1] == 3 && gamematch[1][1] ==2){
                textOutput.setText("Game 2 Won!");
            }
            else if(gamematch[0][1] == 3 && gamematch[1][1] ==1){
                textOutput.setText("Game 1 Won!");
            }
            else if(gamematch[0][1] == 2 && gamematch[1][1] ==1){
                textOutput.setText("Game 2 Won!");
            }
            else if(gamematch[0][1] == 2 && gamematch[1][1] ==3){
                textOutput.setText("Game 1 Won!");
            }

            else if(gamematch[0][1] == 1 && gamematch[1][1] ==3){
                textOutput.setText("Game 2 Won!");
            }
            else if(gamematch[0][1] == 1 && gamematch[1][1] ==2){
                textOutput.setText("Game 1 Won!");
            }



            //reset game
            gamematch[0][0] = 2;
            gamematch[1][0] = 2;
        }
    }
}