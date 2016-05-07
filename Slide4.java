package com.example.regina.myapp;

import android.support.v4.app.Fragment;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioButton;

public class Slide4 extends Fragment{
	
	RadioButton question4a3;
	Button button4;
	
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
		return inflater.inflate(R.layout.slide4, null);
	}
	
	
	@Override
	public void onActivityCreated(Bundle savedInstanceState){
		super.onActivityCreated(savedInstanceState);
		question4a3 = (RadioButton)getView().findViewById(R.id.q4a3);
		button4 = (Button)getView().findViewById(R.id.btn4);
		
		final SharedPreferences app_preferences = PreferenceManager.getDefaultSharedPreferences(getActivity());
		button4.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				SharedPreferences.Editor editor = app_preferences.edit();

				if (question4a3.isChecked()) {
					editor.putInt("answer_value4", 1);
				} else {
					editor.putInt("answer_value4", 0);
				}
				editor.commit();
			}
		});
	}
}
