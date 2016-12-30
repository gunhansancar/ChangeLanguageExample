package com.gunhansancar.changelanguageexample;

import android.app.Application;
import android.content.Context;

import com.gunhansancar.changelanguageexample.helper.LocaleHelper;

/**
 * Created by gunhan.sancar on 20/12/2016.
 */

public class MainApplication extends Application {
	@Override
	public void onCreate() {
		super.onCreate();
	}

	@Override
	protected void attachBaseContext(Context base) {
		super.attachBaseContext(LocaleHelper.onAttach(base, "en"));
	}
}
