package com.gunhansancar.changelanguageexample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;

import com.gunhansancar.changelanguageexample.helper.LocaleHelper;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {
	@BindView(R.id.titleTextView)
	TextView mTitleTextView;
	@BindView(R.id.descTextView)
	TextView mDescTextView;
	@BindView(R.id.aboutTextView)
	TextView mAboutTextView;
	@BindView(R.id.toTRButton)
	Button mToTRButton;
	@BindView(R.id.toENButton)
	Button mToENButton;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		ButterKnife.setDebug(true);
		ButterKnife.bind(this);
	}

	@OnClick(R.id.toTRButton)
	public void onChangeToTRClicked() {
		updateViews("tr");
	}

	@OnClick(R.id.toENButton)
	public void onChangeToENClicked() {
		updateViews("en");
	}

	private void updateViews(String languageCode) {
		LocaleHelper.setLocale(this, languageCode);

		mTitleTextView.setText(R.string.main_activity_title);
		mDescTextView.setText(R.string.main_activity_desc);
		mAboutTextView.setText(R.string.main_activity_about);
		mToTRButton.setText(R.string.main_activity_to_tr_button);
		mToENButton.setText(R.string.main_activity_to_en_button);
	}
}
