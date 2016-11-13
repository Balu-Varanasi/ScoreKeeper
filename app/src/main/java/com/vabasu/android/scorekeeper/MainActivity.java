package com.vabasu.android.scorekeeper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int scoreIndia = 0, scoreAustralia = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addSixforIndia(View view) {
        scoreIndia = scoreIndia + 6;
        displayForIndia(scoreIndia);
    }

    public void addFourforIndia(View view) {
        scoreIndia = scoreIndia + 4;
        displayForIndia(scoreIndia);
    }

    public void addThreeforIndia(View view) {
        scoreIndia = scoreIndia + 3;
        displayForIndia(scoreIndia);
    }

    public void addTwoforIndia(View view) {
        scoreIndia = scoreIndia + 2;
        displayForIndia(scoreIndia);
    }

    public void addOneforIndia(View view) {
        scoreIndia++;
        displayForIndia(scoreIndia);
    }

    public void addSixforAustralia(View view) {
        scoreAustralia = scoreAustralia + 6;
        displayForAustralia(scoreAustralia);
    }

    public void addFourforAustralia(View view) {
        scoreAustralia = scoreAustralia + 4;
        displayForAustralia(scoreAustralia);
    }

    public void addThreeforAustralia(View view) {
        scoreAustralia = scoreAustralia + 3;
        displayForAustralia(scoreAustralia);
    }

    public void addTwoforAustralia(View view) {
        scoreAustralia = scoreAustralia + 2;
        displayForAustralia(scoreAustralia);
    }

    public void addOneforAustralia(View view) {
        scoreAustralia++;
        displayForAustralia(scoreAustralia);
    }

    public void resetScore(View view) {
        scoreIndia = 0;
        scoreAustralia = 0;
        displayForIndia(scoreIndia);
        displayForAustralia(scoreAustralia);
    }

    public void displayForIndia(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_india_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForAustralia(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_australia_score);
        scoreView.setText(String.valueOf(score));
    }
}