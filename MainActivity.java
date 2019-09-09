package com.ebay.mobile.example.test;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity
{
	private TextView textView;
	private Button button;

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	protected void onResume()
	{
		super.onResume();

		textView = findViewById(R.id.textView);
		button = findViewById(R.id.button);
		button.setOnClickListener((view) -> onClick());
	}

	public void hide(View view)
	{

	    textView.setText("Hide me!");
	}

	void onClick()
	{
		boolean isHidden = textView.getVisibility() == View.INVISIBLE;
		textView.setVisibility(isHidden ? View.VISIBLE : View.INVISIBLE);
		button.setText(isHidden ? R.string.button_text_hide : R.string.button_text_show);
	}
}




