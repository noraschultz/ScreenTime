package com.example.android.screentime;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    int scoreKidA = 0;
    int scoreSchoolKidA = 0;
    int scoreHouseKidA = 0;
    int scoreBalanceKidA = 0;
    int scoreScreenKidA = 0;
    int scoreKidB = 0;
    int scoreSchoolKidB = 0;
    int scoreHouseKidB = 0;
    int scoreBalanceKidB = 0;
    int scoreScreenKidB = 0;


    /**
     * Increase the score for Kid A by one point for schoolwork.
     */
    public void addOneForSchoolKidA(View view) {
        scoreSchoolKidA = scoreSchoolKidA + 1;
        displaySchoolForKidA(scoreSchoolKidA);
        scoreKidA = scoreKidA + 1;
        displayForKidA(scoreKidA);
    }

    /**
     * Displays the given score for Kid A's schoolwork.
     */
    public void displaySchoolForKidA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.school_kid_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Increase the score for Kid A by one point for housework.
     */
    public void addOneForHouseKidA(View view) {
        scoreHouseKidA = scoreHouseKidA + 1;
        displayHouseForKidA(scoreHouseKidA);
        scoreKidA = scoreKidA + 1;
        displayForKidA(scoreKidA);
    }

    /**
     * Displays the given score for Kid A's housework.
     */
    public void displayHouseForKidA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.house_kid_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Increase the score for Kid A by one point for balancing activities.
     */
    public void addOneForBalanceKidA(View view) {
        scoreBalanceKidA = scoreBalanceKidA + 1;
        displayBalanceForKidA(scoreBalanceKidA);
        scoreKidA = scoreKidA + 1;
        displayForKidA(scoreKidA);
    }

    /**
     * Displays the given score for Kid A's balancing activities.
     */
    public void displayBalanceForKidA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.balance_kid_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Increase the used screen time score and decrease the overall score by one point for Kid A.
     */
    public void addOneForScreenKidA(View view) {
        scoreScreenKidA = scoreScreenKidA + 1;
        displayScreenForKidA(scoreScreenKidA);
        scoreKidA = scoreKidA - 1;
        displayForKidA(scoreKidA);
    }

    /**
     * Displays the given score for Kid A's used screen time.
     */
    public void displayScreenForKidA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.screen_kid_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Kid A.
     */
    public void displayForKidA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.kid_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Increase the score for Kid B by one point for schoolwork.
     */
    public void addOneForSchoolKidB(View view) {
        scoreSchoolKidB = scoreSchoolKidB + 1;
        displaySchoolForKidB(scoreSchoolKidB);
        scoreKidB = scoreKidB + 1;
        displayForKidB(scoreKidB);
    }

    /**
     * Displays the given score for Kid B's schoolwork.
     */
    public void displaySchoolForKidB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.school_kid_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Increase the score for Kid B by one point for housework.
     */
    public void addOneForHouseKidB(View view) {
        scoreHouseKidB = scoreHouseKidB + 1;
        displayHouseForKidB(scoreHouseKidB);
        scoreKidB = scoreKidB + 1;
        displayForKidB(scoreKidB);
    }

    /**
     * Displays the given score for Kid B's housework.
     */
    public void displayHouseForKidB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.house_kid_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Increase the score for Kid B by one point for balancing activities.
     */
    public void addOneForBalanceKidB(View view) {
        scoreBalanceKidB = scoreBalanceKidB + 1;
        displayBalanceForKidB(scoreBalanceKidB);
        scoreKidB = scoreKidB + 1;
        displayForKidB(scoreKidB);
    }

    /**
     * Displays the given score for Kid B's balancing activities.
     */
    public void displayBalanceForKidB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.balance_kid_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Increase the used screen time score and decrease the overall score by one point for Kid B.
     */
    public void addOneForScreenKidB(View view) {
        scoreScreenKidB = scoreScreenKidB + 1;
        displayScreenForKidB(scoreScreenKidB);
        scoreKidB = scoreKidB - 1;
        displayForKidB(scoreKidB);
    }

    /**
     * Displays the given score for Kid B's used screen time.
     */
    public void displayScreenForKidB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.screen_kid_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Kid B.
     */
    public void displayForKidB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.kid_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Reset the score for both kids back to 0.
     */
    public void reset(View view) {
        scoreKidA = 0;
        displayForKidA(scoreKidA);
        scoreSchoolKidA = 0;
        displaySchoolForKidA(scoreSchoolKidA);
        scoreHouseKidA = 0;
        displayHouseForKidA(scoreHouseKidA);
        scoreBalanceKidA = 0;
        displayBalanceForKidA(scoreBalanceKidA);
        scoreScreenKidA = 0;
        displayScreenForKidA(scoreScreenKidA);
        scoreKidB = 0;
        displayForKidB(scoreKidB);
        scoreSchoolKidB = 0;
        displaySchoolForKidB(scoreSchoolKidB);
        scoreHouseKidB = 0;
        displayHouseForKidB(scoreHouseKidB);
        scoreBalanceKidB = 0;
        displayBalanceForKidB(scoreBalanceKidB);
        scoreScreenKidB = 0;
        displayScreenForKidB(scoreScreenKidB);

    }

}
