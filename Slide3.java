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

public class Slide3 extends Fragment {

	RadioButton question3a3;
	Button button3;
	
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
		return inflater.inflate(R.layout.slide3, null);
	}
	
	@Override
	public void onActivityCreated(Bundle savedInstanceState){
		super.onActivityCreated(savedInstanceState);
		question3a3 = (RadioButton)getView().findViewById(R.id.q3a3);
		button3 = (Button)getView().findViewById(R.id.btn3);
		
		final SharedPreferences app_preferences = PreferenceManager.getDefaultSharedPreferences(getActivity());
		button3.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				SharedPreferences.Editor editor = app_preferences.edit();

				if (question3a3.isChecked()) {
					editor.putInt("answer_value3", 1);
				} else {
					editor.putInt("answer_value3", 0);
				}
				editor.commit();
			}
		});
		
		
		
		
	}
}
