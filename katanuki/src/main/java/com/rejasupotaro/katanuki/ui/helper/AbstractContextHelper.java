package com.rejasupotaro.katanuki.ui.helper;

import javax.inject.Inject;

import android.content.Context;
import android.support.v4.app.FragmentActivity;

import com.rejasupotaro.katanuki.KatanukiApplication;

public class AbstractContextHelper {

    private Context mContext;

    @Inject private void setContext(Context context) {
        mContext = context;
    }

    protected Context getContext() {
        return mContext;
    }

    protected FragmentActivity getActivity() {
        return (FragmentActivity) mContext;
    }

    protected KatanukiApplication getApplication() {
        return (KatanukiApplication) mContext;
    }
}
