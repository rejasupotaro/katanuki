package com.rejasupotaro.katanuki.loader;

import android.content.Context;
import android.support.v4.content.AsyncTaskLoader;

import com.google.gson.Gson;
import com.rejasupotaro.katanuki.entity.UserEntity;
import com.rejasupotaro.katanuki.model.User;

public class UserLoader extends AsyncTaskLoader<User>{

    private static final Gson sGson = new Gson();

    private String mUserId;
    private User mUser;

    public UserLoader(Context context, String userId) {
        super(context);
        mUserId = userId;
    }

    @Override
    protected void onStartLoading() {
        if (mUser != null) {
            deliverResult(mUser);
        } else if (takeContentChanged() || mUser == null) {
            forceLoad();
        }
    }

    @Override
    public User loadInBackground() {
        mUser = User.findById(mUserId);
        if (mUser != null) {
            return mUser;
        } else {
            // instead of "HttpRequest.get("http://katanuki.com/user/" + mUserId).body()" for sample
            String json = "{id: \"1\", name: \"rejasupotaro\"}";
            UserEntity entity = sGson.fromJson(json, UserEntity.class);

            mUser = new User(entity);
            mUser.save();

            return mUser;
        }
    }

    @Override
    public void deliverResult(User data) {
        if (isReset()) {
            if (mUser != null) {
                mUser = null;
            }
            return;
        }

        mUser = data;

        if (isStarted()) {
            super.deliverResult(data);
        }
    }
}
