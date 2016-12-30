package com.gunhansancar.changelanguageexample;

import android.app.Application;
import android.content.Context;

import com.gunhansancar.changelanguageexample.helper.LocaleHelper;

public class MainApplication extends Application {
	@Override
	protected void attachBaseContext(Context base) {
		super.attachBaseContext(LocaleHelper.onAttach(base, "en"));
	}
}
