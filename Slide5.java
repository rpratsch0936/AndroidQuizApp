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

public class Slide5 extends Fragment{
	
	RadioButton question5a1;
	Button button5;

	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
		return inflater.inflate(R.layout.slide5, null);
	}
	
	@Override
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		
	}
	
	@Override
	public void onActivityCreated(Bundle savedInstanceState){
		super.onActivityCreated(savedInstanceState);
		question5a1 = (RadioButton)getView().findViewById(R.id.q5a1);
		button5 = (Button)getView().findViewById(R.id.btn5);
		
		final SharedPreferences app_preferences = PreferenceManager.getDefaultSharedPreferences(getActivity());
		button5.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				SharedPreferences.Editor editor = app_preferences.edit();

				if (question5a1.isChecked()) {
					editor.putInt("answer_value5", 1);
				} else {
					editor.putInt("answer_value5", 0);
				}
				editor.commit();
			}
		});
	}
	
}
