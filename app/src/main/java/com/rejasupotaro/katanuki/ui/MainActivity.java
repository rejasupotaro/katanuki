package com.rejasupotaro.katanuki.ui;

import javax.inject.Inject;

import roboguice.activity.RoboFragmentActivity;
import roboguice.inject.ContentView;
import android.os.Bundle;
import android.view.Menu;

import com.rejasupotaro.katanuki.R;
import com.rejasupotaro.katanuki.ui.helper.KatanukiActivityHelper;

@ContentView(R.layout.activity_main)
public class MainActivity extends RoboFragmentActivity {

    @Inject KatanukiActivityHelper mHelper;

    @Override public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mHelper.get();
    }

    @Override public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(com.rejasupotaro.katanuki.R.menu.main, menu);
        return true;
    }

}

