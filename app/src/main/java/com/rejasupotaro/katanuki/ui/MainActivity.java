package com.rejasupotaro.katanuki.ui;

import roboguice.activity.RoboActivity;
import roboguice.inject.ContentView;
import android.os.Bundle;
import android.view.Menu;

import com.rejasupotaro.katanuki.R;

@ContentView(R.layout.activity_main)
public class MainActivity extends RoboActivity {

    @Override public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(com.rejasupotaro.katanuki.R.menu.main, menu);
        return true;
    }

}

