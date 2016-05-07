package com.example.regina.myapp;

/**
 * Created by Regina on 11/24/2015.
 */


    import android.app.Activity;
    import android.content.SharedPreferences;
    import android.os.Bundle;
    import android.preference.PreferenceManager;
    import android.widget.TextView;

public class Score extends Activity{

    TextView question1_score, question2_score, question3_score, question4_score, question5_score, final_score;
    int finalscore;
    String question1;

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.score);
        initControls();
    }

    public void onStart(){
        super.onStart();
    }

    public void initControls(){

        question1_score = (TextView)findViewById(R.id.q1_score);
        question2_score = (TextView)findViewById(R.id.q2_score);
        question3_score = (TextView)findViewById(R.id.q3_score);
        question4_score = (TextView)findViewById(R.id.q4_score);
        question5_score = (TextView)findViewById(R.id.q5_score);
        final_score = (TextView)findViewById(R.id.final_score);

        final SharedPreferences app_preferences = PreferenceManager.getDefaultSharedPreferences(this);

        int q1answer = app_preferences.getInt("answer_value", 0);
        int q2answer = app_preferences.getInt("answer_value2", 0);
        int q3answer = app_preferences.getInt("answer_value3", 0);
        int q4answer = app_preferences.getInt("answer_value4", 0);
        int q5answer = app_preferences.getInt("answer_value5", 0);

        if ( q1answer == 1 ){
            question1_score.setText("Correct");
        } else {
            question1_score.setText("Incorrect");
        }

        if ( q2answer == 1){
            question2_score.setText("Correct");
        } else {
            question2_score.setText("Incorrect ");
        }

        if ( q3answer == 1){
            question3_score.setText("Correct");
        } else {
            question3_score.setText("Incorrect ");
        }

        if ( q4answer == 1){
            question4_score.setText("Correct");
        } else {
            question4_score.setText("Incorrect ");
        }

        if ( q5answer == 1){
            question5_score.setText("Correct");
        } else {
            question5_score.setText("Incorrect ");
        }
        finalscore =  q1answer + q2answer + q3answer + q4answer + q5answer;
        final_score.setText(finalscore + "/5");
    }





}


