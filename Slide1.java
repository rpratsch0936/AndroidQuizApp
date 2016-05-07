package com.example.regina.myapp;

/**
 * Created by Regina on 11/24/2015.
 */




    import android.content.SharedPreferences;
    import android.os.Bundle;
    import android.preference.PreferenceManager;
    import android.support.v4.app.Fragment;
    import android.view.LayoutInflater;
    import android.view.View;
    import android.view.View.OnClickListener;
    import android.view.ViewGroup;
    import android.widget.Button;
    import android.widget.RadioButton;

public class Slide1 extends Fragment{

    RadioButton question1a2;
    Button button1;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View v = inflater.inflate(R.layout.slide1, null);
        return v;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState){
        super.onActivityCreated(savedInstanceState);
        question1a2 = (RadioButton)getView().findViewById(R.id.q1a2);
        button1 = (Button)getView().findViewById(R.id.btnq1);

        button1.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                SharedPreferences.Editor editor = app_preferences.edit();

                if (question1a2.isChecked()) {
                    editor.putInt("answer_value", 1);
                } else {
                    editor.putInt("answer_value", 0);
                }
                editor.commit();
            }
        });

    }

}


