package com.gunhansancar.changelanguageexample;

import android.app.Application;

import com.gunhansancar.changelanguageexample.helper.LocaleHelper;

/**
 * Created by gunhan.sancar on 20/12/2016.
 */

public class MainApplication extends Application {
	@Override
	public void onCreate() {
		super.onCreate();
		LocaleHelper.onCreate(this, "en");
	}
}
