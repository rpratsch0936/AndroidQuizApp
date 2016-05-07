package com.example.regina.myapp;

import android.support.v4.app.Fragment;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;
public class Slide2 extends Fragment{
	
	RadioButton question2a1;
	Button button2;
	
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
		View v = inflater.inflate(R.layout.slide2, null);
		return v;
	}
	
	@Override
	public void onActivityCreated(Bundle savedInstanceState){
		super.onActivityCreated(savedInstanceState);
		question2a1 = (RadioButton)getView().findViewById(R.id.q2a1);
		button2 = (Button)getView().findViewById(R.id.q2_button);
		
		final SharedPreferences app_preferences = PreferenceManager.getDefaultSharedPreferences(getActivity());
		button2.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				SharedPreferences.Editor editor = app_preferences.edit();

				if (question2a1.isChecked()) {
					editor.putInt("answer_value2", 1);
				} else {
					editor.putInt("answer_value2", 0);
				}
				editor.commit();
			}
		});
	}
}
